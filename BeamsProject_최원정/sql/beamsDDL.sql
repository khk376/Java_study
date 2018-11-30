drop table product_info cascade constraint;
drop table Brand_info cascade constraint;
drop table Branch_info cascade constraint;
drop table Stock_info cascade constraint;

create table Product_info(
   Procode char(10)  primary key,
   ProName char(30),
   Price number(10),
   color char(10),
   category char(10)
   );

create table Brand_info(
   Brdcode char(10),
   BrdName char(10),
   ProCode char(10) constraint Brand_info_ProCode_fk references Product_info(Procode),
   constraint br_PK primary key (brdcode, procode)
   );

create table Branch_info(
   Brcode char(10)  primary key,
   BrName char(10),
   LocName char(10)
   );