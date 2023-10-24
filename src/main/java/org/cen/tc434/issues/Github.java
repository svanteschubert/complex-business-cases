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
import java.text.ParseException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.kohsuke.github.*;

/** 
    This class capsuslates the details of interaction with the GitHub API from Kohsuke:
        https://github-api.kohsuke.org/
 */
class Github {

    //original: private static final String REPO_NAME = "svanteschubert/cen-tc-434";
    // Better be safe than sorry..
    private static final String REPO_NAME = "svanteschubert/complex-business-cases";
    private static final Map<String, GHMilestone> milestoneMap = new HashMap<String, GHMilestone>(5);

    static GHRepository getRepository() {
        GHRepository repository = null;
        try {
            // if you are using the default ~/.github configuration file
            // see https://github-api.kohsuke.org/
            // Create your Personal Access Token (PAT) with sufficient rights for private repro access under:
            // Login GitHub -> upper right corner -> Settings -> Developer Settings -> PAT
            GitHub github = GitHubBuilder.fromPropertyFile().build();
            repository = github.getRepository(REPO_NAME);
        } catch (IOException ex) {
             Logger.getLogger(Github.class.getName()).log(Level.SEVERE, null, ex);
        }
        return repository;
    }

    static void removeAllLabels(GHRepository repository) {
        try {
            Iterator<GHLabel> labelIter = repository.listLabels().iterator();
            while (labelIter.hasNext()) {
                GHLabel label = labelIter.next();
                label.delete();
            }
        } catch (IOException ex) {
            Logger.getLogger(Github.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void createRepositoryLabels(GHRepository repository) {
        try {
            // for examples of good basic colors take a look a "The New Defaults" from
            // http://whataboutfood.me/best-of-color-palette-names/
            repository.createLabel("DOMAIN:ExtraData", "bcf5dc");
            repository.createLabel("DOMAIN:FastNEasy", "cc317d");
            repository.createLabel("DOMAIN:General", "84b6ec");
            repository.createLabel("DOMAIN:Grouping", "ff0090"); // Electric
            repository.createLabel("DOMAIN:Payments", "fff200"); //  Yellow
            repository.createLabel("DOMAIN:TaxCalculation", "c7ea46"); // Lime
            repository.createLabel("DOMAIN:TaxCategory", "ff7610");
            repository.createLabel("DOMAIN:TaxExemptions", "fbca03");
            repository.createLabel("DOMAIN:B2B", "0052CC");
            repository.createLabel("Error", "ee0700");
            repository.createLabel("National Law", "eeeee1");
            repository.createLabel("Multiple Countries", "bfe5be");
            repository.createLabel("All Countries", "0e8a15");
            repository.createLabel("Tax Calculation", "c7ea46"); // Lime
            repository.createLabel("All Countries", "0e8a15");
        } catch (IOException ex) {
            Logger.getLogger(Github.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Adding CSV specific labels according to '1' in the columns
     */
    static void createIssueLabels(GHIssueBuilder newIssue, List<String> issueData) {
        // *** check for labels
        String b2b = issueData.get(Csv.Column.B2B.getColumnNo());
        if (b2b != null && !b2b.isEmpty()) {
            newIssue.label("DOMAIN:B2B");
        }

        /*
        String domain = issueData.get(Csv.Column.DOMAIN.getColumnNo());
        if (domain != null && !domain.isEmpty()) {
            newIssue.label("DOMAIN:" + domain);
        }
        String error = issueData.get(Csv.Column.ERROR.getColumnNo());
        if (error != null && !error.isEmpty()) {
            newIssue.label("Error");
        }
        String nl = issueData.get(Csv.Column.NATIONAL_LAW.getColumnNo());
        if (nl != null && !nl.isEmpty()) {
            newIssue.label("National Law");
        }
        String mc = issueData.get(Csv.Column.MULTIPLE_COUNTRIES.getColumnNo());
        if (mc != null && !mc.isEmpty()) {
            newIssue.label("Multiple Countries");
        }
        String ac = issueData.get(Csv.Column.ALL_COUNTRIES.getColumnNo());
        if (ac != null && !ac.isEmpty()) {
            newIssue.label("All Countries");
        }
        String tc = issueData.get(Csv.Column.TAX_CALCULATION.getColumnNo());
        if (tc != null && !tc.isEmpty()) {
            newIssue.label("Tax Calculation");
        } */
    }


    /** Adding CSV data as issue description */
    static void createIssueDescription(GHIssueBuilder newIssue, List<String> issueData) {
        // *** check for description data
        StringBuilder sb = new StringBuilder();

        String background = issueData.get(Csv.Column.BACKGROUND.getColumnNo());
        background = background.replace("äää", "'").replace("üüü", ";").replace("ööö", "\n");
        if (background != null && !background.isEmpty()) {
            sb.append("### Background \n\n");
            sb.append(background).append("\n\n");
        }

        String objective = issueData.get(Csv.Column.OBJECTIVE.getColumnNo());
        objective = objective.replace("äää", "'").replace("üüü", ";").replace("ööö", "\n");
        if (objective != null && !objective.isEmpty()) {
            sb.append("### Objective \n\n");
            sb.append(objective).append("\n\n");
        }

        String challenges = issueData.get(Csv.Column.CHALLENGES.getColumnNo());
        challenges = challenges.replace("äää", "'").replace("üüü", ";").replace("ööö", "\n");
        if (challenges != null && !challenges.isEmpty()) {
            sb.append("### Challenges \n\n");
            sb.append(challenges).append("\n\n");
        }

        String questions = issueData.get(Csv.Column.OPEN_QUESTIONS.getColumnNo());
        questions = questions.replace("äää", "'").replace("üüü", ";").replace("ööö", "\n");
        if (questions != null && !questions.isEmpty()) {
            sb.append("### Open Questions \n\n");
            sb.append(questions).append("\n\n");
        }

        String approaches = issueData.get(Csv.Column.APPROACHES.getColumnNo());
        approaches = approaches.replace("äää", "'").replace("üüü", ";").replace("ööö", "\n");
        if (approaches != null && !approaches.isEmpty()) {
            sb.append("### Approaches \n\n");
            sb.append(approaches).append("\n\n");
        }

        String furtherProcedure = issueData.get(Csv.Column.FURTHER_PROCEDURE.getColumnNo());
        furtherProcedure = furtherProcedure.replace("äää", "'").replace("üüü", ";").replace("ööö", "\n");
        if (furtherProcedure != null && !furtherProcedure.isEmpty()) {
            sb.append("### Further Procedure \n\n");
            sb.append(furtherProcedure).append("\n\n");
        }

        String feedback = issueData.get(Csv.Column.FEEDBACK.getColumnNo());
        feedback = feedback.replace("äää", "'").replace("üüü", ";").replace("ööö", "\n");
        if (feedback != null && !feedback.isEmpty()) {
            sb.append("### Feedback \n\n");
            sb.append(feedback).append("\n\n");
        }

        newIssue.body(sb.toString());

        /*
        String domain = issueData.get(Csv.Column.DOMAIN.getColumnNo());
        if (domain != null && !domain.isEmpty()) {
            newIssue.label("DOMAIN:" + domain);
        }
        String error = issueData.get(Csv.Column.ERROR.getColumnNo());
        if (error != null && !error.isEmpty()) {
            newIssue.label("Error");
        }
        String nl = issueData.get(Csv.Column.NATIONAL_LAW.getColumnNo());
        if (nl != null && !nl.isEmpty()) {
            newIssue.label("National Law");
        }
        String mc = issueData.get(Csv.Column.MULTIPLE_COUNTRIES.getColumnNo());
        if (mc != null && !mc.isEmpty()) {
            newIssue.label("Multiple Countries");
        }
        String ac = issueData.get(Csv.Column.ALL_COUNTRIES.getColumnNo());
        if (ac != null && !ac.isEmpty()) {
            newIssue.label("All Countries");
        }
        String tc = issueData.get(Csv.Column.TAX_CALCULATION.getColumnNo());
        if (tc != null && !tc.isEmpty()) {
            newIssue.label("Tax Calculation");
        } */
    }
    
/*
    static void createIssueMilestones(GHIssueBuilder newIssue, List<String> issueData, GHRepository repository) {
        // check for milestone                
        String milestone = issueData.get(Csv.Column.MILESTONE.getColumnNo());
        // System.out.println("IssuesMilestone:  " + milestone);
        if (milestone != null && !milestone.isEmpty()) {
            GHMilestone ghmilestone = milestoneMap.get(milestone);
            if (ghmilestone == null) {
                try {
                    Date date = Csv.DATE_FORMATTER.parse(milestone);
                    // System.out.println("DATE: " + date);
                    ghmilestone = repository.createMilestone(milestone, milestone);
                    ghmilestone.setDueOn(date);
                    milestoneMap.put(milestone, ghmilestone);
                } catch (ParseException ex) {
                    Logger.getLogger(Csv2Github.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Github.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            newIssue.milestone(ghmilestone);
        }
    }
    */
}
