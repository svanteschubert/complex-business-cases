/* Copyright 2023 Svante Schubert
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.cen.tc434.issues;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.kohsuke.github.GHIssueBuilder;
import org.kohsuke.github.GHRepository;

import static org.cen.tc434.issues.Csv.removeCsvEncoding;

/** This class reads a specific spreadsheet with ammendment issues for EN16931-1.
 * Every spreadsheet line (issue) is being created as GitHub issue with labels and milestone. */
public class Csv2Github {

    public static void main(String[] args) throws IOException, InterruptedException {
        
        // Get the GitHub repository instance
        GHRepository repository = Github.getRepository();

        // Removes all existing labels
//        Github.removeAllLabels(repository);
//        TimeUnit.SECONDS.sleep(3);
        // Create the repository labels with colors
//        Github.createRepositoryLabels(repository);
//        TimeUnit.SECONDS.sleep(3);
        // Read the issue data as lines from the spreadsheet (as CSV)
        ArrayList<List<String>> allNewIssues = Csv.readCSV();
        
        // Iterate over the lines of issue data
        for (List<String> issueData : allNewIssues) {
            // add issue only if the data is valid (not empty not first header row nor last summary row)
            if (issueData != null && !issueData.isEmpty() && !Csv.isHeader(issueData) && !Csv.isSummary(issueData)) {
                System.out.println("\nIssue data: " + issueData.toString());
                TimeUnit.SECONDS.sleep(3);

                // Get an issue builder
                GHIssueBuilder issueBuilder = repository.createIssue(removeCsvEncoding(issueData.get(Csv.Column.TITLE.getColumnNo())));

                // Add all labels required for this issue based on the issue data
                Github.createIssueLabels(issueBuilder, issueData);

                // Add the issue description
                Github.createIssueDescription(issueBuilder, issueData);


                // Add the milestone to this issue (create one if necessary)
//              Github.createIssueMilestones(issueBuilder, issueData, repository);

                // Push the changes to the GitHub server
                issueBuilder.create();
            }
        }
    }
}
