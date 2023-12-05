

|<p>**IT Agency**</p><p>**State financial**</p>|
| -: |
|<p></p><p></p><p></p><p>31/07/2023</p>|
|<p>External specifications file for electronic invoicing</p><p></p><p>Use cases</p>|









































1/60

**Table of contents**


![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.001.png)

1. [General presentation	4](#_bookmark0)
   1. [Presentation of billing circuits and the players involved	4](#_bookmark1)
   1. [Presentation of appendices used in use cases	4](#_bookmark2)
   1. [Presentation of invoices taken into account in use cases	5](#_bookmark3)
2. [Description of main use cases	6](#_bookmark4)
   1. [Summary table of use cases	6](#_bookmark5)
   1. [Treatment of the main cases	7](#_bookmark6)
      1. [Case 1: Multi-order / Multi-delivery	7](#_bookmark7)
      1. [Case n°2: invoice already paid by buyer or third party designated for invoicing at time of issue](#_bookmark8)

[of invoice	7](#_bookmark8)

1. [Case 3: Invoice to be paid by a third party designated at the time of invoicing	8](#_bookmark10)
1. [Case n°4: Invoice to be paid by the buyer and partially paid by a third party known to the](#_bookmark12)

[invoicing (subsidy, insurance, etc.)	10](#_bookmark12)

1. [Cases 5 and 6: Expenses paid by employees (excluding purchasing cards or corporate cards), with invoice in the ](#_bookmark14)[company's ](#_bookmark14)[name ](#_bookmark14)[(*e-invoicing*) or without invoice (simple receipt) (*e-reporting* of ](#_bookmark14)[off-invoice](#_bookmark14)[ transaction data](#_bookmark14)[) 11](#_bookmark14)
1. [Case n°7: Invoice following a purchase with an embedded card (purchasing card)	12](#_bookmark16)
1. [Cases 8 to 10: Invoices payable to a third party (including factoring)	13](#_bookmark18)
1. [Case n°11 : Invoice with "Addressed to" (INVOICED) different from the buyer (BUYER)	20](#_bookmark25)
1. [Case 12: Transparent intermediary manages invoices on behalf of its purchasing principal	21](#_bookmark27)
1. [Cases 13 and 14: Subcontracting and co-contracting (B2B/B2C)	22](#_bookmark29)
1. [Case n°15 : Sales invoice following an order / payment from a third party on behalf of the BUYER](#_bookmark37)

[(BUYER)	29](#_bookmark37)

1. [Case 16: Disbursement invoice for reimbursement of sales invoice paid by third party	30](#_bookmark39)
1. [Case 17a: Invoice payable to a third-party payment intermediary (e.g. Marketplace)	30](#_bookmark40)
1. [Case 17b: Invoice payable to a third party, payment intermediary and billing mandate	33](#_bookmark42)
1. [Case 18: Debit note management	34](#_bookmark44)
1. [Case 19a: Invoice issued with billing mandate	34](#_bookmark45)
1. [Case 19b: Self-billing	38](#_bookmark48)
1. [Cases 20 and 21: Down-payment invoice and final invoice after down-payment	41](#_bookmark50)
1. [Case 22a: Invoice paid at a discount for services subject to VAT](#_bookmark52)

[is due to the collection of	43](#_bookmark52)

1. [Case 22b: Invoice paid with discount for the supply of goods (or PS with VAT option ](#_bookmark54)[on ](#_bookmark54)[debits)	 44](#_bookmark54)
1. [Case 23: Self-billing flow between a private individual and a professional	45](#_bookmark56)
1. [Case 24: Managing deposits	45](#_bookmark57)
1. [Case 25: Gift voucher and card management	46](#_bookmark58)
1. [Case 26: Invoices with contractual reserve clause	48](#_bookmark61)
1. [Case 27: Managing toll tickets	48](#_bookmark62)
1. [Case 28: Managing restaurant bills	49](#_bookmark63)
1. [Case n°29: Single taxpayer within the meaning of article 256 C of the CGI	50](#_bookmark67)
1. [Case n°30: VAT already collected - Transactions initially processed as B2C *e-reporting*, subject to a](#_bookmark68)

[invoice *a posteriori*	51](#_bookmark68)

1. [Case 31: "Mixed" invoices showing a main transaction and an ancillary transaction	52](#_bookmark70)
1. [Case 32: Monthly payments	54](#_bookmark73)
1. [Case 33: Transactions subject to the margin system	58](#_bookmark78)
1. [Case 34: Partial collection and collection cancellation	59](#_bookmark80)
1. [Case 35: Author's notes	60](#_bookmark81)
1. [Case 36: Operations subject to professional secrecy and exchanges of sensitive data	60](#_bookmark82)
2. [Contact	60](#_bookmark83)



**Table of figures**

[Figure 1: Invoice already paid by buyer or third party designated for invoicing	8](#_bookmark9)

[Figure 2: Invoice to be paid by a third party designated for invoicing	9](#_bookmark11)

[Figure 3: Invoice to be paid by the buyer and partially paid by a third party known at the time of invoicing](#_bookmark13)

[(subsidy, insurance ...)	10](#_bookmark13)

[Figure 4: Expenses paid by employees	12](#_bookmark15)

[Figure 5: Invoice following a card purchase	12](#_bookmark17)

[Figure 6: Invoice payable to a third party designated for invoicing (Option 1)	14](https://digiplace.sharepoint.com/sites/WE-AIFE-DAEL4-ACCOMPAGNEMENTB2B/Documents%20partages/3%20-%20Accompagnement%20fonctionnel/03%20-%20SpÃ©cifications%20externes%20%26%20exemples/Version%20de%20travail/VF%20sans%20suivi%20des%20modifs/Dossier%20de%20spÃ©cifications%20externes%20de%20la%20facturation%20Ã©lectronique%20-%20Cas%20d%27usage_v2.3.docx#_Toc141708111)

[Figure 7: Invoice payable to a third party determined at time of invoicing (Option 1)	16](#_bookmark20)

[Figure 8: Bill to be paid to a third party designated for billing (Option 2)	17](#_bookmark21)

[Figure 9: Invoice payable to a third party unknown at time of invoicing	19](#_bookmark24)

[Figure 10: Invoice with "Addressed to" (INVOICED) different from buyer (BUYER)	20](#_bookmark26)

[Figure 11: Transparent intermediate	22](#_bookmark28)

[Figure 12: Invoice (F1) to be paid by a third party (B2B subcontracting)	24](#_bookmark31)

[Figure 13: Invoice (F2) to be paid by a third party (B2B subcontracting)	24](#_bookmark32)

[Figure 14: Invoice to be paid by a third party (case of subcontracting with direct payment in B2G)	25](#_bookmark33)

[Figure 15: Invoice to be paid by a third party (B2B co-contracting)	27](#_bookmark35)

[Figure 16: Invoice to be paid by a third party (B2G co-contracting)	28](#_bookmark36)

[Figure 17: Sales invoice following order/payment from a third party on behalf of the BUYER (purchase)](#_bookmark38)

[media, consulting fees)	29](#_bookmark38)

[Figure 18: Invoice payable to a third party, payment intermediary	31](#_bookmark41)

[Figure 19: Third-party invoice, payment intermediary and billing mandate	33](#_bookmark43)

[Figure 20: Invoice issued with billing mandate (option 1)	35](#_bookmark46)

[Figure 21: Invoice issued with billing mandate (option 2)	37](#_bookmark47)

[Figure 22: Self-billing	39](#_bookmark49)

[Figure 23: Down-payment invoice and final invoice after down-payment	41](#_bookmark51)

[Figure 24: Invoice paid with discount (service provision, VAT due on collection)	43](#_bookmark53)

[Figure 25: Invoice paid with discount (case of supply of goods or services with VAT on ](#_bookmark55)[debits)	 45](#_bookmark55)

[Figure 26: Management of single-use vouchers	47](#_bookmark59)

[Figure 27: Management of multiple-use vouchers	48](#_bookmark60)

[Figure 28: Managing restaurant bills	49](#_bookmark64)

[Figure 29: Transaction data declaration for notes under 150 euros	50](#_bookmark65)

[Figure 30: Issuing/transmitting an electronic invoice for bills over 150 euros	50](#_bookmark66)

[Figure 31: Duplicate invoice management	52](#_bookmark69)

[Figure 32: Mixed invoice with main and accessory operations categorized as a sale (case of a touch-up)](#_bookmark71)

[for sale)	53](#_bookmark71)

[Figure 33: Invoice with main operation = PS (case of rework with or without sale)	54](#_bookmark72)

[Figure 34: Monthly payments and additional payments for B2C (option 1a)	55](#_bookmark74)

[Figure 35: Monthly B2C payments and additional payments (option 1b)	56](#_bookmark75)

[Figure 36: Monthly payments and final overpayment for a B2C transaction (option 2.a)	57](#_bookmark76)

[Figure 37: Monthly payments and final overpayment for a B2C transaction (option 2.b)	58](#_bookmark77)

[Figure 38: Transactions subject to the margin system	59](#_bookmark79)



1. # <a name="_bookmark0"></a>**General presentation**

1. <a name="_bookmark1"></a>**Presentation of billing circuits and the players involved**


The use cases presented below evolve in three possible circuits (described in the "Y diagram" section) on the public billing portal:

0. Circuit A
0. Circuit B
0. The C

In most cases, operation is illustrated with circuit C.

Various players play a part in this:

0. The supplier is the one who provides the product or service billed for,
0. The buyer is the person who has purchased the product or service; in most cases, he or she pays the invoice received from the supplier or third party,
0. The subcontractor is the entity that delivers the product or performs the service proposed by the supplier/contractor,
0. The third party is an intermediary entity between the parties involved in the invoice. It may be a third-party biller, a third-party receiver of the invoice, a third-party payer, etc.
0. PDPs are partner dematerialization platforms used by the supplier, third party or buyer,
0. The PPF is the public billing portal.


1. ## <a name="_bookmark2"></a>**Presentation of appendices used in use cases**

These use cases are based on the following appendices to the external specifications:

0. "Appendix 1 - Semantic format FE e-invoicing.xlsx", including the following tabs:

   0. Version: recording of changes as the appendix is updated.
   0. Notice: how the file works
   0. FE - Flux 2 - UBL: semantic format for UBL for flux 2
   0. FE - Flux 1 - UBL: semantic format for UBL for flux 1
   0. FE - Flux 2 - CII: semantic format for CII for flux 2
   0. FE - Stream 1 - CII: semantic format for CII for stream 1
   0. Factur-X EN CII D16B - Flow 2: semantic format for Factur-X for flow 2
   0. Factur-X EN CII D16B - Flow 1: semantic format for Factur-X for flow 1

0. "Appendix 2 - Semantic format FE CDV - Flux 6.xlsx", including the following tabs:

   0. Version: recording of changes as the appendix is updated.
   0. Notice: explains how the file works
   0. CDV FE - CI ARM: semantic format of the CDV message
   0. By-laws: summary of possible by-laws by business purpose

0. *"Appendix 3 - Semantic format FE annuaire.xlsx*" includes the following tabs:

   0. Version: recording of changes as the appendix is updated.
   0. Notice: explains how the file works
   0. FE Directory feed

0. "Appendix 4 - Semantic format FE e-reporting - Flux 8.xlsx", including the following tabs:

   0. Version: recording of changes as the appendix is updated.
   0. Notice: explains how the file works
   0. B2B - Flux 8 - UBL : semantic format for UBL
   0. B2B - Flux 8 - CII: semantic format for CII
   0. Factur-X EN CII D16B - Flow 8: semantic format for Factur-X

0. "Appendix 5 - Semantic format FE e-reporting - Flux 9.xlsx", including the following tabs:

   0. Version: recording of changes as the appendix is updated.
   0. Notice: explains how the file works
   0. B2B - Flux 9 - UBL : semantic format for UBL
   0. B2B - Flux 9 - CII: semantic format for CII
   0. Factur-X EN CII D16B - Flow 9: semantic format for Factur-X

0. "Appendix 6 - Semantic format FE e-reporting - Flux 10.xlsx", including the following tabs:

   0. Version: recording of changes as the appendix is updated.
   0. Notice: explains how the file works
   0. E - REPORTING - Flow 10

0. "Appendix 7 - Management rules.xlsx", including the following tabs:

   0. Version: recording of changes as the appendix is updated.
   0. PPF management rules: Specific management rules
   0. EN16931 rules: Standard management rules
   0. EN16931 Codelists: Reference lists available for each data item (BT) giving rise to a reference list
   0. Table of reasons for refusal: Detailed description of reasons for refusal of invoice


1. ## <a name="_bookmark3"></a>**Presentation of invoices taken into account in use cases**

The dematerialized exchange of domestic B2B invoices involves several types of invoice:

Simple invoices :

0. Commercial invoice ;
0. Self-billing ;
0. Factored invoice (subject to assignment of receivables) ;
0. Self-billed factoring ;

Down-payment invoices :

0. Down payment invoice ;
0. Self-billed down-payment invoice ;

Amending invoices :

0. Amending invoice ;
0. Self-billed correction invoice ;
0. Adjustment invoice ;
0. Self-invoiced factoring ;

Credit notes :

0. To have ;
0. Self-billed credit ;
0. Factored-in credit ;
0. Self-billed credit factored ;
0. Advance invoice credit ;

Discounts :

0. Global discounts (applicable to B2G only)

2. # <a name="_bookmark4"></a>**Description of main use cases**

1. ## <a name="_bookmark5"></a>**Summary table of use cases**


<table><tr><th colspan="1" valign="top"><b>Category</b></th><th colspan="1" valign="top"><b>ID</b></th><th colspan="1" valign="top"><b>Use cases</b></th></tr>
<tr><td colspan="1" valign="top">Multi-order / Multi-delivery</td><td colspan="1" valign="top">1</td><td colspan="1" valign="top">[Case 1: Multi-order / Multi-delivery](#_bookmark7)</td></tr>
<tr><td colspan="1" valign="top">Invoice already paid by a third party or the buyer</td><td colspan="1" valign="top">2</td><td colspan="1" valign="top">[Case n°2: invoice already paid by buyer or third party designated for invoicing at time ](#_bookmark8)[of ](#_bookmark8)[invoice issue](#_bookmark8)</td></tr>
<tr><td colspan="1" rowspan="2" valign="top">Bill to be paid by a third party</td><td colspan="1" valign="top">3</td><td colspan="1" valign="top">[Case 3: Invoice to be paid by a third party designated at the time of invoicing](#_bookmark10)</td></tr>
<tr><td colspan="1" valign="top">4</td><td colspan="1" valign="top">[Case n°4 : Invoice to be paid by the buyer and partially ](#_bookmark12)[covered ](#_bookmark12)[by a third party ](#_bookmark12)[known at the time of invoicing (subsidy, insurance, etc.](#_bookmark12)[)](#_bookmark12)</td></tr>
<tr><td colspan="1" valign="top">Costs paid by third parties with invoice</td><td colspan="1" valign="top">5</td><td colspan="1" rowspan="2" valign="top">[Cases 5 and 6: Expenses paid by employees (excluding purchasing cards), with ](#_bookmark14)[invoice in the company's ](#_bookmark14)[name (<i>e-invoicing</i>) or without invoice (simple receipt) (](#_bookmark14)[<i>e-reporting of</i> off-invoice transaction data)](#_bookmark14)</td></tr>
<tr><td colspan="1" valign="top">Costs paid by third parties without invoice</td><td colspan="1" valign="top">6</td></tr>
<tr><td colspan="1" valign="top">Bill paid by a third party</td><td colspan="1" valign="top">7</td><td colspan="1" valign="top">[Case n°7: Invoice following a purchase with an embedded card (purchasing card)](#_bookmark16)</td></tr>
<tr><td colspan="1" rowspan="3" valign="top">Bill payable to a third party</td><td colspan="1" valign="top">8</td><td colspan="1" valign="top">[Case 8: Invoice payable to a third party determined at the time of invoicing (factoring, ](#_bookmark19)[cash pooling)](#_bookmark19)</td></tr>
<tr><td colspan="1" valign="top">9</td><td colspan="1" valign="top">[Case n°9: Invoice to be paid to a third party known at the time of invoicing, who also manages the ](#_bookmark22)[order/receipt, or even the invoicing (Distributor/Depositary).](#_bookmark22)</td></tr>
<tr><td colspan="1" valign="top">10</td><td colspan="1" valign="top">[Case 10: Invoice payable to a third party unknown at time of invoicing (subrogation by a factor ](#_bookmark23)[unknown at time of ](#_bookmark23)[invoice creation)](#_bookmark23)</td></tr>
<tr><td colspan="1" valign="top">Invoice with "addressed to" other than buyer</td><td colspan="1" valign="top">11</td><td colspan="1" valign="top">[Case n°11 : Invoice with "Addressed to" (INVOICED) different from the buyer (BUYER)](#_bookmark25)</td></tr>
<tr><td colspan="1" valign="top">Transparent intermediate</td><td colspan="1" valign="top">12</td><td colspan="1" valign="top">[Case n°12: Transparent intermediary handling invoices for its ](#_bookmark27)[purchasing ](#_bookmark27)[principal](#_bookmark27)</td></tr>
<tr><td colspan="1" valign="top">Direct payment subcontract invoice</td><td colspan="1" valign="top">13</td><td colspan="1" valign="top">[Case 13: Invoice to be paid by a third party (subcontracting with direct payment or ](#_bookmark30)[delegated payment)](#_bookmark30)</td></tr>
<tr><td colspan="1" valign="top">Co-contracting invoice</td><td colspan="1" valign="top">14</td><td colspan="1" valign="top">[Case n° 14: Invoice to be paid by a third party (co-contracting)](#_bookmark34)</td></tr>
<tr><td colspan="1" rowspan="2" valign="top"><p>Invoice following order</p><p>/ Third-party payment on behalf of the buyer</p></td><td colspan="1" valign="top">15</td><td colspan="1" valign="top"><p>[Case n°15 : Sales invoice following an order/payment from a third party on behalf of the company.](#_bookmark37)</p><p>[BUYER](#_bookmark37)</p></td></tr>
<tr><td colspan="1" valign="top">16</td><td colspan="1" valign="top">[Case 16: Disbursement invoice for reimbursement ](#_bookmark39)[of ](#_bookmark39)[sales invoice paid by ](#_bookmark39)[third party](#_bookmark39)</td></tr>
<tr><td colspan="1" valign="top">Invoice issued by a third-party payment intermediary</td><td colspan="1" valign="top">17a</td><td colspan="1" valign="top">[Case 17a: Invoice payable to a third-party payment intermediary (e.g. ](#_bookmark40)[Marketplace](#_bookmark40)[)](#_bookmark40)</td></tr>
<tr><td colspan="1" valign="top">Third-party invoices, payment intermediaries and billing mandates</td><td colspan="1" valign="top">17b</td><td colspan="1" valign="top"><p></p><p>[Case 17b: Invoice payable to a third party, payment intermediary and billing mandate](#_bookmark42)</p></td></tr>
<tr><td colspan="1" valign="top">Debit notes</td><td colspan="1" valign="top">18</td><td colspan="1" valign="top">[Case 18: Debit note management](#_bookmark44)</td></tr>
<tr><td colspan="1" valign="top">Invoices issued on behalf of third parties</td><td colspan="1" valign="top">19a</td><td colspan="1" valign="top">[Case 19a: Invoice issued with billing mandate](#_bookmark45)</td></tr>
<tr><td colspan="1" valign="top">Self-billing</td><td colspan="1" valign="top">19b</td><td colspan="1" valign="top">[Case 19b: Self-billing](#_bookmark48)</td></tr>
<tr><td colspan="1" rowspan="2" valign="top">Down payment invoice</td><td colspan="1" valign="top">20</td><td colspan="1" rowspan="2" valign="top">[Cases 20 and 21: Down-payment invoice and final invoice after down-payment](#_bookmark50)</td></tr>
<tr><td colspan="1" valign="top">21</td></tr>
<tr><td colspan="1" rowspan="2" valign="top">Invoice with discount</td><td colspan="1" valign="top">22a</td><td colspan="1" valign="top">[Case 22a](#_bookmark52)[:](#_bookmark52)[ Invoice paid with discount ](#_bookmark52)[for ](#_bookmark52)[services for ](#_bookmark52)which [VAT is due on collection](#_bookmark52)</td></tr>
<tr><td colspan="1" valign="top">22b</td><td colspan="1" valign="top">[Case 22b: Invoice paid with discount for the supply of goods (or PS with ](#_bookmark54)[VAT option on debits)](#_bookmark54)</td></tr>
<tr><td colspan="1" valign="top">Self-billing between an individual and a professional</td><td colspan="1" valign="top">23</td><td colspan="1" valign="top"><p></p><p>[Case 23: Self-billing flow between a private individual and a professional](#_bookmark56)</p></td></tr>
<tr><td colspan="1" valign="top">Deposit</td><td colspan="1" valign="top">24</td><td colspan="1" valign="top">[Case 24: Managing deposits](#_bookmark57)</td></tr>
<tr><td colspan="1" valign="top">Gift vouchers and cards</td><td colspan="1" valign="top">25</td><td colspan="1" valign="top">[Case 25: Gift voucher and card management](#_bookmark58)</td></tr>
</table>

|Invoices with contractual reserve clause|26|[Case 26: Invoices with contractual reserve clause](#_bookmark61)|
| :- | :- | :- |
|Toll tickets|27|[Case 27: Managing toll tickets](#_bookmark62)|
|Restaurant notes|28|[Case 28: Managing restaurant bills](#_bookmark63)|
|Single taxpayer and members of the single taxpayer|29|<p></p><p>[Case n°29: Single taxpayer within the meaning of article 256 C of the CGI](#_bookmark67)</p>|
|*E-reporting* operation covered by an invoice or "VAT already collected".|30|<p>[Case n°30 : VAT already collected - Transactions initially processed in B2C *e-reporting*, now subject to VAT.](#_bookmark68)</p><p>[The following are invoiced *after the fact*](#_bookmark68)</p>|
|Mixed invoices|31|[Case 31: "Mixed" invoices showing a main transaction and an ](#_bookmark70)[accessory ](#_bookmark70)[transaction](#_bookmark70)|
|Managing monthly payments|32|[Case 32: Monthly payments](#_bookmark73)|
|VAT on the margin|33|[Case 33: Transactions subject to the margin system](#_bookmark78)|
|Partial collection and collection cancellation|34|[Case 34: Partial collection and collection cancellation](#_bookmark80)|
|Author's notes|35|[Case 35: Author's notes](#_bookmark81)|
|Professional secrecy|36|[Case 36: Operations subject to professional secrecy and exchanges of sensitive data](#_bookmark82)|





1. ## <a name="_bookmark6"></a>**Treatment of the main cases**
   1. <a name="_bookmark7"></a>**Case 1: Multi-order / Multi-delivery**

At present, it is not possible to transmit multi-order / multi-delivery invoices within the framework of the EN16931 standard.

The EXT-FR-FE-BG-10 extension is used to enter (cf. **Error! Reference source not found. Error! Reference source not found.**) the following information in the invoice at line level (block BG-25):

- Order no.
- Delivery (Name, site ID, address information)

1. <a name="_bookmark8"></a>**Case n°2: invoice already paid by buyer or third party designated for invoicing at time of invoice issue**

For this management case, two sub-cases are to be considered:

1. Invoice already paid by buyer
1. Invoice already paid by a third party (adding an actor to the process)

The specific features of the data and associated management rules are :

0. Billing frame "Deposit of a previously paid invoice".
0. Due date equals payment date
0. Amount paid (BT-113) equal to total invoice amount
0. Amount payable (BT-115) equal to 0
0. In sub-case 2, the third party who has already paid the invoice must be entered in the

   "The supplier receives the invoice statuses, so that he can indicate whether the invoice has been collected and update the "collected" status transmitted to the public invoicing portal.

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.002.png)


<a name="_bookmark9"></a>Figure 1: Invoice already paid by buyer or third party designated for invoicing


The specific features of the life cycle or associated processes are :

0. Transmission of flow 1 by the supplier
0. The fact that the invoice has already been paid does not exempt the supplier from transmitting the *e-reporting of* payment data ("cashed" status) when the transaction falls into the category of services.
0. The "cashed" status can be sent at the same time as the invoice is issued.


1. <a name="_bookmark10"></a>**Case 3: Invoice to be paid by a third party designated at the time of invoicing**

The invoice is sent by the supplier to the buyer, who then forwards it to the third-party payer.

liquidation or validation.

For all invoices sent by the PPF or a PDP :

- The third-party payer can be identified on the invoice in the "INVOICE PAYER" block (EXT-FR-FE-BG- 02).
- On the PPF, the invoice and its life cycle are not transmitted to the third-party payer; they will be made available to him.

  if it has an account on Chorus Pro.

- PDPs are responsible for managing access to the third-party payer lifecycle.
- The life cycle can be updated by the third-party payer, *via* a PDP or directly on the PPF.

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.003.png)

<a name="_bookmark11"></a>Figure 2: Invoice to be paid by a third party designated for invoicing

The specific features of the life cycle or associated processes are :

- The life cycle can be updated by the third-party payer directly on the PPF or via one of the PDPs. An account

  on one of these platforms will be necessary

- Transmission of flow 1 and *e-reporting* of payment data by supplier

The services offered by PPF are :

- If both the buyer and the third party are connected to the PPF, the latter will be able to view the invoice and its lifecycle.
- If both the supplier and the third party are connected to the PPF, the latter will be able to view the invoice and its life cycle.
- Actors connected to the PPF will be notified by a lifecycle flow in the event of an invoice status change.

The steps in case 3 are :

<table><tr><th colspan="1" valign="top"><p></p><p><b>Step</b></p></th><th colspan="1" valign="top"><p></p><p><b>Stage name</b></p></th><th colspan="1" valign="top"><b>Responsible player</b></th><th colspan="1" valign="top"><p></p><p><b>Description</b></p></th></tr>
<tr><td colspan="1" valign="top">1</td><td colspan="1" valign="top">Invoice creation</td><td colspan="1" valign="top">Supplier</td><td colspan="1" rowspan="2" valign="top">The supplier creates the invoice (flow 2) via PDP 1, which sends it to the buyer. At the same time, PDP 1 sends the invoice's regulatory data (flow 1) to the PPF.</td></tr>
<tr><td colspan="1" valign="top"><p></p><p>2</p></td><td colspan="1" valign="top"><p></p><p>Receiving stream 1</p></td><td colspan="1" valign="top"><p></p><p>PPF</p></td></tr>
<tr><td colspan="1" valign="top">3</td><td colspan="1" valign="top">Receipt of invoice</td><td colspan="1" rowspan="2" valign="top"><p></p><p>Buyer</p></td><td colspan="1" rowspan="2" valign="top">The buyer's platform (the PPF in the example) provides him with the invoice for checking. The buyer processes the invoice as required and updates the status.</td></tr>
<tr><td colspan="1" valign="top">4</td><td colspan="1" valign="top">Invoice processing and status update</td></tr>
<tr><td colspan="1" valign="top">5</td><td colspan="1" valign="top">Receipt of invoice status</td><td colspan="1" valign="top">Supplier</td><td colspan="1" valign="top">The supplier receives the invoice status after the invoice has been processed by the buyer according to the lifecycle procedure.</td></tr>
<tr><td colspan="1" valign="top">5b</td><td colspan="1" valign="top">Information	on	the	invoice processing</td><td colspan="1" valign="top">Supplier</td><td colspan="1" valign="top">The supplier provides information on the correct processing of the invoice (depending on the platforms' commercial offer).</td></tr>
<tr><td colspan="1" valign="top">6</td><td colspan="1" valign="top">Invoice payment</td><td colspan="1" valign="top">Third parties</td><td colspan="1" valign="top">Third party pays supplier</td></tr>
<tr><td colspan="1" valign="top">7</td><td colspan="1" valign="top">Invoice collection</td><td colspan="1" valign="top">Supplier</td><td colspan="1" rowspan="3" valign="top"><p>1° The supplier collects the invoice and updates the invoice collection information with the status "collected".</p><p>2° The supplier's PDP 1 transmits payment data to the PPF</p><p>3° Depending on the platforms' commercial offer, it can send a life cycle of the collection to the third party and/or the buyer.</p></td></tr>
<tr><td colspan="1" valign="top">7b</td><td colspan="1" valign="top">Invoice collection information</td><td colspan="1" valign="top">Supplier</td></tr>
<tr><td colspan="1" valign="top">8</td><td colspan="1" valign="top"><p>Go to	à	update	at	status</p><p>"cashed</p></td><td colspan="1" valign="top">Supplier</td></tr>
<tr><td colspan="1" valign="top">9</td><td colspan="1" valign="top"><p>Reception	from	status</p><p>"cashed</p></td><td colspan="1" valign="top">Buyer</td><td colspan="1" valign="top">The buyer's platform (PPF in the example) receives the incoming payment status transmitted by the supplier's PDP 1.</td></tr>
</table>

1. <a name="_bookmark12"></a>**Case n°4 : Invoice to be paid by the buyer and partially covered by a third party known at the time of invoicing (subsidy, insurance, etc.)**

This management case covers invoices that are partially paid by a third party (for example, an invoice from

repair where the deductible is paid by a customer and the balance by the insurer).

In view of the current provisions of standard EN16931 and the CII and UBL formats, it is not possible to draw up a payment schedule identifying the various payments and the players involved.

Consequently, the specific characteristics of the data and the associated management rules are as follows:

- The SELLER block (BG-4) is used to enter information about the supplier.
- The BUYER block (BG-7) is used to enter information about the customer who is to pay the invoice (e.g. the company that is to pay a deductible).
- The INVOICE PAYER block (EXT-FR-FE-BG-02) is used if you wish to mention the third party (e.g. insurance company) on the invoice. When the PAYER block is filled in, if the third party has an account on the PPF, he/she will have access to consult the invoice (outside circuit C).
- The AMOUNT PAID field (BT-113) is used, by convention, to enter the amount of the invoice that has already been paid or will be paid by a third party (e.g. the amount of the invoice paid by the insurer).
- The INVOICE NOTE block (BG-1) is used to indicate that part of the invoice has already been paid or will be paid by one or more third parties. More specifically, in the INVOICE NOTE SUBJECT CODE field (BT-21), the supplier must enter the code "PAI", which is used to indicate payment information.
- The supplier will have to declare 2 collections, one from the customer, the other from the third party known to the

billing.

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.004.png)

<a name="_bookmark13"></a>Figure 3: Invoice to be paid by the buyer and partially covered by a third party known at the time of invoicing (subsidy, insurance, etc.)


The steps in Case 4 are as follows:

|<p></p><p>**Step**</p>|<p></p><p>**Stage name**</p>|**Responsible player**|<p></p><p>**Description**</p>|
| :- | :- | :- | :- |
|<p></p><p>1</p>|<p></p><p>Create invoice to</p><p>destination of purchaser</p>|<p></p><p>Supplier</p>|The supplier or his MPS creates the invoice to be sent to the buyer (or the buyer's MPS), specifying the amount to be paid by the third party. The same invoice, which can be sent to the third party, is outside the PPF billing circuit.|
|<p></p><p>2</p>|Receiving data from stream 1|<p></p><p>PPF</p>|<p>In the case of circuits A, B1 and B2, the supplier or his PDP transmits the data for flow 1 to enable the PPF to generate this flow for destination.</p><p>tax authorities.</p>|

<table><tr><th colspan="1" valign="top"></th><th colspan="1" valign="top"></th><th colspan="1" valign="top"></th><th colspan="1" valign="top"><p>In the case of circuit C, the supplier's PDP generates this flow directly to the PPF, for transmission, after checking, to</p><p>tax authorities.</p></th></tr>
<tr><td colspan="1" valign="top">3</td><td colspan="1" valign="top">Receipt of invoice</td><td colspan="1" valign="top">Buyer</td><td colspan="1" valign="top">The buyer receives the invoice directly from the PPF or via his PDP.</td></tr>
<tr><td colspan="1" valign="top">4</td><td colspan="1" valign="top">Invoice processing and status update</td><td colspan="1" valign="top">Buyer</td><td colspan="1" valign="top"><p>The purchaser or the purchaser's PDP acknowledges receipt of the invoice, and, if applicable, the purchaser's PDP.</p><p>if necessary, sends the appropriate statuses to the supplier or its PDP.</p></td></tr>
<tr><td colspan="1" valign="top"><p></p><p>5</p></td><td colspan="1" valign="top"><p></p><p>Invoice payment</p></td><td colspan="1" valign="top"><p></p><p>Buyer</p></td><td colspan="1" valign="top"><p>The buyer or his PDP pays the amount due on the invoice at his own expense, and updates the invoice payment information.</p><p>invoice.</p></td></tr>
<tr><td colspan="1" valign="top">5b</td><td colspan="1" valign="top">Invoice payment</td><td colspan="1" valign="top">Third parties</td><td colspan="1" valign="top">Outside the PPF billing circuit, the third party pays the invoice amount for which he is responsible.</td></tr>
<tr><td colspan="1" valign="top">6</td><td colspan="1" valign="top"><p>Collection of the amount of</p><p>the invoice paid by the buyer</p></td><td colspan="1" valign="top">Supplier</td><td colspan="1" rowspan="5" valign="top"><p></p><p>The supplier collects the invoice amount paid by the buyer and the third party, and updates the invoice collection information. Depending on the platform's commercial offer, he can send a collection life cycle to the buyer.</p><p>The supplier or his PDP transmits payment data to the PPF in 2 stages, following receipt of the amounts paid by the buyer and the third party.</p></td></tr>
<tr><td colspan="1" valign="top">6b</td><td colspan="1" valign="top">Collection of the invoice amount paid by the third party</td><td colspan="1" valign="top">Supplier</td></tr>
<tr><td colspan="1" valign="top">7</td><td colspan="1" valign="top">Update status to cashed</td><td colspan="1" valign="top">Supplier</td></tr>
<tr><td colspan="1" valign="top">7b</td><td colspan="1" valign="top"><p>Data transmission from</p><p>buyer's payment</p></td><td colspan="1" valign="top">Supplier</td></tr>
<tr><td colspan="1" valign="top">7c</td><td colspan="1" valign="top">Transmission of third-party payment data</td><td colspan="1" valign="top">Supplier</td></tr>
<tr><td colspan="1" valign="top"><p></p><p>8</p></td><td colspan="1" valign="top">Receipt of payment data from e-reporting flow</td><td colspan="1" valign="top"><p></p><p>PPF</p></td><td colspan="1" valign="top"><p>The PPF receives the transmitted payment data stream, firstly by collecting the invoice amount paid by the third party, and then by</p><p>collection of the invoice amount paid by the buyer.</p></td></tr>
</table>

1. <a name="_bookmark14"></a>**Cases 5 and 6: Expenses paid by employees (excluding purchasing cards), with invoice in the company's name (*e-invoicing)* or without invoice (simple receipt) (*e-reporting of* off-invoice transaction data)**

This management case covers advances made by an employee in the course of his or her professional activity, and for which an invoice has been issued in the company's name.

In this case, the employee has advanced the costs and the company reimburses them. This case is only valid if the invoice paid by the employee is made out in the company's name, and is therefore the subject of an electronic invoice. The employee is then considered a third-party payer. As this is an individual who is not listed in the directory, he/she cannot be entered in the "INVOICE PAYER" block (EXT-FR-FE-BG-02).

In the case of an invoice paid by an employee who is not in the company's name, this invoice must be declared by the supplier as B2C, and therefore *e-reported*. It is therefore not declared as B2B, and does not form the subject of an electronic invoice.

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.005.jpeg)

<a name="_bookmark15"></a>Figure 4: Expenses paid by employees




1. <a name="_bookmark16"></a>**Case 7: Invoice following a purchase with an embedded card (purchasing card)**

In the case of a purchase with a lodged card, for a hotel room or train tickets paid for by the public entity

/ For the accountant, for example, the invoice has already been paid (BT-113), and the due date is entered with the payment date.

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.006.png)

<a name="_bookmark17"></a>Figure 5: Invoice following a card purchase



The steps for case 7 are :


|**Step**|**Stage name**|**Responsible player**|**Description**|
| :- | :- | :- | :- |
|1|Purchasing card|Buyer|The buyer orders a product/travel using a purchasing card or a card lodged with the supplier.|
|2|Invoice creation|Supplier|The supplier creates an invoice that has already been paid. At the same time, his issuing platform (PPF) sends a Stream 1 to declare the billing data.|

<table><tr><th colspan="1" valign="top">3</th><th colspan="1" valign="top">Information on payment transaction data</th><th colspan="1" valign="top">Supplier</th><th colspan="1" valign="top">The payment transaction data is transmitted to the financial institution (outside the tool).</th></tr>
<tr><td colspan="1" valign="top">4</td><td colspan="1" valign="top">Receipt of transaction amount</td><td colspan="1" valign="top">Supplier</td><td colspan="1" valign="top">The supplier receives payment for the invoice.</td></tr>
<tr><td colspan="1" valign="top">5</td><td colspan="1" valign="top">Receipt of invoice</td><td colspan="1" valign="top">Buyer</td><td colspan="1" valign="top">The buyer receives the invoice from the supplier.</td></tr>
<tr><td colspan="1" valign="top">6</td><td colspan="1" valign="top">Transaction statement transmission</td><td colspan="1" valign="top">Third parties</td><td colspan="1" valign="top">The bank sends a statement of transactions to the customer (excluding the tool).</td></tr>
<tr><td colspan="1" valign="top">7</td><td colspan="1" valign="top">Reconciliation between statement and invoice</td><td colspan="1" valign="top">Buyer</td><td colspan="1" valign="top"><p>The customer can reconcile invoices received from the</p><p>supplier and transaction statement (excluding tool).</p></td></tr>
<tr><td colspan="1" valign="top">8</td><td colspan="1" valign="top">Payment of the statement of transactions</td><td colspan="1" rowspan="2" valign="top"><p></p><p>Buyer</p></td><td colspan="1" rowspan="2" valign="top"><p></p><p>The buyer settles the transaction statement (excluding tools)</p></td></tr>
<tr><td colspan="1" valign="top">9</td><td colspan="1" valign="top">Information	from	invoice collection</td></tr>
<tr><td colspan="1" valign="top">10</td><td colspan="1" valign="top"><p>Go to	à	update	at	status</p><p>"cashed</p></td><td colspan="1" rowspan="2" valign="top"><p></p><p>Supplier</p></td><td colspan="1" rowspan="2" valign="top"><p>The PPF then sends the status "cashed" via a flow 6 (payment data to the administration). This declaration can be made automatically (without any action on the part of the supplier) following the</p><p>receipt of invoice...</p></td></tr>
<tr><td colspan="1" valign="top">11</td><td colspan="1" valign="top">Receipt of payment data flow</td></tr>
</table>

For a B2B transaction, the operation of an embedded card is the same as for [Case 2: invoice already paid by ](#_bookmark8)[the buyer or a third party designated for invoicing at the time the invoice is ](#_bookmark8)[issued.](#_bookmark8)

1. <a name="_bookmark18"></a>**Cases 8 to 10: Invoices payable to a third party (including factoring) Focus on factoring management on the PPF**

   Factoring is a credit transaction within the meaning of Article L. 313-1 of the French Monetary and Financial Code. This regulated financial service, provided by specialized credit institutions or finance companies, is based on the purchase of trade receivables. The legal basis for the transfer of receivables from the supplier to the factor is the conventional subrogation provided for in the French Civil Code, the cession of trade receivables known as "cession Dailly" provided for in the French Monetary and Financial Code, or the cession of receivables provided for in the French Civil Code. Whatever the method, the factor is the owner of the assigned receivable.

### **Prerequisite**:
In order to benefit from the services of the public invoicing portal, a player must have a user account on the portal. A connection will also be required to exchange flows (invoices or lifecycles) or use the APIs made available. If there is no connection, only the portal functionality will be available.

The services associated with factoring can be divided into four categories, as summarized below.

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.007.png)**Case 1:** The factor has an account on the PPF and the supplier and/or buyer have chosen the PPF to issue or receive the invoice.

|<p></p><p>![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.008.png)</p><p>Figure 6: Invoice payable to a third party designated for invoicing (Option 1)</p>|<p>- The factor can consult the invoice and its life cycle:</p><p>&emsp;- The factor can use portal/API solutions (if he has created a connection) to consult the invoice and its lifecycle.</p><p>- The factor will be able to update the lifecycle (add attachment</p><p>&emsp;/ collection) :</p><p>&emsp;- The factor can use the portal/API channels (if he has created a connection) to update the lifecycle;</p><p>&emsp;- The factor can use the EDI or API channel to transmit a lifecycle update, if he has created the appropriate connection.</p><p>- The PPF sends a notification (e-mail) to all players with a user account as soon as an event occurs on the invoice (deposit / change of status / factoring / change of factor), without specifying the type of event. It is up to the players concerned to consult the invoice to find out the details of the event.</p><p>- API search (with criteria) possible (if a connection has been made)1. In the event of a change in the invoices to be searched, the PPF will send an API message.</p><p>&emsp;with the data defined at the output of the Search API2.</p>|
| :- | - |



![ref1]**Case 2**: The factor does not have an account on the PPF, but the supplier and/or buyer have chosen the PPF to issue or receive the invoice.


|![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.010.png)|<p></p><p>- The invoice must be sent to the factor by the off-tool supplier.</p><p>- Depending on the service offered by the PDP, the factor can either transmit the "cashed" status to the PPF for the invoice concerned, or transmit the information to the supplier, who will enrich the "cashed" status.</p>|
| :- | :- |

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.011.png)**Case 3**: The factor has an account on the PPF but neither the supplier nor the buyer has chosen the PPF to issue or receive his invoice.


|![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.012.png)|<p>- The PPF will only receive stream 1 (data for administration) from the supplier's PDP.</p><p>- The invoice must be sent by the supplier to the factor outside the tool.</p><p>- The factor is not informed of changes to the invoice (life cycle).</p><p>- The factor must send information on the collection of the receivable to the supplier so that the latter can enrich the</p><p>&emsp;cashed" status of the invoice concerned</p>|
| :- | :- |

![ref1]**4th case**: None of the players has an account on the PPF.



|![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.013.png)|<p>- The PPF will only receive stream 1 from the supplier's MPS.</p><p>- Solution based on PDP service offerings.</p><p>- Depending on the service offered by its PDP, the factor can either send the supplier's PDP the status "cashed" for the invoice in question, or pass on the information to the supplier, who then</p><p>&emsp;will be responsible for enriching the "cashed" status.</p>|
| :- | - |

### **Conditions for factor access to factored invoices :**

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.014.png)

1 The subscription solution is currently being studied.

2 The subscription solution is currently being studied.

- **In the event of factoring notified to the buyer at the time of invoice issue**, **whatever the factoring method (subrogation, assignment of civil code receivables or Dailly)**, the factor will be automatically informed by API message or notification e-mail and will have access to the invoice.

- **In the case of factoring notified to the purchaser after the invoice has been issued, whatever the factoring method (subrogation, assignment of receivables under the civil code or Dailly)**, action by the supplier issuer is essential, *via* the transmission of a "factoring" life cycle, enabling notification of a change concerning the invoice, giving the name of the factor and the bank details in an *ad hoc* block. The factor and the customer can then be informed by e-mail notification. As a reminder, the invoice is not modified, and the factor does not appear on the invoice.

- **In the case of confidential factoring, i.e. the buyer has not been notified, whatever the factoring method (subrogation, assignment of receivables under the civil code or Dailly),** only a delegation by the supplier on his account will be possible, so that the factor remains "hidden" from the customer. The customer will be notified by e-mail as soon as the supplier's delegation is activated on the perimeter defined by the latter.

### **Confidential factoring management** :
- In this case, there is no mention of factoring on the invoice;
- If the supplier and the factor are connected to the PPF, the supplier can authorize the third party on his structure (at the structure or department level) so that the factor can access all the invoices issued by this structure/department. The factor can then update the life cycle in the same way as the supplier.

### **Change of factor :**
- The supplier can declare a factor change through a life cycle;
- The original factor, the new factor and the buyer will be notified (by e-mail) of this change;
- The original factor can only continue to consult the invoices and associated lifecycles for which he or she was named;
- The new factor will be able to consult invoices / transmit life cycles;
- The invoice is not modified, so the new factor will not appear on the invoice.

1. <a name="_bookmark19"></a>**Case 8: Invoice payable to a third party determined at the time of invoicing (factoring, cash pooling)**

The invoice must be paid to a third party determined at the time of invoicing. The receivable associated with the invoice is assigned to a bank or factor by the supplier as part of a contract. Invoice payment data must only be transmitted when the factor has received payment from the customer, and not when the supplier has been paid by the factor (VAT payability rule).

The specifics of the data and associated management rules are :

- The factor must be entered in block BG-10 "BENEFICIARY".
- The elements used to pay the factor for a transfer in block BG-17 "TRANSFER".
- Invoice type in BT-3 must be set to 393 (Factored invoice).

The specific features of the life cycle or associated processes are :

- Transmission of flow 2 from supplier's MPS to buyer's MPS
- Generation and transmission of flow 1 to the PPF (case of circuit C)
- Two options are available for transmitting the *e-reporting* payment data stream (depending on the commercial agreements between the supplier and the factor):
  - Option 8-1: **Supplier** transmits payment data *e-reporting* flow
  - Option 8-2: the **third-party factor** transmits the payment data *e-reporting* flow


Option 8-1 can be described as follows:

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.015.png)

<a name="_bookmark20"></a>Figure 7: Invoice payable to a third party determined at time of invoicing (Option 1)


The steps in case 8-1 are :


<table><tr><th colspan="1" valign="top"><p></p><p><b>Step</b></p></th><th colspan="1" valign="top"><p></p><p><b>Stage name</b></p></th><th colspan="1" valign="top"><b>Responsible player</b></th><th colspan="1" valign="top"><p></p><p><b>Description</b></p></th></tr>
<tr><td colspan="1" valign="top">1</td><td colspan="1" valign="top">Invoice creation with factor</td><td colspan="1" valign="top">Supplier</td><td colspan="1" rowspan="2" valign="top"><p>The factor is known as soon as the invoice is created. When sending an invoice flow, use block BG-10 "BENEFICIARY" to identify the factor, and block BG-17 "TRANSFER" for elements used to pay the factor in the case of a transfer. Invoice type in BT-3 must be set to 393 (Factored invoice). A flow 1 is sent by the supplier's PDP1 to the</p><p>PPF in parallel with flow 2</p></td></tr>
<tr><td colspan="1" valign="top"><p></p><p>2</p></td><td colspan="1" valign="top"><p></p><p>Receiving stream 1</p></td><td colspan="1" valign="top"><p></p><p>PPF</p></td></tr>
<tr><td colspan="1" valign="top">3</td><td colspan="1" valign="top">Receipt of invoice</td><td colspan="1" valign="top">Buyer</td><td colspan="1" rowspan="3" valign="top"><p></p><p>The buyer's PDP 2 makes the invoice available to him. The buyer processes the invoice according to the lifecycle procedure, up to the optional "payment forwarded" status. A lifecycle flow is sent to the supplier's PDP.</p></td></tr>
<tr><td colspan="1" valign="top"><p></p><p>4</p></td><td colspan="1" valign="top"><p>Invoice processing and	update	from	status	up to</p><p>"Payment forwarded</p></td><td colspan="1" valign="top"><p></p><p>Buyer</p></td></tr>
<tr><td colspan="1" valign="top">5</td><td colspan="1" valign="top">Invoice payment to factor and status transmission</td><td colspan="1" valign="top">Buyer</td></tr>
<tr><td colspan="1" valign="top">6</td><td colspan="1" valign="top">Receiving invoice status</td><td colspan="1" valign="top">Supplier</td><td colspan="1" valign="top">The lifecycle flow sent by the buyer's PDP 2 is received by the supplier's PDP 1.</td></tr>
<tr><td colspan="1" valign="top"><p></p><p>7</p></td><td colspan="1" valign="top"><p></p><p>Invoice collection</p></td><td colspan="1" valign="top"><p></p><p>Third parties</p></td><td colspan="1" valign="top"><p>The third-party factor collects the invoice payment. The transmission of this</p><p>Information to the PPF is based on the platforms' commercial offer.</p></td></tr>
<tr><td colspan="1" valign="top"><p></p><p>8</p></td><td colspan="1" valign="top"><p>Go to	à	update	at	status</p><p>"and transmission of payment data</p></td><td colspan="1" valign="top"><p></p><p>Supplier</p></td><td colspan="1" valign="top">The supplier updates the "cashed" status on behalf of the third-party factor via his PDP. The supplier's PDP transmits the <i>e-reporting</i> of payment data to the PPF.</td></tr>
<tr><td colspan="1" valign="top">9</td><td colspan="1" valign="top"><p>Receiving <i>e-reporting</i> feeds</p><p>payment details</p></td><td colspan="1" valign="top">PPF</td><td colspan="1" valign="top"><p>The PPF receives the payment data stream transmitted by the</p><p>supplier</p></td></tr>
<tr><td colspan="1" valign="top">10</td><td colspan="1" valign="top"><p>Reception	from	status</p><p>"cashed</p></td><td colspan="1" valign="top">Buyer</td><td colspan="1" valign="top">The supplier's PDP 1 can send a lifecycle flow to the buyer's PDP 2, if its commercial offer allows.</td></tr>
</table>


Option 8-2 can be described as follows:

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.016.png)

<a name="_bookmark21"></a>Figure 8: Bill to be paid to a third party designated for billing (Option 2)



The steps in case 8-2 are :

<table><tr><th colspan="1" valign="top"><p></p><p><b>Step</b></p></th><th colspan="1" valign="top"><p></p><p><b>Stage name</b></p></th><th colspan="1" valign="top"><b>Responsible player</b></th><th colspan="1" valign="top"><p></p><p><b>Description</b></p></th></tr>
<tr><td colspan="1" valign="top">1</td><td colspan="1" valign="top">Invoice creation with factor</td><td colspan="1" valign="top">Supplier</td><td colspan="1" rowspan="2" valign="top"><p>The factor is known as soon as the invoice is created. When sending a flow, use block BG-10 "BENEFICIARY" to identify the factor, and block BG-17 "TRANSFER" for elements used to pay the factor in the case of a transfer. Invoice type in BT-3 must be set to 393 (Factoring invoice). A flow 1 is sent by the supplier's PDP1 to the PPF in</p><p>parallel flow 2</p></td></tr>
<tr><td colspan="1" valign="top"><p></p><p>2</p></td><td colspan="1" valign="top"><p></p><p>Receiving stream 1</p></td><td colspan="1" valign="top"><p></p><p>PPF</p></td></tr>
<tr><td colspan="1" valign="top">3</td><td colspan="1" valign="top">Receipt of invoice</td><td colspan="1" valign="top">Buyer</td><td colspan="1" rowspan="3" valign="top"><p></p><p>The buyer's PDP 3 makes the invoice available to him. The buyer processes the invoice according to the lifecycle procedure, up to the optional "payment forwarded" status. A lifecycle flow is sent to the supplier's PDP.</p></td></tr>
<tr><td colspan="1" valign="top"><p></p><p>4</p></td><td colspan="1" valign="top"><p>Invoice processing and	update	from	status	up to</p><p>"Payment forwarded</p></td><td colspan="1" valign="top"><p></p><p>Buyer</p></td></tr>
<tr><td colspan="1" valign="top">5</td><td colspan="1" valign="top">Invoice payment to factor and status transmission</td><td colspan="1" valign="top">Buyer</td></tr>
<tr><td colspan="1" valign="top">6</td><td colspan="1" valign="top">Receiving invoice status</td><td colspan="1" valign="top">Supplier</td><td colspan="1" valign="top">The lifecycle flow sent by the buyer's PDP 3 is received by the supplier's PDP 1.</td></tr>
<tr><td colspan="1" valign="top">7</td><td colspan="1" valign="top">Invoice collection</td><td colspan="1" valign="top">Third parties</td><td colspan="1" valign="top">The third-party factor collects the invoice payment.</td></tr>
<tr><td colspan="1" valign="top"><p></p><p>8</p></td><td colspan="1" valign="top"><p>Receiving <i>e-reporting</i> feeds</p><p>payment details</p></td><td colspan="1" valign="top"><p></p><p>Third parties</p></td><td colspan="1" valign="top"><p>The third-party factor's PDP 2 transmits the payment <i>e-reporting</i> flow to the PPF.</p><p><b>/!\</b>: Legally, the obligation to transmit payment data rests with the supplier.</p></td></tr>
</table>


More generally, in case n°8, the services offered by the PPF are :

- If both the buyer and the third party are connected to the PPF, the latter will be able to view/modify the invoice and its lifecycle.
- If both the supplier and the third party are connected to the PPF, the latter will have access to view/modify the invoice and its life cycle.
- Actors connected to the PPF will be notified of any change in invoice status.


1. <a name="_bookmark22"></a>**Case n°9: Invoice to be paid to a third party known at the time of invoicing, who also manages the order/receipt, or even the invoicing (Distributor/Depositary).**

This case is treated in the same way as case 8. The various roles (order, reception, invoicing) can be added to the invoice flow (flow 2) as required. They have no impact on the data to be sent to the authorities (stream 1). It is the responsibility of dematerialization platforms to ensure that the person issuing an invoice

on behalf of another company has the necessary billing mandate (no management of authorizations and billing mandates in the directory).

You can refer to the diagram in case no. 8 "Invoice payable to a third party designated at the time of invoicing (factoring, cash pooling)".

1. <a name="_bookmark23"></a>**Case 10: Invoice payable to a third party unknown at time of invoicing (subrogation by a factor unknown at time of invoice creation)**

The invoice is to be paid to a third party, unknown to the PPF when the invoice is created (unknown factor). A contract must be drawn up between the supplier and the third party, before the latter can be declared to the buyer. The invoice is collected by the third party. The supplier is responsible for updating the collection status and transmitting the payment data to the PPF.

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.017.png)


<a name="_bookmark24"></a>Figure 9: Invoice payable to a third party unknown at time of invoicing


The associated life cycle or process specifications are :

- Transmission of flow 1 by the supplier's platform (PPF in the example)
- For the transmission of the *e-reporting* payment data flow, 2 options are possible (depending on the commercial agreements between the supplier and the factor):
  - Option 1: The **supplier** transmits the *e-reporting* payment data stream (see 8-1).
  - Option 2: The **third-party factor** transmits the payment data *e-reporting* flow (see 8-2, PDP only).



The services offered by PPF are :

- If both the buyer and the third-party factor are connected to the PPF, the latter will be able to view/modify the invoice and its lifecycle;
- If both the supplier and the third party are connected to the PPF, the latter will have access to view/modify the invoice and its life cycle;
- Actors connected to the PPF will be notified (by e-mail) of any change in invoice status.

The steps in case 10 are :


<table><tr><th colspan="1" valign="top"><p></p><p><b>Step</b></p></th><th colspan="1" valign="top"><p></p><p><b>Stage name</b></p></th><th colspan="1" valign="top"><b>Responsible player</b></th><th colspan="1" valign="top"><p></p><p><b>Description</b></p></th></tr>
<tr><td colspan="1" valign="top">1</td><td colspan="1" valign="top">Invoice creation with factor</td><td colspan="1" valign="top">Supplier</td><td colspan="1" rowspan="2" valign="top">The factor is unknown when the invoice is created. A flow 1 is sent by the supplier's platform (PPF in the example).</td></tr>
<tr><td colspan="1" valign="top">2</td><td colspan="1" valign="top">Receiving stream 1</td><td colspan="1" valign="top">PPF</td></tr>
<tr><td colspan="1" valign="top">3</td><td colspan="1" valign="top">Receipt of invoice</td><td colspan="1" rowspan="2" valign="top"><p></p><p>Buyer</p></td><td colspan="1" rowspan="2" valign="top">The buyer's PDP 2 makes the invoice available to him. The buyer processes the invoice according to the life-cycle procedures before the optional "payment forwarded" status.</td></tr>
<tr><td colspan="1" valign="top"><p></p><p>4</p></td><td colspan="1" valign="top">Invoice processing and status update before "Payment sent".</td></tr>
<tr><td colspan="1" valign="top">5</td><td colspan="1" valign="top">Subrogation</td><td colspan="1" valign="top">Supplier</td><td colspan="1" rowspan="3" valign="top"><p>The subrogation information will be transmitted to the recipient via a life cycle (flow 6).</p><p>NB: The procedures for handling subrogation from the PPF are detailed in the <i>"Subrogation" life cycle</i> chapter of the Specifications File.</p><p>external - General folder.</p></td></tr>
<tr><td colspan="1" valign="top">5b</td><td colspan="1" valign="top">Information on subrogation and correct invoice processing</td><td colspan="1" valign="top">Supplier</td></tr>
<tr><td colspan="1" valign="top">6</td><td colspan="1" valign="top">Receipt of subrogation</td><td colspan="1" valign="top">Buyer</td></tr>
<tr><td colspan="1" valign="top">7</td><td colspan="1" valign="top">Invoice payment to factor and status transmission</td><td colspan="1" valign="top">Buyer</td><td colspan="1" rowspan="2" valign="top">Once the buyer has paid a third of the invoice, the latter collects the payment. This action is informed by the platforms' commercial offer.</td></tr>
<tr><td colspan="1" valign="top">8</td><td colspan="1" valign="top">Invoice collection</td><td colspan="1" valign="top">Third parties</td></tr>
<tr><td colspan="1" valign="top">8b</td><td colspan="1" valign="top">Information on correct invoice processing</td><td colspan="1" valign="top">Supplier</td><td colspan="1" valign="top">The third party updates the status of invoice receipt via its PDP 1.</td></tr>
<tr><td colspan="1" valign="top">9</td><td colspan="1" valign="top">Update "cashed" status</td><td colspan="1" valign="top">Supplier</td><td colspan="1" rowspan="3" valign="top">The supplier updates the "cashed" status on behalf of the third-party factor via its platform (PPF in the example). The supplier's platform then sends the payment <i>e-reporting</i> flow for declaration to the authorities. The factor can update the "cashed" status if the supplier so wishes.</td></tr>
<tr><td colspan="1" valign="top">9b</td><td colspan="1" valign="top">Invoice collection information</td><td colspan="1" valign="top">Supplier</td></tr>
<tr><td colspan="1" valign="top">10</td><td colspan="1" valign="top"><p>Receiving <i>e-reporting</i> feeds</p><p>payment details</p></td><td colspan="1" valign="top">PPF</td></tr>
<tr><td colspan="1" valign="top">11</td><td colspan="1" valign="top">Receipt of "cashed" status</td><td colspan="1" valign="top">Buyer</td><td colspan="1" valign="top">Depending on the commercial offer of the PDP 2 platform, the customer may be informed of the "cashed" status.</td></tr>
</table>





1. <a name="_bookmark25"></a>**Case n°11 : Invoice with "Addressed to" (INVOICED) different from the buyer (BUYER)**

This business case covers the case of a third party (e.g. a management company) managing a company's invoices and accounts. The invoice is made out in the name of the taxable buyer (whose transactions are covered by electronic invoicing), but addressed to a third party.

PPF will send these invoices to third parties who are liable for payment and therefore included in the directory.

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.018.png)


<a name="_bookmark26"></a>Figure 10: Invoice with "Addressed to" (INVOICEE) different from buyer (BUYER)

The specific characteristics of the data and associated management rules are :

- The buyer (establishment) must be entered in the buyer block (BG-7).
- The entity to which the invoice is sent must be entered in a new "ADRESSEE A" (INVOICEE) block (EXT-FR-FE-BG-04). If the entity to which the invoice is sent must also pay the invoice, then this entity can also be entered in the "PAYER (EXT-FR-FE-BG-02)" block.
- The invoice will then be sent to this entity / the entity to which this invoice is to be ADDRESSED TO (INVOICED). Below are the procedures for accessing/updating the invoice:
  - The buyer will be able to access the invoice and update its status on the PPF, if the supplier or

The "Addressed to" (invoicee) (the company headquarters in our example) are connected to the PPF (Circuit A, B1).

- If the "Adressé à" (invoicee) is connected to the PPF and the supplier/buyer to a separate PDP (circuit C), the buyer will not have access to the invoice.

The specifics of the life cycle or process :

- Transmission of flow 1 and *e-reporting of* payment data by supplier's PDP

Services offered by PPF :

- If the third party and the buyer are connected to the PPF, the latter will be able to view the invoice and its lifecycle.
- If both supplier and buyer are connected to the PPF, the latter will have access to the invoice and its lifecycle for consultation purposes
- Actors connected to the PPF will be notified by a lifecycle flow in the event of an invoice status change.

The steps in case 11 are :


<table><tr><th colspan="1" valign="top"><p></p><p><b>Step</b></p></th><th colspan="1" valign="top"><p></p><p><b>Stage name</b></p></th><th colspan="1" valign="top"><b>Responsible player</b></th><th colspan="1" valign="top"><p></p><p><b>Description</b></p></th></tr>
<tr><td colspan="1" valign="top">1</td><td colspan="1" valign="top">Invoice creation</td><td colspan="1" valign="top">Supplier</td><td colspan="1" rowspan="2" valign="top"><p>The invoice is created by the supplier and transmitted by his platform (PPF in the example) to the platform of the third party (PDP 1) designated in the ADDRESS A block. A</p><p>flux 1 is sent in parallel by the supplier's platform for declaration to the tax authorities.</p></td></tr>
<tr><td colspan="1" valign="top"><p></p><p>2</p></td><td colspan="1" valign="top"><p></p><p>Receiving stream 1</p></td><td colspan="1" valign="top"><p></p><p>PPF</p></td></tr>
<tr><td colspan="1" valign="top">3</td><td colspan="1" valign="top">Receipt of invoice</td><td colspan="1" rowspan="3" valign="top"><p></p><p></p><p>Third parties</p></td><td colspan="1" rowspan="3" valign="top">The third party's PDP 1 makes the invoice available to him. The third party processes the invoice in accordance with the life-cycle procedures prior to the optional "payment forwarded" status. When payment is made by the third party to whom the invoice is addressed, this third party can also be entered in the PAYER block (EXT-FR-FE-BG-02). The third party then pays the invoice and updates the status.</td></tr>
<tr><td colspan="1" valign="top"><p></p><p>4</p></td><td colspan="1" valign="top"><p>Invoice processing and status update before</p><p>"Payment forwarded</p></td></tr>
<tr><td colspan="1" valign="top">5</td><td colspan="1" valign="top">Invoice payment to factor and status transmission</td></tr>
<tr><td colspan="1" valign="top">6</td><td colspan="1" valign="top">Receipt of invoice status</td><td colspan="1" valign="top">Supplier</td><td colspan="1" valign="top">The supplier's platform (PPF in the example) provides him with the invoice status.</td></tr>
<tr><td colspan="1" valign="top">6b</td><td colspan="1" valign="top">Information	on	the	invoice processing</td><td colspan="1" valign="top">Buyer</td><td colspan="1" valign="top">The buyer is informed that the invoice has been processed and paid.</td></tr>
<tr><td colspan="1" valign="top"><p></p><p>7</p></td><td colspan="1" valign="top"><p></p><p>Invoice collection</p></td><td colspan="1" rowspan="2" valign="top"><p></p><p></p><p>Supplier</p></td><td colspan="1" valign="top"><p>Once the buyer has paid a third of the invoice, the latter collects the payment.</p><p>Information on this action will be entered in the "Cashed" status, which will be completed when the supplier has been paid.</p></td></tr>
<tr><td colspan="1" valign="top">8</td><td colspan="1" valign="top"><p>Go to	à	update	at	status</p><p>"cashed</p></td><td colspan="1" valign="top">Once paid, the supplier updates the "cashed" status on behalf of the third party via its platform (PPF in the example).</td></tr>
<tr><td colspan="1" valign="top">9</td><td colspan="1" valign="top"><p>Reception	from	status</p><p>"cashed</p></td><td colspan="1" valign="top">Third parties</td><td colspan="1" valign="top">The third party's PDP 1 provides him with the "cashed" status of the invoice.</td></tr>
<tr><td colspan="1" valign="top">9b</td><td colspan="1" valign="top">Invoice collection information</td><td colspan="1" valign="top">Buyer</td><td colspan="1" valign="top">Buyer receives invoice collection information</td></tr>
<tr><td colspan="1" valign="top">10</td><td colspan="1" valign="top"><p>Receiving <i>e-reporting</i> feeds</p><p>payment details</p></td><td colspan="1" valign="top">PPF</td><td colspan="1" valign="top"><p>The supplier's platform (PPF in the example) accordingly sends the flow</p><p><i>e-reporting</i> of payment for declaration to the tax authorities.</p></td></tr>
</table>




1. <a name="_bookmark27"></a>**Case n°12: Transparent intermediary handling invoices for its purchasing principal**

A transparent intermediary, as defined by VAT, acts as an intermediary between two people in the negotiation of a contract.

and canvassing for suppliers or customers.

For VAT purposes, a transparent intermediary is deemed to be acting on behalf of and in the name of a third party.

He appears as the principal's representative in his dealings with third-party contractors (BOI-TVA-CHAMP- 10-10-40-40, § 20).

In practice, the principal can be either the supplier or the customer.

In principle, transparent intermediaries are required to submit at least two invoices:

- ### **An invoice issued by the intermediary for its intermediation services (PS)**

Intermediation operations for this type of intermediary are considered to be supplies of services independent of the intermediation service itself (BOI-TVA-CHAMP-10-10-40-40, §40). As a result, intermediary services are subject to their own VAT regime and must be invoiced.

- ### **An invoice issued by the supplier/service provider in the customer's name.**
In principle, the main invoice is made out by the supplier in the name of the recipient of the goods or services. When the main invoice and the intermediary invoice are issued between two taxable persons established in France, they are

fall within the scope of electronic invoicing and transit between the supplier's platform and that of the recipient:

- The main invoice passes directly from sender to recipient *via* the chosen platforms,
- Billing data will be transmitted via the biller's platform.

**If the transparent intermediary is also acting as the principal's invoice manager, i.e. receiving invoices on behalf of the customer,** so that the intermediary receives invoices directly on his behalf, the "ADRESSEE A" (INVOICEE) block may be used to indicate on the invoice a third party other than the purchasing customer. If the principal is on the PPF, he will have access to the invoice (except for EDI access).

In this case, if an invoice report or summary invoice is sent to the purchaser via an intermediary, these documents will be outside the scope of electronic invoicing and will have to be transmitted outside the tool.

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.019.png)

<a name="_bookmark28"></a>Figure 11: Transparent intermediate



1. <a name="_bookmark29"></a>**Cases 13 and 14: Subcontracting and co-contracting (B2B/B2C)**

Introduction: this section deals only with cases of subcontracting and co-contracting that do not fall within the scope of the "Works Invoice" functionality provided in B2G on Chorus Pro.

At this stage, private works contracts (B2B) should give rise to a conventional electronic invoice via the platforms (PPF or PDP). This means that only the invoice for the work, including all the compulsory details, will need to be transmitted, with draft invoices circulating outside the "electronic invoicing" tool.

1. **Overview of the treatment of subcontracting**

If B2B subcontracting is used, two separate invoices must be processed for electronic invoicing:

- The subcontractor sends an invoice (F1) to the client (supplier). If the transaction qualifies for reverse charge of VAT, the subcontractor must indicate "reverse charge of VAT by the contractor" on the invoice; otherwise, he must indicate the amount of VAT due on the amount of his service.
- The client / contractor sends an invoice (F2) to the buyer for the total amount of the services and/or goods. The F2 invoice mentions the VAT due on the total amount excluding VAT (contractor's services + subcontractor's services).

These invoices do not require any special handling; they are processed in the same way as standard invoices.

In the case of B2G subcontracting, the subcontractor's invoice is always sent to the public addressee, regardless of the approval given by the contractor.

However, special payment terms may apply:

The French Public Procurement Code (article L.2193-10) and Act no. 75-1334 of December 31, 1975 (title II) provide for direct payment for subcontracting. It applies to public procurement contracts and to contracts awarded by public enterprises that are not purchasers subject to the Public Procurement Code. When the subcontractor of a contract holder is eligible for direct payment, he may be paid directly by the public entity for the part of the contract he is responsible for executing. Validation by the contract holder within 15 days is nevertheless required. Failing this, validation (visa) is tacit (articles R.2193-12 and R.2193-13 of the French Public Order Code).

In the case of other subcontracts, in particular private contracts, the purchaser may pay the subcontractor directly by delegating payment to the contractor, in accordance with article 14 of the aforementioned law. Validation by the contractor is also required, but cannot be tacit.

In the case of direct payment of subcontractors under public procurement contracts, a specific invoicing framework is provided for: framework S3 (Subcontracting service invoice with direct payment).

If payment is delegated in other cases of subcontracting, the invoicing frame to be mentioned is: frame S5 (Subcontractor submits service invoice). In addition, the "EXT-FR-FE-BG-02 - PAYOR OF INVOICE" block can be used and completed in the F1 invoice (between the subcontractor and the client) to indicate payment by the buyer (end client - project owner) of F2 (see case n°3 of external specifications).

1. <a name="_bookmark30"></a>**Case 13: Invoice to be paid by a third party (subcontracting with direct payment or delegated payment)**

Case study 13 covers the business case of a subcontractor who, as part of a contract, sends an invoice to the supplier, but with direct payment by the purchaser within the meaning of the French Public Order Code, or by delegation in the case of private contracts.



1. B2B subcontracting by delegation

Modeling for B2B subcontracting invoices is different from that for B2G, as the recipient does not receive the subcontractor's invoice. Consequently, a distinction must be made between the issue of 2 invoices:

0. A first invoice (F1) from the subcontractor to the contractor
0. A second invoice (F2) from the holder to the buyer

The specifics of the data and associated management rules are :

- BG-4: subcontractor

- BG-7 : supplier/owner
- EXT-FR-FE-BG-02 (BILL PAYER): buyer
- Total Invoice amount (BT-112): amount of subcontractor's work
- BT-23 : S5 (Subcontractor submits service invoice)

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.020.png)

<a name="_bookmark31"></a>Figure 12: Invoice (F1) to be paid by a third party (B2B subcontracting)



![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.021.png)

<a name="_bookmark32"></a>Figure 13: Invoice (F2) to be paid by a third party (B2B subcontracting)

1. B2G subcontracting with direct payment

In the case of subcontracting within the framework of public procurement contracts (excluding work invoice functionalities and legal briefs), the contractor "endorses" the subcontractor's invoice, which is in all cases forwarded to the purchaser (public addressee).

The specific characteristics of the data and associated management rules are :

- BG-4: subcontractor
- BG-7 : buyer (public recipient)
- EXT-FR-FE-BG-03 (SALES AGENT): supplier/owner
- Total invoice amount (BT-112): amount of subcontractor's services
- BT-23 : S3 (Subcontracting service invoice with direct payment)

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.022.png)

<a name="_bookmark33"></a>Figure 14: Invoice to be paid by a third party (case of subcontracting with direct payment in B2G)



The business case steps are as follows:

|<p></p><p>**Step**</p>|<p></p><p>**Stage name**</p>|<p></p><p>**Responsible player**</p>|<p></p><p>**Description**</p>|
| :- | :- | :- | :- |
|1|Creation	of	the	invoice	to cardholder|Subcontractor|The subcontractor sends an invoice covering its services to the supplier / contractor.|
|2|Reception	of	data	|PPF|A feed declaring billing data is sent in parallel by the PPF, which receives the information.|
|<p></p><p></p><p></p><p></p><p></p><p></p><p>3-4-</p><p>4b</p>|<p></p><p></p><p></p><p></p><p></p><p></p><p>Receipt of invoice</p>|<p></p><p></p><p></p><p></p><p></p><p></p><p>Owner</p>|<p>The invoice is made available to the holder:</p><p>1. The holder SEES the invoice with a compulsory comment that allows information to be added for the public recipient.</p><p>2. The holder DOES NOT VIEW the invoice, with a mandatory comment to add information for the public recipient.</p><p>3. The holder does not process the invoice within 15 days of the invoice being made available. In this case, the invoice will be tacitly validated with a generic comment to warn the public recipient of this tacit validation.</p><p></p><p>In all cases, the PPF forwards the invoice to the PPF (Chorus PRO).</p>|
|5|Lifecycle transmission|PPF|PPF transmits a lifecycle flow to PPF (Chorus PRO)|

|6|Receipt of invoice|Buyer|PPF (Chorus PRO) makes the invoice available to the public recipient|
| :- | :- | :- | :- |
|<p></p><p></p><p></p><p>7A</p>|<p></p><p></p><p></p><p>Refusal of invoice</p>|Buyer|<p>The public recipient can also reject the invoice (with a mandatory comment).</p><p></p><p>In this case, PPF (Chorus PRO) transmits a lifecycle flow to PPF to be made available to the subcontractor and the refusal holder.</p><p></p><p>These players will also be notified of the refusal</p>|
|7B|Invoice approval|Buyer|The public recipient approves the invoice|
|7C|Receipt of refusal|Subcontractor Owner|The 2 parties are informed of the refusal and the subcontractor can send a credit note and a new or corrected invoice.|
|8-9|Invoice status processing|Buyer|The buyer can change the status of the invoice, which will be sent to the PPF to be made available to the 2 parties involved in the invoice.|
|10|Invoice payment|Buyer|<p>The public recipient pays the invoice and sets the status to</p><p>The "payment forwarded" function informs the 2 parties involved in the invoice.</p>|
|11|Invoice collection|Subcontractor|The subcontractor changes the status of the invoice to "cashed".|
|12|Payment data declaration|PPF|PPF generates payment data to be made available to the tax authorities|

**Please note:** Both the subcontractor and the contractor must have an account on the public invoicing portal.





1. <a name="_bookmark34"></a>**Case n° 14: Invoice to be paid by a third party (co-contracting)**


1. B2B co-contracting

Managing co-contracting in B2B is different from B2G. There are 2 invoices to produce:

1. The invoice from the co-contractor to the agent ;
1. The invoice from the agent to the buyer.

The specifics of the data and associated management rules are :

|F1 invoice|Invoice F2|
| :- | :- |
|<p>- Invoicing frame: S6 (Submission of a service invoice by a co-contractor)</p><p>- Supplier (BG-4): co-contractor</p><p>- Sales agent (EXT-FR-FE-BG-03): agent</p><p>- Addressed to (EXT-FR-FE-BG-04): Agent</p><p>- Buyer (BG-7) : Buyer</p>|<p>- Invoicing frame: S6 (Submission of a service invoice by a co-contractor)</p><p>- Supplier (BG-4): agent</p><p>- Sales agent (EXT-FR-FE-BG-03): agent</p><p>- Buyer (BG-7) : Buyer</p><p>- Buyer's agent (EXT-FR-FE-BG-01) : MOE</p>|

In the case of co-contracting, the buyer only receives invoices from the contracting agent. When the buyer receives the agent's invoice, he pays both invoices.

Services offered by PPF :

0. If both the third party and the buyer are connected to the PPF, the latter will be able to view the invoice and its lifecycle.
0. If both supplier and buyer are connected to the PPF, the latter will have access to the invoice and its lifecycle for consultation purposes
0. Actors connected to the PPF will be notified by means of a lifecycle flow in the event of a change.

   invoice status

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.023.png)

<a name="_bookmark35"></a>Figure 15: Invoice to be paid by a third party (B2B co-contracting)




The business case steps are as follows:

|<p></p><p>**Step**</p>|<p></p><p>**Stage name**</p>|<p></p><p>**Responsible player**</p>|<p></p><p>**Description**</p>|
| :- | :- | :- | :- |
|<p></p><p></p><p>1</p>|<p></p><p>Creation of the invoice (F1) for the agent</p>|<p></p><p></p><p>Co-contractor</p>|<p>The co-contractor sends an invoice covering its services to the agent.</p><p></p><p>Since the default setting is for the buyer to receive the invoice, we use the</p><p>The "Addressed to" field (EXT-FR-FE-BG-04) is used to enter information for the agent. In this way, he/she will be the last recipient of the invoice.</p>|
|2|Reception	of	data	|PPF|A feed declaring billing data is sent in parallel by the PPF, which receives the information.|
|<p></p><p></p><p>3-4a-</p><p>4b</p>|<p></p><p></p><p>Receipt of invoice</p>|<p></p><p></p><p>Agent</p>|<p>The invoice (F1) is made available to the agent. There are several possible scenarios:</p><p>1- The representative can only refuse the invoice on one of the 2 possible grounds. The co-contractor will be notified of this refusal.</p><p>2- The mandatary SEES the invoice with a comment that allows you to add</p><p>&emsp;information for the buyer</p>|
|<p></p><p></p><p>5-6</p>|<p></p><p></p><p>Create invoice (F2) for buyer</p>|<p></p><p></p><p>Agent</p>|<p>The agent sends the buyer an invoice for his services.</p><p>For this invoice (F2), the agent will have to self-validate (because we use the same invoicing framework which requires a validator).</p><p></p><p>**/!\: In the case of works contracts, the agent may attach the draft summary statement of account to the invoice.**</p>|
|<p></p><p></p><p>7-8</p>|<p></p><p></p><p>Receipt of invoice</p>|<p></p><p></p><p>Buyer</p>|<p>The purchaser receives the invoice, which may include a draft summary statement of account containing all the invoices from the co-contractors.</p><p></p><p>With this document, he knows how much he has to pay, to which suppliers and on which bank details.</p>|
|<p></p><p></p><p></p><p>9a-9b</p>|<p></p><p></p><p></p><p>Receipt of invoice</p>|<p></p><p></p><p></p><p>Buyer</p>|<p>The invoice (F2) is made available to the buyer. Several scenarios are possible:</p><p>1. The buyer may refuse the invoice by giving a reason for refusal. The agent will be notified of this refusal by the PPF, if he has a user account and has subscribed to notifications.</p><p>2. The buyer approves the invoice.</p>|

|<p></p><p>9c</p>|<p></p><p>Refusal of invoice</p>|Buyer|<p>In the event of a refusal by the buyer, a lifecycle flow is transmitted to the PPF to be made available to the refusal agent.</p><p></p><p>He will also be notified of the refusal</p>|
| :- | :- | :- | :- |
|10|Invoice payment|Buyer|Buyer pays invoice (F1) and (F2)|
|11|Invoice collection|co-contractor|The co-contractor changes the status of the invoice to "cashed".|
|12|Invoice collection|Agent|The agent changes the status of the invoice to "cashed".|
|13|Payment data declaration|PPF|The PPF generates payment data for the tax authorities for invoices (F1) and (F2).|


1. B2G co-contracting

This case deals with co-contracting outside works contracts.

In B2G, a single invoice is sent by the co-contractor, which, once approved by the authorized representative, is made available to the public addressee.

In the case of transmission of the invoice from the co-contractor to the agent, the specific data and associated management rules are :

- BG-4: co-contractor
- BG-7: the public recipient
- EXT-FR-FE-BG-03: In the sales agent block, we enter the agent's name.
- Total invoice amount (BT-112) : Amount of co-contractor's services
- BT-23 : S6 (Submission of a service invoice by a co-contractor)

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.024.png)

<a name="_bookmark36"></a>Figure 16: Invoice to be paid by a third party (B2G co-contracting)



The business case steps are as follows:

|<p></p><p>**Step**</p>|<p></p><p>**Stage name**</p>|<p></p><p>**Responsible player**</p>|<p></p><p>**Description**</p>|
| :- | :- | :- | :- |
|1|Creation	of	the	invoice	to agent|Co-contractor|The co-contractor sends an invoice covering its services to the principal.|
|2|Reception	of	data	|PPF|A feed declaring billing data is sent in parallel by the PPF, which receives the information.|
|<p></p><p></p><p>3-4A-</p><p>4B</p>|<p></p><p></p><p>Receipt of invoice</p>|<p></p><p></p><p>Agent</p>|<p>The invoice is made available to the authorised representative:</p><p>1. The representative can only refuse the invoice on one of the 2 possible grounds. The co-contractor will be notified of this refusal.</p><p>2. The mandatary SEES the invoice with a comment to add information for the public recipient.</p><p>The invoice is sent to PPF (Chorus PRO)</p>|

|4C|Receipt of invoice rejection|Co-contractor|The co-contractor can consult the reason for refusal and the associated comment. He can send back a credit note and a new or corrected invoice.|
| :- | :- | :- | :- |
|5|Lifecycle transmission|PPF|PPF transmits a lifecycle flow to PPF (Chorus PRO)|
|6|Receipt of invoice|Buyer|Chorus PRO makes the invoice available to the public recipient|
|<p></p><p></p><p></p><p>7A</p>|<p></p><p></p><p></p><p>Refusal of invoice</p>|Buyer|<p>The public recipient can also reject the invoice (with a mandatory comment).</p><p></p><p>In this case, Chorus PRO transmits a lifecycle flow to the PPF so that it can be made available to the co-contractor and the refusal agent.</p><p></p><p>These players will also be notified of the refusal</p>|
|7B|Invoice approval|Buyer|The public recipient approves the invoice|
|4C|Receipt of refusal|Co-contractor Contractor|The 2 parties are informed of the refusal and the subcontractor can send a credit note and a new or corrected invoice.|
|8-9|Invoice status processing|Buyer|The buyer can change the status of the invoice, which will be sent to the PPF to be made available to the 2 parties involved in the invoice.|
|10|Invoice payment|Buyer|<p>The public recipient pays the invoice and sets the status to</p><p>The "payment forwarded" function informs the 2 parties involved in the invoice.</p>|
|11|Invoice collection|Co-contractor|The co-contractor changes the status of the invoice to "cashed".|
|12|Payment data declaration|PPF|PPF generates payment data to be made available to the tax authorities|

**Please note:** The co-contractor and agent must have an account on the public invoicing portal.








1. <a name="_bookmark37"></a>**Case n°15 : Sales invoice following an order / payment from a third party on behalf of the BUYER (media purchase, consultancy fees)**

Business case n°15 covers the business case of an order placed by a third party on behalf of the buyer and the transmission of a sales invoice from the third party to the buyer, with identification of the third party.


![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.025.png)

<a name="_bookmark38"></a>Figure 17: Sales invoice following order/payment from a third party on behalf of the BUYER (media purchase, consultancy fees)


The supplier's PDP1 transmits a flow 2 to the buyer's PDP. Since it is the third party who pays the invoice, the specific data and associated business rules are :

- BG-4 : Supplier
- BG-7 : Buyer
- EXT-FR-FE-BG-02 (BILL PAYER): Third party
- EXT-FR-FE-BG-01 (BUYER'S AGENT): Third party (in certain cases)

The specific features of the associated life cycle or process are :

- Transmission of flow 1 and *e-reporting* of payment data by the third-party platform

Services offered by PPF :

- If the third party and the buyer are connected to the PPF, the latter will be able to view the invoice and its lifecycle.
- If both supplier and buyer are connected to the PPF, the latter will have access to the invoice and its lifecycle for consultation purposes
- Actors connected to the PPF will be notified by means of a lifecycle flow in the event of
<table><tr><th colspan="1" valign="top"><p></p><p></p></th><th colspan="1" valign="top"><p></p><p></p></th><th colspan="1" valign="top"><p></p><p></p></th><th colspan="1" valign="top"><p></p><p></p></th></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"><p></p><p></p></td><td colspan="1" valign="top"></td><td colspan="1" valign="top"><p></p><p></p></td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td></tr>
<tr><td colspan="1" valign="top"><p></p><p></p><p></p><p></p><p></p></td><td colspan="1" valign="top"><p></p><p></p><p></p><p></p><p></p></td><td colspan="1" valign="top"><p></p><p></p><p></p><p></p><p></p></td><td colspan="1" valign="top"><p></p><p></p><p></p><p></p><p></p><p></p></td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="1" valign="top"><p></p><p></p></td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="1" valign="top"><p></p><p></p></td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="1" rowspan="2" valign="top"><p></p><p></p><p></p></td><td colspan="1" rowspan="2" valign="top"><p></p><p></p></td></tr>
<tr><td colspan="1" valign="top"><p></p><p></p></td><td colspan="1" valign="top"><p></p><p></p></td></tr>
<tr><td colspan="1" valign="top"><p></p><p></p><p></p></td><td colspan="1" valign="top"><p></p><p></p><p></p></td><td colspan="1" valign="top"><p></p><p></p><p></p></td><td colspan="1" valign="top"><p></p><p></p><p></p></td></tr>
</table>


![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.026.png)change of invoice status The steps in case 15 are :































1. <a name="_bookmark39"></a>**Case 16: Disbursement invoice for reimbursement of sales invoice paid by third party**

These invoices fall outside the scope of the e-invoicing reform. Their management is therefore outside the scope of the public invoicing portal, but they may nevertheless be handled by PDPs according to the procedures they have defined.



1. <a name="_bookmark40"></a>**Case 17a: Invoice payable to a third-party payment intermediary (e.g. Marketplace)**

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.027.png)

<a name="_bookmark41"></a>Figure 18: Invoice payable to a third party, payment intermediary


Caption:

- F1: The "already paid" invoice issued by the supplier
- F2: The "already paid" commission/fee invoice issued by the payment intermediary

The specific characteristics of the data and associated management rules are :

- Billing frame "Deposit of a previously paid invoice".
- Due date equals payment date
- Amount paid (BT-113) equal to total invoice amount
- Amount payable (BT-115) equal to 0
- In the F2 invoice, the third party who has already paid the invoice (he pays himself) can be entered in the "INVOICE PAYER" block (EXT-FR-FE-BG-02).


### **F1 : third party = PAYER**
**F2: third party = SELLER = PAYER**

The specific features of the life cycle or process are :

- Transmission of flow 1 (F1) and payment *e-reporting* by the supplier's platform
- Transmission of flow 1 (F2) and payment *e-reporting* by the payment intermediary's platform



The steps in case 17a are :


|<p></p><p>**Step**</p>|<p></p><p>**Stage name**</p>|**Responsible player**|<p></p><p>**Description**</p>|
| :- | :- | :- | :- |
|1|Online ordering and payment|Buyer|The buyer places an order on the Internet and makes the payment.|
|2|Receipt of order amount|Payment intermediary|The intermediary collects the full amount of the buyer's order|
|<p></p><p>3</p>|Creation of already paid F1 invoice for order amount|<p></p><p>Supplier</p>|The supplier's PDP 2 forwards the F1 invoice (flow 2) to the professional taxable buyer's PDP 3, which makes it available to the buyer. At the same time, it transmits the invoice data to the PPF.|

<table><tr><th colspan="1" valign="top">4</th><th colspan="1" valign="top">Provision of F1</th><th colspan="1" valign="top">Buyer</th><th colspan="1" valign="top"></th></tr>
<tr><td colspan="1" valign="top">5</td><td colspan="1" valign="top">Return of supplier's share</td><td colspan="1" valign="top">Payment intermediary</td><td colspan="1" valign="top">The intermediary's PDP 1 transmits the amount (quota) to the supplier's PDP 2.</td></tr>
<tr><td colspan="1" valign="top">6</td><td colspan="1" valign="top">Collection	for	the amount net of F1 fees</td><td colspan="1" valign="top">Supplier</td><td colspan="1" rowspan="2" valign="top"><p>When the supplier is paid by the payment intermediary, it updates F1's "cashed" status for the full amount.</p><p>Step 7 only applies to the supply of services, excluding the VAT option on debits.</p></td></tr>
<tr><td colspan="1" valign="top"><p></p><p>7</p></td><td colspan="1" valign="top"><p>Status update</p><p>F1 "cashed in" for its full amount</p></td><td colspan="1" valign="top"><p></p><p>Supplier</p></td></tr>
<tr><td colspan="1" valign="top"><p></p><p>8</p></td><td colspan="1" valign="top">Create an invoice for expenses/commission already paid F2</td><td colspan="1" valign="top">Payment intermediary</td><td colspan="1" rowspan="2" valign="top">The intermediary's PDP 1 forwards the fee/commission invoice already paid (F2 - Flow 2) to the supplier and made available to the supplier by his PDP. At the same time, the intermediary's PDP transmits the invoice data to the PPF.</td></tr>
<tr><td colspan="1" valign="top">9</td><td colspan="1" valign="top">Availability F2</td><td colspan="1" valign="top">Supplier</td></tr>
<tr><td colspan="1" valign="top"><p></p><p>10</p></td><td colspan="1" valign="top"><p></p><p>Status update</p><p>"F2 "cashed in</p></td><td colspan="1" valign="top"><p></p><p>Payment intermediary</p></td><td colspan="1" valign="top"><p>The payment intermediary's PDP 1 transmits the payment data from the commission/intermediation invoice to the PPF.</p><p>Step 10 applies only to services, excluding the option</p><p>VAT on debits.</p></td></tr>
</table>






1. <a name="_bookmark42"></a>**Case 17b: Invoice payable to a third party, payment intermediary and billing mandate**

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.028.png)

<a name="_bookmark43"></a>Figure 19: Bill to be paid to a third party, payment intermediary and billing mandate



The specific characteristics of the data and associated management rules are :

- Billing frame "Deposit of a previously paid invoice".
- Use block EXT-FR-FE-BG-05 - TIERS FACTURANT to enter information about the payment intermediary
- Due date equals payment date
- Amount paid (BT-113) equal to total invoice amount
- Amount payable (BT-115) equal to 0

The specific features of the life cycle or process are :

- Transmission of flow 1 (F1) and payment *e-reporting* by the supplier's platform
- Transmission of flow 1 (F2) and payment *e-reporting* by the payment intermediary's platform The steps in case 17b are :

<table><tr><th colspan="1" valign="top"><p></p><p><b>Step</b></p></th><th colspan="1" valign="top"><p></p><p><b>Stage name</b></p></th><th colspan="1" valign="top"><b>Responsible player</b></th><th colspan="1" valign="top"><p></p><p><b>Description</b></p></th></tr>
<tr><td colspan="1" valign="top"><p></p><p>0</p></td><td colspan="1" valign="top"><p></p><p>Billing mandate</p></td><td colspan="1" valign="top">Supplier Payment intermediary</td><td colspan="1" valign="top"><p>The supplier and the payment intermediary enter into an invoicing mandate so that the intermediary can issue (or deposit) invoices on behalf of the supplier.</p><p>supplier.</p></td></tr>
<tr><td colspan="1" valign="top">1</td><td colspan="1" valign="top">Online ordering and payment</td><td colspan="1" valign="top">Buyer</td><td colspan="1" valign="top"><p>The buyer places an order on the Internet and carries out the</p><p>payment.</p></td></tr>
<tr><td colspan="1" valign="top">2</td><td colspan="1" valign="top">Collection	from	amount	from	order</td><td colspan="1" valign="top">Payment intermediary</td><td colspan="1" valign="top">The intermediary collects the full amount of the buyer's order</td></tr>
<tr><td colspan="1" valign="top"><p></p><p>3</p></td><td colspan="1" valign="top">Creation of an already paid F1 invoice for the order amount in the name and on behalf of the supplier</td><td colspan="1" valign="top">Payment intermediary</td><td colspan="1" rowspan="2" valign="top">The intermediary's PDP 1 issues and transmits the invoice (flow 2) to the buyer's PDP 3, which makes it available to the buyer, as well as to the supplier's PDP 2 (if its commercial offer allows). At the same time, it transmits the invoice data to the PPF.</td></tr>
<tr><td colspan="1" valign="top">4</td><td colspan="1" valign="top">Provision of F1</td><td colspan="1" valign="top">Buyer</td></tr>
</table>

<table><tr><th colspan="1" valign="top"><p></p><p>5</p></th><th colspan="1" valign="top"><p></p><p>Return of supplier's share</p></th><th colspan="1" valign="top">Payment intermediary</th><th colspan="1" valign="top"><p>The intermediary's PDP 1 transmits the amount (equal to the total amount of the order - the intermediary's commission) to</p><p>the supplier's PDP 2.</p></th></tr>
<tr><td colspan="1" valign="top">6</td><td colspan="1" valign="top">Collection for the amount net of F1 fees</td><td colspan="1" valign="top">Supplier</td><td colspan="1" rowspan="2" valign="top"><p>The supplier collects the amount. The supplier's PDP 2 transmits the payment data to the PPF.</p><p>Step 7 is only applicable to the provision of services, excluding</p><p>VAT option on debits.</p></td></tr>
<tr><td colspan="1" valign="top">7</td><td colspan="1" valign="top">Declaration of F1 "cashed" status for its total amount</td><td colspan="1" valign="top">Supplier</td></tr>
<tr><td colspan="1" valign="top">8</td><td colspan="1" valign="top">Create an invoice for expenses/commission already paid F2</td><td colspan="1" valign="top">Payment intermediary</td><td colspan="1" rowspan="2" valign="top">The intermediary's PDP 1 issues and forwards the fee/commission invoice already paid (F2 - Flow 2) to the supplier via its PDP. At the same time, the intermediary's PDP 1 transmits the invoice data to the PPF.</td></tr>
<tr><td colspan="1" valign="top">9</td><td colspan="1" valign="top">Availability F2</td><td colspan="1" valign="top">Supplier</td></tr>
<tr><td colspan="1" valign="top"><p></p><p>10</p></td><td colspan="1" valign="top"><p></p><p>F2 "cashed" status update</p></td><td colspan="1" valign="top"><p></p><p>Payment intermediary</p></td><td colspan="1" valign="top"><p>The payment intermediary's PDP 1 transmits the payment data to the PPF.</p><p>Step 10 only applies to services, excluding</p><p>VAT option on debits.</p></td></tr>
</table>







1. <a name="_bookmark44"></a>**Case 18: Debit note management**

### **Definition and principle :**

A debit note is not an invoice. A debit note is a document issued by a seller to a buyer, stating an amount owed by the latter to the former. In principle, if accepted by the customer, the debit note will or should give rise to an invoice.

According to this definition, **the debit note does not fall within the scope of electronic invoicing and does not have to be sent to the authorities.** An invoice relating to this transaction should have been sent.

This does not apply to debit notes that are treated as invoices if they are subject to VAT and contain all the required information (e.g. re-invoicing to a joint venture), which can therefore be processed.

If the debit note is issued by the buyer and shows a debt owed by the seller to the buyer, then the seller should issue a credit note.

**In practice,** a debit note can also be issued by the buyer. In the same way, the debit note should result in a credit note issued by the buyer (self-billed credit note), if the latter has an invoicing mandate.

In these cases, the platform will transmit the assets :

- A credit note issued by the supplier,
- A credit note invoiced automatically by the buyer.
- A factoring credit
- Self-billed credit factoring
- A credit note for a down-payment invoice









1. <a name="_bookmark45"></a>**Case 19a: Invoice issued with billing mandate**

The billing agent carries out the billing on behalf of the supplier: it is responsible for creating the invoice and transmitting it to the buyer; the supplier collects the invoice and is responsible for updating the status

"The billing data is declared by the agent, and the payment data, if applicable, by the supplier. Billing data is declared by the agent, and payment data is declared, where applicable, by the supplier.

Two (non-exclusive) options are possible in this case: the use of the same platform between the supplier and his agent (option 1), or the use of two different platforms (option 2).

In both cases, the block used to enter information on the billing agent is the EXT-FR- FE-BG-05 - TIERS FACTURANT block (see Appendix 1 - Semantic format FE e-invoicing - Flux 1&2.xlsx).

- ### **Option 1: delegation/enabling of supplier account (same platform)**
The agent connects directly to the customer's platform (the supplier/biller) on his behalf. The submitter's platform is therefore the issuing platform; consequently, if there are many customers, the agent must connect to as many platforms as there are customers to submit the invoices.

In this case, the electronic invoice follows the "classic" circuit.

|<p></p><p>![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.029.png)</p>|![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.030.png)|
| :- | :- |

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.031.png)

<a name="_bookmark46"></a>Figure 20: Invoice issued with billing mandate (option 1)


The specifics of the life cycle or process are :

- Transmission of flow 1 by the billing agent via the supplier's platform
- Transmission of payment *e-report* from supplier's platform
- Use block EXT-FR-FE-BG-05 - BILLING AGENT to enter information about the billing agent.

The steps for case n°19a - option 1 are :


<table><tr><th colspan="1" valign="top"><p></p><p><b>Step</b></p></th><th colspan="1" valign="top"><p></p><p><b>Stage name</b></p></th><th colspan="1" valign="top"><b>Responsible player</b></th><th colspan="1" valign="top"><p></p><p><b>Description</b></p></th></tr>
<tr><td colspan="1" valign="top"><p></p><p>1</p></td><td colspan="1" valign="top">Conclusion of a billing mandate.</td><td colspan="1" valign="top">Supplier Agent	Billing</td><td colspan="1" rowspan="2" valign="top"><p></p><p>The supplier and the agent enter into an invoicing agreement so that the agent can submit invoices on behalf of the supplier.</p></td></tr>
<tr><td colspan="1" valign="top"><p></p><p>2</p></td><td colspan="1" valign="top"><p></p><p>Verification of mandate</p></td><td colspan="1" valign="top">Agent	for billing</td></tr>
<tr><td colspan="1" valign="top"><p></p><p>3</p></td><td colspan="2" valign="top"><p></p><p>Transmission and validation of draft invoice</p></td><td colspan="1" valign="top"><p>Supplier</p><p>Billing agent</p></td></tr>
<tr><td colspan="1" valign="top"><p></p><p>4</p></td><td colspan="1" valign="top"><p></p><p>Invoice creation</p></td><td colspan="1" valign="top"><p></p><p>Agent	for billing</p></td><td colspan="1" valign="top"><p>The agent transmits the invoice created (flow 2) via the platform of his principal (the supplier). The PDP1, which transmits this flow 2 to the buyer's PDP 2, and at the same time transmits flow 1 to the PPF for transmission of the invoices.</p><p>billing data.</p></td></tr>
<tr><td colspan="1" valign="top">5</td><td colspan="1" valign="top">Receipt of invoice</td><td colspan="1" rowspan="4" valign="top"><p></p><p></p><p></p><p></p><p>Buyer</p></td><td colspan="1" rowspan="2" valign="top">The buyer's PDP 2 makes the invoice available to him. The buyer processes the invoice according to the life-cycle procedure before the recommended "payment forwarded" status.</td></tr>
<tr><td colspan="1" valign="top">6</td><td colspan="1" valign="top">Invoice processing and status update</td></tr>
<tr><td colspan="1" valign="top">7</td><td colspan="1" valign="top">Invoice payment</td><td colspan="1" valign="top"><p>Once the buyer has paid the supplier of the invoice, the latter</p><p>collects payment</p></td></tr>
<tr><td colspan="1" valign="top"><p></p><p>8</p></td><td colspan="1" valign="top">Go to	à	optional/recommended update of issued payment statuses</td><td colspan="1" rowspan="2" valign="top"><p></p><p>The buyer sends the agent a life cycle of the "payment transmitted" status, if completed.</p></td></tr>
<tr><td colspan="1" valign="top">9</td><td colspan="1" valign="top">Receipt of invoice status</td><td colspan="1" valign="top">Agent	for billing</td></tr>
<tr><td colspan="1" valign="top"><p></p><p>10</p></td><td colspan="1" valign="top">Information on progress of invoice processing</td><td colspan="1" valign="top">Agent	for billing</td><td colspan="1" valign="top"><p>If its commercial offer allows it, the agent can send a feed</p><p>to inform the supplier of the progress of invoice statuses</p></td></tr>
<tr><td colspan="1" valign="top">11</td><td colspan="1" valign="top">Collection</td><td colspan="1" valign="top">Supplier</td><td colspan="1" valign="top">Supplier collects payment</td></tr>
<tr><td colspan="1" valign="top"><p></p><p>12</p></td><td colspan="1" valign="top"><p>Go to	à	update	at	status</p><p>"cashed</p></td><td colspan="1" valign="top"><p></p><p>Supplier</p></td><td colspan="1" valign="top"><p>If services, supplier updates status</p><p>and declares payment data via the PPF.</p></td></tr>
<tr><td colspan="1" valign="top"><p></p><p>13</p></td><td colspan="1" valign="top"><p></p><p>Reception	from	status</p><p>"cashed</p></td><td colspan="1" valign="top"><p></p><p>Buyer</p></td><td colspan="1" valign="top"><p>The supplier updates the "cashed" status in his PDP. He can transmit this status to the buyer's PDP 2, depending on the service offer.</p><p>The PDP then sends the payment <i>e-reporting</i> flow to the PPF.</p></td></tr>
</table>

- ### **Option 2: Distinction between depositor and issuer platforms**

- ***Option 2-A:*** The agent's platform forwards invoices to the supplier's platform, which is then responsible for sending them to the customer.
- ***Option 2-B**:* The agent's platform transmits invoices directly to the buyer's platform.

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.032.png)

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.033.png)

<a name="_bookmark47"></a>Figure 21: Invoice issued with billing mandate (option 2)


The specifics of the life cycle or process are :

- Transmission of flow 1 by the billing agent's platform
- Transmission of payment *e-reporting* by the agent's or supplier's platform, depending on the billing mandate contracted
- Use block EXT-FR-FE-BG-05 - BILLING AGENT to enter information about the billing agent.

The steps for case n°19a - option 2 are :


|<p></p><p>**Step**</p>|<p></p><p>**Stage name**</p>|**Responsible player**|<p></p><p>**Description**</p>|
| :- | :- | :- | :- |
|<p></p><p>1</p>|Billing mandate|<p></p><p>Supplier</p>|The supplier and the agent enter into an invoicing agreement so that the agent can submit invoices on behalf of the supplier.|

<table><tr><th colspan="1" valign="top"><p></p><p>2</p></th><th colspan="1" valign="top"><p></p><p>Verification of mandate</p></th><th colspan="1" rowspan="2" valign="top">Billing agent</th><th colspan="1" rowspan="2" valign="top"></th></tr>
<tr><td colspan="1" valign="top"><p></p><p>3</p></td><td colspan="1" valign="top">Transmission and validation of draft invoice</td></tr>
<tr><td colspan="1" valign="top">4</td><td colspan="1" valign="top">Invoice creation</td><td colspan="1" valign="top">Billing agent</td><td colspan="1" valign="top">The agent's PDP 2 platform transmits a stream 2 to the buyer's PDP 3, in parallel with the PPF (stream 1) for transmission of invoicing data.</td></tr>
<tr><td colspan="1" valign="top"><p>4 b and</p><p>5</p></td><td colspan="1" valign="top">Receipt of invoice</td><td colspan="1" valign="top"><p>Supplier</p><p>Buyer</p></td><td colspan="1" valign="top">The supplier receives the invoice on his platform</td></tr>
<tr><td colspan="1" valign="top"><p></p><p>6</p></td><td colspan="1" valign="top"><p></p><p>Invoice processing and status update</p></td><td colspan="1" valign="top"><p></p><p>Buyer</p></td><td colspan="1" valign="top">The buyer's PDP 3 makes the invoice available to him. The buyer processes the invoice according to the life-cycle procedures before the recommended "payment forwarded" status.</td></tr>
<tr><td colspan="1" valign="top">7</td><td colspan="1" valign="top">Invoice payment</td><td colspan="1" valign="top">Buyer</td><td colspan="1" valign="top">Once the buyer has paid the supplier for the invoice, the supplier collects the payment.</td></tr>
<tr><td colspan="1" valign="top">8</td><td colspan="1" valign="top">Update payment issued status</td><td colspan="1" valign="top">Buyer</td><td colspan="1" rowspan="2" valign="top"><p></p><p>The buyer sends the agent a life cycle of the "payment forwarded" status, if completed.</p></td></tr>
<tr><td colspan="1" valign="top">9</td><td colspan="1" valign="top"><p>Receipt of</p><p>invoice</p></td><td colspan="1" valign="top"><p>Agent of</p><p>billing</p></td></tr>
<tr><td colspan="1" valign="top"><p></p><p>10</p></td><td colspan="1" valign="top">Information	on the progress of invoice processing</td><td colspan="1" valign="top">Billing agent</td><td colspan="1" valign="top">If his commercial offer allows it, the agent can send a lifecycle flow to inform the supplier of the progress of invoice statuses.</td></tr>
<tr><td colspan="1" valign="top">11</td><td colspan="1" valign="top">Collection</td><td colspan="1" valign="top">Supplier</td><td colspan="1" rowspan="2" valign="top"><p>The supplier collects the payment and updates the status in his MPS.</p><p>The "cashed" status if services are provided. As a result, PDP1 sends the status</p><p>The third party's PDP2 and/or the buyer's PDP3 will be "cashed out", depending on the service offered.</p></td></tr>
<tr><td colspan="1" valign="top"><p></p><p>11b</p></td><td colspan="1" valign="top"><p></p><p>Declaration	of	status</p><p>"of the invoice</p></td><td colspan="1" valign="top"><p></p><p>Supplier</p></td></tr>
<tr><td colspan="1" valign="top"><p></p><p>12</p></td><td colspan="1" valign="top"><p></p><p>Declaration	of	status</p><p>"of the invoice</p></td><td colspan="1" valign="top"><p></p><p>Supplier</p></td><td colspan="1" valign="top">As part of the service offer or billing mandate, the PDP2 can send the <i>e-reporting</i> flow. However, from a legal point of view, it is the supplier who is responsible for declaring the <i>e-reporting</i> flow.</td></tr>
</table>





1. <a name="_bookmark48"></a>**Case 19b: Self-billing**

The invoice is issued by the buyer's platform.

The specific features of the data and associated management rules are :

- Invoice type (BT-3) to "389 - Self-billed".
- If the invoice is rejected, the credit note must mention :
  - Invoice type (BT-3) to "261 - Self-billed credit".
  - Reference to previous invoice (BT-25)

In order to handle other self-billing invoices, the creation of new invoice types has been requested from the standard.

In the case of a self-billed invoice that has been the subject of an assignment of receivables (factoring), the invoice type (BT- 3) to be entered is "*Code to be determined* - Self-billed factoring invoice". (Awaiting standard codes)

The factor must then be entered in block BG-10 (Beneficiary) with the role code "DL" in tag EXT-FR- FE-26 (Beneficiary role code).

For a self-billed down payment invoice, the invoice type (BT-3) to be entered is "*Code to be determined* - Self-billed down payment invoice". (Awaiting standard codes)

For a self-billed rectifying invoice, the invoice type (BT-3) to be entered is "*Code to be determined* - Self-billed rectifying invoice". (Awaiting standard codes)

For a self-billed, factored corrective invoice, the invoice type (BT-3) to be entered is "*Code to be determined* -".

Self-billed factoring rectifying invoice". (Awaiting standard codes)

For a self-billed credit memo, the invoice type (BT-3) to be entered is "*Code to be determined* - Self-billed credit memo". (Awaiting standard codes)

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.034.png)

<a name="_bookmark49"></a>Figure 22: Self-billing


The specific features of the associated life cycle or process are :

- A billing mandate must be drawn up between the two parties
- The process is "reversed": the invoice is sent by the customer to the supplier. The blocks remain the same: SELLER = supplier / service provider; BUYER = customer = invoicing party.
- Transmission of stream 1 by the buyer's platform.
- Transmission of *e-reporting of* payment data via the supplier's platform, where applicable (service provision).

The steps for case 19b are :


<table><tr><th colspan="1" valign="top"><p></p><p><b>Step</b></p></th><th colspan="1" valign="top"><p></p><p><b>Stage name</b></p></th><th colspan="1" valign="top"><b>Responsible player</b></th><th colspan="1" valign="top"><p></p><p><b>Description</b></p></th></tr>
<tr><td colspan="1" valign="top"><p></p><p>1</p></td><td colspan="1" valign="top">Billing mandate</td><td colspan="1" valign="top">Supplier Buyer	/ Agent</td><td colspan="1" valign="top">The supplier and the purchaser/contractor enter into an invoicing agreement so that the purchaser/contractor can submit invoices on behalf of the supplier.</td></tr>
<tr><td colspan="1" valign="top">2</td><td colspan="1" valign="top">Invoice creation</td><td colspan="1" valign="top"><p>Buyer	/</p><p>representative</p></td><td colspan="1" valign="top"><p>The buyer/contractor sends a flow 2 to the supplier's PDP and</p><p>in parallel with flow 1 to the PPF for transmission of billing data.</p></td></tr>
<tr><td colspan="1" valign="top"><p></p><p>3</p></td><td colspan="1" valign="top"><p></p><p>Receipt of invoice</p></td><td colspan="1" valign="top"><p></p><p>Supplier</p></td><td colspan="1" valign="top"><p>The supplier's PDP 1 receives the invoice. 2 possibilities:</p><p>1. Invoice validation / Lifecycle transmission to buyer's PDP 2</p><p>2. Rejection of invoice / transmission of life cycle to buyer's PDP 2</p></td></tr>
<tr><td colspan="1" valign="top">4</td><td colspan="1" valign="top">Validation</td><td colspan="1" valign="top">Supplier</td><td colspan="1" valign="top">Supplier's PDP1 transmits an invoice validation lifecycle to buyer's PDP2</td></tr>
<tr><td colspan="1" valign="top"><p></p><p>4b</p></td><td colspan="1" valign="top"><p></p><p>Refusal</p></td><td colspan="1" valign="top"><p></p><p>Supplier</p></td><td colspan="1" valign="top"><p>The supplier's PDP 1 transmits a rejection life cycle to the buyer's PDP 2 and to the PPF. If the invoice is rejected, the</p><p>associated flow 1.</p></td></tr>
<tr><td colspan="1" valign="top">5b</td><td colspan="1" valign="top">Receipt of refusal</td><td colspan="1" valign="top">Buyer	/ Agent</td><td colspan="1" valign="top">Buyer/contractor receives invoice rejection</td></tr>
<tr><td colspan="1" valign="top"><p></p><p>6b</p></td><td colspan="1" valign="top"><p></p><p>Issuing a credit note</p></td><td colspan="1" valign="top">Buyer	/ Agent</td><td colspan="1" valign="top"><p>Transmission of a credit note from buyer's PDP 2 to supplier's PDP 1</p><p>and in parallel with the PPF (flow 1 associated with the credit note) for transmission of billing data.</p></td></tr>
<tr><td colspan="1" valign="top">7b</td><td colspan="1" valign="top">Receipt of credit note</td><td colspan="1" valign="top">Supplier</td><td colspan="1" valign="top">Supplier's PDP 1 receives the credit note</td></tr>
<tr><td colspan="1" valign="top"><p></p><p>5</p></td><td colspan="1" valign="top"><p>Invoice payment and	update</p><p>optional/recommended</p><p>status</p></td><td colspan="1" valign="top"><p></p><p>Buyer	/ Agent</p></td><td colspan="1" rowspan="2" valign="top"><p></p><p>The buyer's PDP 2 makes the payment, and may transmit an optional "Payment transmitted" status life cycle to the supplier's PDP 1.</p></td></tr>
<tr><td colspan="1" valign="top">6</td><td colspan="1" valign="top">Receipt of articles of association</td><td colspan="1" valign="top">Supplier</td></tr>
<tr><td colspan="1" valign="top">7</td><td colspan="1" valign="top">Collection</td><td colspan="1" valign="top">Supplier</td><td colspan="1" rowspan="3" valign="top"><p></p><p>Supplier collects payment. The supplier's PDP 1 transmits the status "cashed" to the PPF and to the buyer's PDP 2 if the invoice is for the provision of services.</p></td></tr>
<tr><td colspan="1" valign="top">8</td><td colspan="1" valign="top"><p>Go to	à	update	at	status</p><p>"cashed</p></td><td colspan="1" valign="top">Supplier</td></tr>
<tr><td colspan="1" valign="top">9</td><td colspan="1" valign="top"><p>Reception	from	status</p><p>"cashed</p></td><td colspan="1" valign="top">Buyer	/ Agent</td></tr>
</table>






1. <a name="_bookmark50"></a>**Cases 20 and 21: Down-payment invoice and final invoice after down-payment**

A payment on account for a purchase or the provision of a service implies a firm commitment by both parties and constitutes a deposit. All taxable persons are required to issue an invoice for down-payments (article 289-I.1.c of the CGI) before any of the transactions referred to in a and b of 1 of I of the same article are carried out (unless an exception is expressly provided for). VAT is payable on receipt of the deposit for both supplies of goods and services.

The buyer pays an initial instalment on the sum due for a purchase of goods or services. For example, when a company hires the services of a removal company, it must pay part of the total sum before the move is carried out. The moving company issues a deposit invoice, and a final invoice after the deposit has been paid.

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.035.png)

<a name="_bookmark51"></a>Figure 23: Down-payment invoice and final invoice after down-payment



The specific characteristics of the data and associated management rules are :

- The down-payment invoice must mention :
  - Invoice type (BT-3) : 386 : Down payment invoice
  - A billing frame (BT-23) :

If it's a deposit invoice not yet paid, use the codes :

- B1: Submission of a goods invoice
- S1: Submission of a service invoice
- M1: Submission of a double invoice (delivery of goods and provision of services that are not incidental to each other)

If this is a prepaid invoice, use codes: :

- B2: Deposit of an invoice for goods already paid
- S2: Deposit of a previously paid service invoice
- M2: Submission of a double invoice already paid
- The final invoice must show :
  - Invoice type (BT-3) : 380 : Commercial invoice
  - A billing frame (BT-23) :
    - B4: Submission of final invoice (after deposit) for goods
    - S4: Submission of a final invoice (after deposit) for services
    - M4: Submission of a double final invoice (after deposit)
  - The total tax base and VAT amount must correspond to the tax base and the relevant VAT still due*, i.e. after* deduction of the advance payment and the relevant VAT, in order to avoid increasing the tax base:
    - **It is advisable to include this information in the invoice lines** (Block REFERENCE LINES FACTURE ANTERIEURE - EXT FR FE BG 06) and to inform the stakeholders and be able to determine the correct VAT base and amount. Nevertheless,

to circumvent certain limitations (particularly in terms of accounting management), it is possible to indicate the amount of the advance payment, exclusive of VAT, in the invoice note, so that the company can take the total amount of the operation into account in its accounting.

- If the down payment is not included on the invoice lines, the VAT on the down payment will be taken into account twice: a correction of the pre-filled VAT return will then be essential.
- Down payment invoice reference and date (BT-25 and BT-26)
- Optional: Amount already paid on account (BT-113)
- Outstanding amount incl. VAT (BT-115): processing this data is not compulsory, but it makes the invoice easier to read.

N.B.: In the case of final invoices, a distinction must be made between the mandatory information on invoices (flow 2) and the data to be transmitted to the authorities (flow 1), in particular payment data. Thus, the down payment must be included on the final invoice, whether for goods or services (the invoicing frame is B4 for a final invoice for the sale of goods), with the same tags as those mentioned above (BT-25, BT-26, BT-113, BT-115).

On the other hand, the French tax authorities are unable to impose the transmission of data relating to the down payment on deliveries of goods in the payment e-reporting system under the current legislation.

GT PUBLISHERS June and July: specify that the precise name and date of payment of the deposit are compulsory but remain optional since they must be determined on the day the invoice is issued.

\+ see PAYMENT DATE field for exchanges with CyS (no need for extension).

\+ in the case of a down-payment not paid by the date of issue of the final invoice, perhaps specify that it should not appear on the final invoice, or in any case that it should not reduce the total VAT base and amounts.



The specifics of the life cycle or process are :

- Transmission of stream 1 and, if applicable (PS), *e-reporting* of payment data concerning the **down payment invoice** by the supplier's platform,
- Transmission of stream 1 and, where applicable (PS), *e-reporting of* payment data concerning the **final invoice** by the supplier's platform.

The services offered by PPF are :
<table><tr><th colspan="1" valign="top"><p></p><p></p></th><th colspan="1" valign="top"><p></p><p></p></th><th colspan="1" valign="top"></th><th colspan="1" valign="top"><p></p><p></p></th></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="1" rowspan="2" valign="top"></td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="1" valign="top"><p></p><p></p></td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="1" rowspan="3" valign="top"><p></p><p></p><p></p><p></p></td><td colspan="1" rowspan="3" valign="top"><p></p><p></p><p></p></td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td></tr>
<tr><td colspan="1" valign="top"><p></p><p></p></td><td colspan="1" valign="top"><p></p><p></p><p></p></td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td><td colspan="1" rowspan="3" valign="top"><p></p><p></p><p></p></td><td colspan="1" rowspan="3" valign="top"><p></p><p></p></td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"><p></p><p></p></td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"><p></p><p></p></td><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top"><p></p><p></p></td><td colspan="1" valign="top"></td><td colspan="1" valign="top"></td></tr>
</table>


- ![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.036.png)Actors who are connected to the PPF will be notified in the event of a change in invoice status The steps in cases 20 and 21 are :

1. `	`**<a name="_bookmark52"></a>Case 22a: Invoice paid with discount for services for which VAT is due on collection**

Discounting is an opportunity offered to customers to pay their invoices more quickly than expected, in exchange for a rebate. The amount of the discount does not appear on the invoice issued; only a statement detailing the discount conditions is shown on the invoice.

In the case of services, the administration will be able to take into account the discount granted thanks to the payment data transmitted. The "cashed" status will be enriched with the amount cashed (incl. VAT - discount).

For supplies of goods or operators who have opted for debits, as well as discounts net of tax, please refer to case 22b.

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.037.png)

<a name="_bookmark53"></a>Figure 24: Invoice paid with discount (service provision, VAT due on collection)


The specific characteristics of the data and associated management rules are :

- Invoice note (BT-21/BT-22) with
  - Subject code: "AAB
  - Text: mention discount

The specifics of the life cycle or process are :

- Transmission of flow 1 and *e-reporting* of payment data by supplier's platform
- The creation of a discount does not require the issue of a credit note if it is stated on the invoice that the deductible tax is limited to the price actually paid by the buyer.


The services offered by PPF are :

- Actors connected to the PPF will be notified of any change in invoice status.

The steps in case 22a are :


<table><tr><th colspan="1" valign="top"><p></p><p><b>Step</b></p></th><th colspan="1" valign="top"><p></p><p><b>Stage name</b></p></th><th colspan="1" valign="top"><b>Responsible player</b></th><th colspan="1" valign="top"><p></p><p><b>Description</b></p></th></tr>
<tr><td colspan="1" valign="top"></td><td colspan="1" valign="top">Invoice creation showing amount before tax, VAT, discount percentage and due date, as well as the amount of VAT deductible by the buyer</td><td colspan="1" valign="top"><p></p><p></p><p>Supplier</p></td><td colspan="1" rowspan="2" valign="top"><p></p><p></p><p>The invoice is created by the supplier and sent to the buyer. At the same time, a flow 1 is sent by the supplier's PDP 1 to the PPF.</p></td></tr>
<tr><td colspan="1" valign="top">2</td><td colspan="1" valign="top">Receiving stream 1</td><td colspan="1" valign="top"><p>PDP</p><p>Supplier</p></td></tr>
<tr><td colspan="1" valign="top">3</td><td colspan="1" valign="top">Receipt of invoice</td><td colspan="1" rowspan="3" valign="top"><p></p><p></p><p>Buyer</p></td><td colspan="1" rowspan="3" valign="top">The buyer receives the invoice, processes it and updates the invoice status according to the life-cycle procedure. Then, before the due date, he pays the supplier the amount including VAT reduced according to the percentage on the amount excluding VAT, and the VAT on this discounted amount excluding VAT. He updates the statuses via his MPS.</td></tr>
<tr><td colspan="1" valign="top">4</td><td colspan="1" valign="top">Processing and updating bylaws</td></tr>
<tr><td colspan="1" valign="top"><p></p><p>5</p></td><td colspan="1" valign="top">Payment of invoice and update of articles of association</td></tr>
<tr><td colspan="1" valign="top">6</td><td colspan="1" valign="top">Receipt of invoice status</td><td colspan="1" rowspan="3" valign="top"><p></p><p>Supplier</p></td><td colspan="1" rowspan="3" valign="top">The supplier receives the invoice status via his MPS and collects the invoice. He then updates the "cashed" status with the amount cashed after discount.</td></tr>
<tr><td colspan="1" valign="top">7</td><td colspan="1" valign="top">Collection</td></tr>
<tr><td colspan="1" valign="top">8</td><td colspan="1" valign="top">Update "cashed" status</td></tr>
<tr><td colspan="1" valign="top">9</td><td colspan="1" valign="top">Receipt of "cashed" status</td><td colspan="1" valign="top">Buyer</td><td colspan="1" valign="top">The buyer's PDP 2 provides him with the invoice's "cashed" status.</td></tr>
<tr><td colspan="1" valign="top">10</td><td colspan="1" valign="top">Receipt of payment data <i>e-reporting</i> flow</td><td colspan="1" valign="top">PPF</td><td colspan="1" valign="top">The supplier's PDP 1 accordingly sends <i>the</i> payment <i>e-reporting</i> flow to the PPF.</td></tr>
</table>


1. <a name="_bookmark54"></a>**Case 22b: Invoice paid with discount for the supply of goods (or PS with VAT option on debits)**

If a discount is applied when the supplier has made a supply of goods or opted to pay VAT on debits, the payment data is not transmitted and is not taken into account by the tax authorities. As a result, the tax authorities have no way of knowing the discount granted by the supplier, and can therefore reduce the VAT collected by the same amount.

The supplier could inform the tax authorities of the application of a discount by issuing a credit note. This is an option, as discount credit notes are not provided for by law.

This option is available to companies wishing to avoid having to make a *subsequent* adjustment to their output VAT, which may have been unduly increased.

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.038.png)

<a name="_bookmark55"></a>Figure 25: Invoice paid with discount (case of supply of goods or services with VAT on debits)


The specifics of the data and associated management rules are :

- On initial invoice :
  - Invoice note (BT-21/BT-22) with
    - Subject code: "AAB
    - Text: mention discount
- If credit note, amount before tax = discount granted before tax; VAT = VAT on amount discount granted / calculated
  - Possibility of using invoice type (BT-3): 381 or 261 (Credit note or self-billed credit note)
  - A discount can also be net of tax, in which case the credit note must include :
    - VAT type code (BT 118) : E
    - VAT exemption reason code (BT-121): VATEX-CNWVAT This code applies to all types of credit note net of tax.

      The specific features of the associated life cycle or process are :

- Transmission of invoice (flow 2) mentioning terms and conditions of discount application
- Lifecycle transmission (flow 6)
- Transmission of a credit note (flow 2) showing the amount of discount applied


1. <a name="_bookmark56"></a>**Case 23: Self-billing flow between a private individual and a professional**

A private individual who repeatedly sells or offers services to a professional carries out a commercial activity on a regular basis and is therefore liable for VAT.

It may not be liable for VAT if it benefits from the basic exemption system (article 293 B of the General Tax Code), but falls within the scope of electronic invoicing.

In most cases, it is the recipient (energy supplier) who issues the invoice. For self-billing by the customer, please refer to use case 19b of the external specifications.

There is an exception for sales of photovoltaic energy by private individuals from an installation whose output does not exceed 3kWp (see BOI BIC CHAMP 80 30 and BOI-TVA-LIQ-30-20-90-20, § 260). These operators are not subject to VAT and are therefore not covered by *e-invoicing* or *e-reporting*.








1. <a name="_bookmark57"></a>**Case 24: Managing deposits**

Deposits are defined as sums paid by way of forfeit (article 1590 of the French Civil Code): in this case, the buyer may cancel the sale, renouncing his purchase by forfeiting this sum. If the deposit is an indemnity, i*.e.* does not constitute payment for a service (absence of consideration), it is not included in the taxable base for VAT.

In commercial matters, sums paid in advance more often take the form of a deposit on the sale price.

from which the parties cannot withdraw.

Deposits are compensation for commercial loss, and are not subject to VAT; they are not covered by *e-invoicing* or *e-reporting*. It is advisable to specify the nature of this sum in the contract or receipt given to the buyer.






1. <a name="_bookmark58"></a>**Case 25: Gift voucher and card management**

Vouchers and gift cards may be single-use or multiple-use, depending on whether or not the place of delivery of the goods or supply of the services and the VAT due on these goods or services are known at the time of issue.

### **Examples**:
- A single-use voucher entitles the holder to a certain number of showings at a venue for which the place of taxation and VAT rate are determined.
- A gift card that gives access to different goods or services in a network of stores for which the place of taxation and VAT rate are indeterminate constitutes a multiple-use voucher.

1. Principle of the single-use voucher (BUU)

Step 1 - Issuing the voucher :

The sale of a single-use voucher is subject to VAT when, at the time of issue, the place of supply of goods or services to which the voucher relates and the related VAT are known (base, rate, territoriality). The sale of a single-use voucher is subject to VAT on each transfer, and this VAT is payable under the conditions applicable to the underlying transaction: supply of goods or services (cf. article 269 and BOI-TVA - BASE-20-40). Thus, if the underlying transaction linked to the BUU constitutes a supply of goods, VAT will be payable when the voucher is handed over, and if the underlying transaction linked to the voucher constitutes a supply of services, VAT will be payable when the price relating to the acquisition of the voucher is collected. The physical delivery of goods or the actual provision of services in exchange for a BUU accepted in full or partial consideration by the supplier or service provider is not considered a separate transaction.

Each subsequent transfer of the single-use voucher will also be subject to VAT, which will be payable under the same conditions as the first transfer.

Each transfer of the single-use voucher by a taxable person will fall within the scope of *e-invoicing* (sale of gift cards to a taxable person) or *e-reporting* (sale to private individuals) for the company selling it.

Step 2 - Using the gift voucher

The use of the single-use voucher by its beneficiary (voucher holder) in exchange for the supply of goods or services is not subject to VAT.

On the other hand, when the issuer of the BUU is distinct from the supplier or provider of the service or delivery linked to the BUU, the supplier or provider is deemed to have delivered or supplied the goods or services linked to this voucher to this taxable person, and must therefore invoice the issuer for this service (*e-invoicing).*

The VAT relating to this transaction will be payable under the same conditions as the underlying transaction. Thus, when the voucher gives access to a service, VAT will be payable when the sums invoiced by the service provider to the issuer are collected. Where the voucher gives access to goods, VAT is payable when the goods are delivered in exchange for the voucher.

When the issuer of the voucher is also the supplier or service provider, the delivery of the voucher in exchange for goods or services to the customer is not subject to VAT, as it is not considered a separate transaction from the sale of the voucher (see step 1).

Commissions or management fees may be charged throughout the voucher marketing chain, and are subject to VAT. They must be invoiced separately, including the relevant VAT, and this invoicing will fall within the scope of *e-invoicing*.

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.039.png)

<a name="_bookmark59"></a>Figure 26: Management of single-use vouchers



1. Principles of the multi-purpose voucher (MPV)

Step 1 - Issuing the voucher

The sale of a multi-purpose voucher is not subject to VAT if, at the time of issue, the place of supply of the goods or services and the VAT due on these goods or services are not known.

The sums paid for the acquisition of multi-purpose vouchers are outside the scope of VAT and do not fall within the scope of electronic invoicing or *e-reporting*.

Step 2 - Using the gift voucher

The use of the multi-purpose voucher by its beneficiary (voucher holder) in exchange for a supply of goods or services is subject to VAT. This is a transaction between a taxable person and a non-taxable person, which falls within the scope of *e-reporting*.

VAT is payable under the same conditions as the underlying transaction. Thus, the tax is due on the date of

acceptance of the multi-purpose voucher by the supplier in the case of a voucher giving access to a good.

If the multi-purpose voucher gives access to a service for the benefit of its beneficiary (voucher holder), the voucher becomes payable upon collection of the transaction price, i.e. when the issuing company collects the reimbursement.

When the issuer of the voucher is also the service provider, giving the voucher in exchange for a service will make the

VAT due.

Commissions or management fees may be charged throughout the BUM marketing chain, and are subject to VAT. They must be invoiced separately, including the relevant VAT, and this invoicing will fall within the scope of *e-invoicing*.

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.040.png)

<a name="_bookmark60"></a>Figure 27: Management of multiple-use vouchers










1. <a name="_bookmark61"></a>**Case 26: Invoices with contractual reserve clause**

Case of invoices 95% paid by the customer with a contractual reserve clause generating a 5% withholding.

- ### **Deliveries of goods** :
In the absence of *e-reporting* of payment data, this deduction has no VAT impact until it

becomes definitive.

In the case of supplies of goods, the amount collected has no impact on VAT liability. The supplier must issue a credit note in the event of a holdback.

- ### **Services** :
Payment data taken into account indirectly via *e-reporting.* Only amounts collected are subject to VAT.

*E-reporting of* payment data: partial payment of 95% taken into account. Withholding of 5% to be declared once paid.

In the case of partial payment, only VAT on the amount collected will be due.

The supplier must issue a credit note in the event of the retention of guarantee. In the absence of payment

of the 5%, no *e-reporting of* payment of the remaining 5%.

















1. <a name="_bookmark62"></a>**Case 27: Managing toll tickets**

In principle, toll tickets collected by a taxable person fall within the scope of electronic invoicing, but there is a certain tolerance in administrative doctrine concerning them.

Receipts issued at toll gates showing :

- VAT rate and amount
- a sequential issue number
- a space reserved for the user

The customer is not known to the issuing taxable person: transactions which may resemble BtoC transactions.

### **Solution:**
- ***E-reporting* of transactions** with daily global data transmission
- The administration will be able to pre-fill the issuer's output VAT but not the user's input VAT.

  subject

- No need to adapt information on receipts issued by vending machines
- ***E-invoicing in the case of subscription or flow-through card by a taxable person***
- Invoices issued in connection with subscriptions or flow-through cards must include all mandatory information

1. <a name="_bookmark63"></a>**Case 28: Managing restaurant bills**

In principle, restaurant bills to a taxable person fall within the scope of electronic invoicing, but there is an administrative tolerance for bills under €150 excluding VAT.

- Notes under €150 excluding VAT may not include customer identification details.
- When the amount of the service is less than €25 and the customer (non-merchant) does not request it

  If requested, the service provider is not obliged to issue a note.

To take this tolerance into account, the following solution has been adopted:

- ***E-reporting* of transactions under €150 excluding VAT** (including those under €25) by transmission of the

  daily global data, unless expressly requested by the taxable customer.

- ***E-invoicing* mandatory for notes over €150 excluding VAT** to a taxable person.

Management of a note with a **non-taxable** customer :

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.041.png)

<a name="_bookmark64"></a>Figure 28: Managing restaurant bills


Management of a note for which the customer is **liable** but not determined as such at the time of the transaction, or

less than €150 excluding VAT :

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.042.png)

<a name="_bookmark65"></a>Figure 29: Transaction data declaration for notes under 150 euros



Management of a bill for which the customer is a **taxable person**, designated as such, or bills in excess of €150 excluding VAT:

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.043.png)

<a name="_bookmark66"></a>Figure 30: Issuing/transmitting an electronic invoice for bills over 150 euros





1. <a name="_bookmark67"></a>**Case n°29: Single taxpayer within the meaning of article 256 C of the CGI**

This management case concerns transactions external to the single taxable person, i.e. transactions between a member

of a single taxable person and a third party to that single taxable person.

Transactions between members of a single taxable entity are outside the scope of e-invoicing and will not be managed by the PPF (see PDP service offering).

As part of the process of bringing France's VAT group into line with the VAT Directive 2006/112/EC (already implemented in 20 EU member states), a VAT identifier and a SIREN will be created for the single taxable entity, which will become solely liable for VAT on behalf of all its members. These two identifiers will have to be indicated, in addition to their own identifiers, on all invoices issued by members of the single taxable entity on its behalf.

The conditions for adding this data to the standard are currently being studied.


In the case of a single taxpayer :

- Data relating to the member of the single taxable person must appear in the VENDOR block (BG-4). Field BT-29a should be used to enter the SIREN of the single taxable person. The statement "Member of a single taxable person", mandatory for all invoices issued to a single taxable person, must be entered in the invoice note in BT-21 (see G1.52), with a note subject code of "TXD".

- In the absence of a block dedicated to the single taxable person in standard EN16931, data relating to the single taxable person, other than the SIREN, must appear in the VENDOR'S TAX REPRESENTATIVE block (BG-11).



The business rules dedicated to the single taxable person are G1.76, G1.78, G1.79 and G1.52 (see Appendix 7).





1. <a name="_bookmark68"></a>**Case n°30: VAT already collected - Transactions initially processed in B2C *e-reporting*, subject to *subsequent* invoicing**

This case study illustrates the management of transactions between taxable persons subject to *e-invoicing* that have been recorded in a cash register software or system (B2C transaction).

More generally, it applies to all cases where the transaction is recorded in a cash register, is subject to B2C *e-reporting*, and is then billed electronically at the customer's request. In particular, it can be used for restaurant bills that are subsequently invoiced.


Example:

A floral decorator provides both services (event manager) and sales (plants) for B2B (hotel) and B2C (private) customers. He records his transactions via a software or cash register system. He is subject to electronic invoicing for B2B operations and *e-reporting* for B2C operations. For the latter, he transmits his transaction and payment data at F frequency.

Step 1 - Posting the B2C transaction

The floral decorator carries out a B2C transaction paid for in cash. The Z ticket for the day's activity refers to all the transactions carried out that day. The floral decorator transmits his cumulative transaction data via an *e-reporting* flow (flow 10.3) and, if he provides services, a payment e-reporting flow (flow 10.4) for each day of the *e-reporting* period.

Step 2 - Issuing a B2B invoice

One of its customers turns out to be a professional and asks for an invoice in order to exercise the right to deduct.

VAT for its transaction.

The floral decorator then issues an electronic invoice. To neutralize the double accounting of VAT and VAT exclusive, this invoice should mention the corresponding invoicing frame created for this purpose, "VAT already collected". This invoicing frame enables the corresponding invoice data (flow 1) to be transmitted to the tax authorities, indicating that they have already been transmitted via *e-reporting* (flows 10.3 and 10.4), thus enabling the customer's deductible VAT to be determined, while avoiding double accounting for the retailer.

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.044.png)

<a name="_bookmark69"></a>Figure 31: Duplicate invoice management


The specific characteristics of the data and associated management rules are :

- Invoicing frame (BT-23) : B7/S7/M7 ("VAT already collected")

The specificities of billing/transaction and payment data transmission are :

- Transmission of an *e-report* of cumulative transaction data (flow 10.3) and payment data (flow 10.4) recorded by the cash register software.
- Transmission of invoice with "VAT already collected" billing frame (flow 2)

The "VAT already collected" invoicing frame can be used in other situations, in particular for invoices to be issued when VAT has been declared by a company on its VAT return for the period due and the invoice is subsequently issued.








1. <a name="_bookmark70"></a>**Case 31: "Mixed" invoices showing a main transaction and an accessory transaction**

This case study illustrates the management of "mixed" invoices/transactions or "single complex transactions" (involving several transaction categories, one of which is incidental to the other). The transaction category is either a delivery of goods or a provision of services.

In accordance with Article 257 *ter* II of the General Tax Code, these are activities whose components are so closely linked that they objectively form a single inseparable economic service, the breakdown of which would be artificial.

Principle :

If an invoice mentions two operations: a first operation considered to be the main operation of the transaction, and a second operation considered to be a secondary operation (associated with the main operation). The way in which billing/transmission and payment data are transmitted for these two operations is determined by the category of the main operation. In fact, payment data need only be transmitted for transactions in the service category, in order to determine the VAT base.

For *e-reporting* not linked to an invoice, and outside the 10.1 invoice data transmission flow, it is up to the issuer to define the transaction category (delivery of goods or provision of services) for the transmission of transaction data.

In *e-invoicing*: a mandatory note on the invoice will indicate the category of operation.

Example:

In addition to the sale of its products, a clothing boutique offers a made-to-measure alteration service. Transactions are carried out on a cash basis, with immediate collection. They are recorded by a software or cash register system.

Payment data must be transmitted for transactions in the SP category in order to determine the VAT base:

- If, following its sale, a product needs to be retouched, the retouching is considered incidental to the sale.

It will therefore not be the subject of an *e-reporting* payment declaration.

- If a customer wishes to have a garment altered (purchased as part of another transaction), then this alteration will be considered as the main transaction and will be subject to an *e-reporting* of payment for the services invoiced (excluding the option to pay VAT on debits).


Case 1: Retouching is associated with the sale of a costume. The main transaction is a delivery of goods

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.045.png)

<a name="_bookmark71"></a>Figure 32: Mixed invoice with main and accessory operations categorized as a sale (case of a sales touch-up)

Case 2: retouching is the main operation of the transaction (with or without ancillary sales). The operation is a service

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.046.png)

<a name="_bookmark72"></a>Figure 33: Invoice with main operation = PS (case of rework with or without sale)


The specificities of billing/transaction and payment data transmission are :

- Transmission of an *e-report of* cumulative transaction data (flow 10.3) recorded by the cash register software, by category of transaction carried out (see rule G1.68 in appendix 7);
- Transmission of an *e-report of* cumulative payment data (10.4) recorded by the cash register software for transactions in the service category (TPS1) only.


**Point of attention no. 1:** Invoices for "mixed" operations should be distinguished from invoices for "double" operations, i.e. an invoice that includes both a delivery of goods and a provision of services. Although a category of double transactions is included in the compulsory data to be sent to the authorities, to take account of operators' practices**, it is recommended that, wherever possible, separate invoices be issued** for goods and services, given the different rules governing liability, in order to identify which transactions are covered by the payment e-reporting.

**Note 2:** This case should also be distinguished from the sale of *"packages"* comprising elements subject to a separate VAT regime. In this case, as the EU standard and the UBL and CII formats stand, each item must be treated separately on the invoice (e.g.: in the case of the sale of a toy book, one invoice line must be used for the book and one for the toy).


1. <a name="_bookmark73"></a>**Case 32: Monthly payments**

This case study illustrates how to transmit payment data for monthly instalments.

before an invoice is issued.

In this case, the monthly instalments are declared by means of a transaction *e-reporting* (corresponding to a supply of goods or services subject to VAT) supplemented by a payment e-reporting. The adjustment invoice will be sent :

- As part of a domestic B2B transaction via an *e-invoicing* flow *(flow 2)*
- As part of an international B2B or B2C transaction via an *e-reporting* flow (flow 8, flow 9 or flow 10)

Example:

An energy supplier offers its customers the option of monthly payments based on estimated annual consumption. At the end of the year, the energy supplier issues an adjustment bill, the amount of which is calculated on the basis of each customer's actual consumption.

Case 1: Adjustment invoice shows outstanding balance and no option to pay VAT on debits


Case 1-a: Adjustment invoice shows an outstanding balance (no option on debits by supplier):

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.047.png)

<a name="_bookmark74"></a>Figure 34: Monthly payments and additional payments for B2C (option 1a)


The specificities of billing/transaction and payment data transmission are :

- Transmission of an *e-report* of cumulative data over the period of transactions (flow 10.3) and payments (flow 10.4) relating to monthly payments received, where applicable.
- Issuance of an adjustment invoice with the additional amounts to be paid to the customer (outside the circuit), the total amount exclusive of tax and VAT, and a reminder of the monthly instalments already paid.
- At the same time, transmission of a **net *e-reporting*** equal to the amount of the adjustment invoice minus the reversal of down payments.
- Transmission of payment data (flow 10.4) including the amount collected corresponding to the net amount of the adjustment invoice.

Case 1-b: Adjustment invoice shows an outstanding balance (VAT option on debits by supplier)

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.048.png)

<a name="_bookmark75"></a>Figure 35: Monthly B2C payments and additional payments (option 1b)


The specificities of billing/transaction and payment data transmission are :

- Transmission of an *e-report of* cumulative data over the transaction period (flow 10.3) relating to monthly payments received, where applicable.
- Issuance of an adjustment invoice with the additional amounts to be paid to the customer (outside the circuit), the total amount exclusive of tax and VAT, and a reminder of the monthly instalments already paid.
- At the same time, a net *e-reporting is* sent, equal to the amount of the adjustment invoice minus the amount of the down-payment reversal.

If the supplier has opted to pay VAT on debits, he does not have to transmit payment data, unlike in case 1-a.

Case 2-a: Adjustment invoice shows overpayment (no option on debits by supplier):

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.049.png)

<a name="_bookmark76"></a>Figure 36: Monthly payments and final overpayment for a B2C transaction (option 2.a)


The specificities of billing/transaction and payment data transmission are :

- *E-reporting of* cumulative transaction data (flow 10.3) and payment data (flow 10.4) relating to monthly payments received.
- Issuance of a regularization invoice to the customer (outside the circuit) showing actual consumption and the total amount before tax and VAT.
- At the same time, transmission of a net **negative** *e-reporting* equal to the amount of the adjustment invoice less the reversal of down payments.
- Transmission of payment data (flow 10.4) including the disbursed amount corresponding to the overpayment appearing on the adjustment invoice.

Case 2-b: Adjustment invoice shows overpayment (option on debits by supplier):

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.050.png)

<a name="_bookmark77"></a>Figure 37: Monthly payments and final overpayment for a B2C transaction (option 2.b)


**If the supplier has opted to pay VAT on debits**: the adjustment invoice showing the amount overpaid in negative will be taken into account. No payment data will be transmitted despite the overpayment.

The specificities of billing/transaction data transmission are :

- *e-reporting* of cumulative transaction data (flow 10.3) relating to monthly payments received
- Issue of an adjustment invoice to the customer (out of circuit)




1. <a name="_bookmark78"></a>**Case 33: Transactions subject to the margin system**

Principle :

VAT on the margin is not calculated on the selling price, but on the **difference between the selling price and the margin.**

**of purchase**. The amount of VAT on the margin is not shown on the invoice, which poses a problem for *e-invoicing*.

The VAT margin scheme applies to transactions covered by **e) of 1 article 266** [travel agencies and tour operators] and articles **268** [building land] and **297 A** [second-hand goods, works of art, collectors' items and antiques] of the French General Tax Code.

Example:

A travel agency invoices a single service for the organization of a seminar (flight - hotels - rooms) to a taxable person.

![](Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.051.png)

<a name="_bookmark79"></a>Figure 38: Transactions subject to the margin system



The specific data and associated management rules for *e-invoicing* are :

- Business rule (G1.56) : VAT on the margin
- VAT type code (BT 118) : E
- VAT exemption reason code (BT-121): VATEX-DOM-/F/I/J
- Tax base for VAT type (BT-116): sales price incl. VAT (entered instead of tax base excl. VAT) as specified in BT-112.
- VAT amount of invoice (BT-110): none

the specificities of billing and payment data transmission are :

- Invoice transmission (flow 2)
- Transmission of "cashed" status in the invoice lifecycle (flow 6) because services provided

### **A travel agency invoices a flight+hotel to a private individual:**
The specifics of the data and associated management rules in *e-reporting* are :

- Category of operations: Operations subject to a special scheme for which the VAT margin scheme has been applied (TMA 1);
- Tax base for VAT type: margin amount excluding VAT ;
- Invoice VAT amount equal to margin VAT amount.


1. <a name="_bookmark80"></a>**Case 34: Partial collection and collection cancellation**

Each partial incoming payment (e.g. down payment) must be declared with a lifecycle flow bearing the number

cashed" status. The "amount" field will show the amount collected.

If an encashment is cancelled due to a reconciliation error or fraudulent payment (misappropriation, theft, piracy, etc.), it will be possible to issue a "cashed" status life cycle with a negative amount (amount field).

1. <a name="_bookmark81"></a>**Case 35: Author's notes**


|**OPERATIONS CARRIED OUT BY THE AUTHOR**|**PAYING INSTITUTION**|<p></p><p>**APPLICABLE SYSTEM (EI / ER)**</p>|
| :- | :- | :- |
|<p></p><p>Perception	from	royalties</p>|Publishers, rights collection and distribution companies or producers.|<p>Gives rise to withholding of VAT by the payer</p><p>- E-reporting by the paying institution (no invoice, but a statement of rights in favor of the author)</p>|
|<p></p><p></p><p>Perception	from	royalties</p>|Other than publishers, collecting societies or producers.|<p>No VAT withheld by the payer</p><p>- E-invoicing by author (invoice issued by author) if B/G customer</p><p>- E-reporting if C customer (e.g. non-taxable association).</p>|
|Other	transactions	not subject to withholding|-|<p>- E-invoicing by author (invoice issued by author) if B/G customer</p><p>- E-reporting by author if customer C.</p>|

- **Statements of entitlement** do not fall within the scope of *e-invoicing*.
- **Transactions giving rise to VAT deductions by publishers, collecting societies and producers** fall within the scope of ***e-reporting*** by these companies. There is therefore no need to create a dedicated invoicing framework.
- For **royalties not paid by these bodies**, **authors** are liable for VAT, unless they benefit from the basic exemption system, and are subject, like all taxable persons, to ***e-invoicing / e-reporting*** obligations, depending on whether or not their customer is a taxable person.
- For **operations other than copyright,** authors remain subject to the ordinary law regime, and may fall within the scope of ***e-invoicing*** or ***e-reporting***.

The case of author's notes is presented in order to clarify the application of electronic invoicing and *e-reporting* to this use case. There are no additional obligations in relation to the provisions of article 285 *bis* of the CGI.

1. <a name="_bookmark82"></a>**Case 36: Operations subject to professional secrecy and exchanges of sensitive data**

In order to respect operations subject to professional secrecy (cf. article 226-13 of the French Penal Code - in particular banking secrecy under article L. 511-33 of the French Monetary and Financial Code, or business secrecy under article L. 151-1 of the French Commercial Code), as well as sensitive data covered by ministerial instruction n°900/ARM/CAB/NP of March 15, 2021, the operators concerned may serve a generic statement concerning the precise name of the good or service rendered, which must be mentioned in the "item name" field (BT-153) of flows 2 and 1. To meet their obligations to their customers, however, they must specify the operation carried out. This information can be transmitted via the BT-154 tag in Stream 2, providing both parties to the transaction with details. Only the parties mentioned on the invoice will have access to this field, which is only present in flow 2. Only the BT-153 field, containing very general information, will be transmitted to the tax authorities.



2. # <a name="_bookmark83"></a>**Contact**

Please address your questions/comments to the teams in charge of the project:

- <mission.facturation-electronique@dgfip.finances.gouv.fr>
- <fe2023.aife@finances.gouv.fr>

[ref1]: Aspose.Words.cdf5b729-81b0-43d7-896f-34c0dfd0a151.009.png
