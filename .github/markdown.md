# GitHub Issue handling: Amendment Impact Analysis

GitHub issues are written in Markdown.

## Markdown

GitHub issues are written in Markdown, being a lightweight and easy-to-use syntax for styling your writing. It includes conventions for

```markdown
Syntax highlighted code block

# Header 1
## Header 2
### Header 3

* Bulleted
* List

1. Numbered
2. List

**Bold** and _Italic_ and `Code` text

[Link](url) and ![Image](src)

#42 is a short reference to issue number 42
```

For more details see [GitHub Flavored Markdown](https://guides.github.com/features/mastering-markdown/).
Helpful the [two pages MarkDown cheat sheet (PDF)](https://guides.github.com/pdfs/markdown-cheatsheet-online.pdf).*

## Creating an Amendment issue

Any TC 434 member, who needs to provide an **"impact analysis"** for one of the amendments, **please use [this template](https://github.com/svanteschubert/CEN-TC-434/issues/new?assignees=SimonsPaul&labels=Impact+Analysis&template=Change_request_and_impact_analysis.md&title=Impact+Analysis+of+Amendment+%2300)**.  As an example, how the [result](https://github.com/svanteschubert/CEN-TC-434/issues?q=is%3Aissue+is%3Aopen+label%3A%22Impact+Analysis%22) might look like, you may view the existing [impact analysis of amendment #10](https://github.com/svanteschubert/CEN-TC-434/issues/52).

A new issue for amendment impact analysis is using a markdown template file.
Within the new issue you need to substitute a few things:

* Adjust the title of the issue
* Adjust 00 with your GitHub issue number in the title
* Please add your text as bold - so it can easier be found read - within the placeholder `**your text**`

## Frequent MarkDown Mistakes

1. There is a blank line surrounding header #header1 and lists
2. **your content** in bold has no white space in-between the content and the two **
3. **paragraph** is the unit of bold, in an amendment answer, there can be multiple paragraphs.
4. We are using lists. If the content below should be on the same level,
   you should a four space indent same as the list.

## GitHub Tips

* Whenever a label/milestone is pressed upon, all related issues are being listed. [More advanced searches](https://help.github.com/en/github/searching-for-information-on-github/searching-issues-and-pull-requests#search-by-label) are possible.
* Very helpful is using the [VSCode editor](https://code.visualstudio.com/download) as MarkDown editor by copying the content into a "temp.md" file and afterwards the content back into the issue). VSCode shows mistakes, give hints and has a better usability.
  Helpful the usage of a SpellChecker within VSCode: Open VSCode, press F1, search for "ext install code-spell-checker" (remove existing '>'), install free extension!
