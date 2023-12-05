# complex-business-cases

## Introduction

[The complex business cases - currently French and German B2B requirements -](https://github.com/svanteschubert/complex-business-cases/issues) are the input for the upcoming B2B EN16931 extension to be created by CEN TC 434 and sponsored by EC.
The requirements were initially collected by KoSIT (Lars Rölker-Denker) and FeRD/AWV (Daniel Vinz) in a spreadsheet covering "complex business cases" for e-invoicing! 
Additional requirements were gathered in France by Cyrille Sautereau for the [German/French Factur-X extension](https://fnfe-mpe.org/factur-x/factur-x_en/).

The spreadsheet was imported as GitHub issues - like 3 years before for the EN16931 amendments of CEN TC 434 WG 1 - to be able to discuss/collaborate more efficiently in the CEN TC.
[The import from spreadsheet to GitHub issues is open-source and is described in detail](./src/main/java/org/cen/tc434/issues/Csv2Github.md).

## Issue Overview

There are currently three groups of issues:

1. The GitHub Issues 1 to 34 are from the original German spreadsheet.
   The German requirements have still draft status, as the data needs clean up and extension.
2. The GitHub Issues 35 to 39 are newly added by the industry (precisely by the Institute of digitalization of tax by Jan Koerner in charge).
3. The GitHub Issues 40 to 77 were taken from the [French Government B2B requirements](docs/fr/README.md)
   The details from the French requirements coming from the use cases of the French government and currently most advanced.

The structure of the German issue was derived by the columns of the spreadsheet, but still might be changed:

1. Background
2. Objective
3. Challenges
4. Open Questions
5. Approaches
6. Further Procedure
7. Feedback

## What's done

* 05.12.2023: All French requirements 40 to #77 were filled with the official description of the use cases 

## What's next

* The German requirements (1-34) - which was translated from German to English by DeepML - should be reviewed on readability and clearness.
  If there is a duplication, they should be marked with our new label **Duplicate**.
* Daniel mentioned that the requirement "Early Payment Discount" AKA "German Skonto" will be added to our requirements
* We shoud match our GitHub issueswith the EN16931 core amendment list:
  ![image](https://github.com/svanteschubert/complex-business-cases/assets/825051/02058ee2-4fb3-4330-821c-baa490731a97)
  For each EN16931 amendment we need to decide:
    1. Does it needs to be added to this Github?
    1. Which issue needs a label?
        1. If red - which means rejected to the core - the label should be **EN16931-B2B-Extension**
        2. Otherwise thelabel should be **EN16931-Core-Amendment**  
* If the requirements are cleaned-up, this repository will be opened for public review of EU businesses

## Editing & Cleaning up the Issues

If base information is being changed, please add/change the inital description:
![How to edit an issue description](./src/test/resources/GitHub-Issue-Editing.png)

The formation is done by text markdown, which is quite straight forward:
https://docs.github.com/de/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax

## Problem of Metadata (how to identify issues via labels)

Another interesting topic/task is to label/sort the issues by categories/labels/"different view angles" I have overtaken the labels from CEN TC 434 (also editorial states) and added some sectors today from a presentation by Edmund Gray: https://github.com/svanteschubert/complex-business-cases/label
