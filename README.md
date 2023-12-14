# complex-business-cases

## Introduction

[The complex business cases - currently French and German B2B requirements -](https://github.com/svanteschubert/complex-business-cases/issues) are the input for the upcoming B2B EN16931 extension to be created by CEN TC 434 and sponsored by EC.
The requirements were initially collected by KoSIT (Lars Rölker-Denker) and FeRD/AWV (Daniel Vinz) in a spreadsheet covering "complex business cases" for e-invoicing! 
Additional requirements - the most elaborated - were gathered from the [French government](https://www.impots.gouv.fr/specifications-externes-b2b).
Cyrille Sautereau is currently working on the alignment the extensions of the [German/French Factur-X extension](https://fnfe-mpe.org/factur-x/factur-x_en/) the business requirements.

The spreadsheet was imported as GitHub issues - like 3 years before for the EN16931 amendments of CEN TC 434 WG 1 - to be able to discuss/collaborate more efficiently in the CEN TC.
[The import from spreadsheet to GitHub issues is open-source and is described in detail](./src/main/java/org/cen/tc434/issues/Csv2Github.md).

## Issue Overview

There are currently the following groupings of issues:

1. The GitHub Issues 1 to 34 are based on the German spreadsheet.
   The German requirements are still not fully elaborated, some issues will be closed soon as only addressing a problem of a CIUS (XRechnung / ZUGFeRD).
2. The GitHub Issues 35 to 39 are newly added by the industry (precisely by the Institute of digitalization of tax by Jan Koerner in charge).
3. The GitHub Issues 40 to 77 were taken from the [French Government B2B requirements](docs/fr/README.md)
   The details from the French requirements coming from the use cases of the French government and currently most advanced.
4. New GitHub Issue 78 "Early Payment Discounts" or "German Skonto" should be part of the EN16931 B2G Core

The Issue structure as in #40 is twofold "Background" and an optional Change Request", if new data nodes are required for EN16931.
The former structure of the German issue was derived by the columns of the spreadsheet:

1. Background
2. Objective
3. Challenges
4. Open Questions
5. Approaches
6. Further Procedure
7. Feedback

## What's done

* 05.12.2023: All French requirements 40 to #77 were filled with the official description of the use cases.
* 13.12.2023: The GitHub become public during along the Factur-X F2F meeting in Paris.

## What's next

* The German requirements (1-34) - which was translated from German to English by DeepML - are being reviewed on readability and clearness.
  If there is a duplication, they should be marked with our new label **Duplicate**.
  The former owner Daniel and Lars might be first in line to solve this problem.
* We should compare our GitHub issues with the EN16931 core amendment list:
  ![image](https://github.com/svanteschubert/complex-business-cases/assets/825051/02058ee2-4fb3-4330-821c-baa490731a97)
  For each EN16931 amendment we need to decide:
    1. Does it needs to be added to this Github?
    1. Which issue needs a label?
        1. If red - which means rejected to the core - the label should be **EN16931-B2B-Extension**
        2. Otherwise the label should be **EN16931-Core-Amendment**  
* The French use case specification 2.3 just refers to six business groups: EXT-FR-FE-BG-01 to EXT-FR-FE-BG-05 and EXT-FR-FE-BG-10.
But [their spreadsheet](https://svanteschubert.github.io/complex-business-cases/fr/20231023_EN16931-EXTENDED-CTC-FR.html#EXT-FR-FE-01) points out a total of 175 business terms (BT)/ business groups (BG)!
All new BT/BG (with prefix EXT-FR-FE-) should be mapped to business cases to be certain to present them to CEN and let them become part of the EN16931 standard.

## Editing & Cleaning up the Issues

We should follow the four eye principle and every editor should get a review by a second expert to improve overall quality.
If base information is being changed, please add/change the initial description:
![How to edit an issue description](./src/test/resources/GitHub-Issue-Editing.png)

The formation is done by text markdown, which is quite straight forward:
https://docs.github.com/de/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax

## Problem of Metadata (how to identify issues via labels)

Another interesting topic/task is to label/sort the issues by categories/labels/"different view angles" I have overtaken the labels from CEN TC 434 (also editorial states) and added some sectors today from a presentation by Edmund Gray: https://github.com/svanteschubert/complex-business-cases/label
