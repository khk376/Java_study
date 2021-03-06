insert all
into Product_info values('D-79813490', 'French work jacket', '249000', 'dark blue', 'jacket')
into Product_info values('D-32457908', 'Tussah down jacket', '429000', 'black', 'jacket')
into Product_info values('D-21378902', 'Shawl collar jacket', '209000', 'offwhite', 'jacket')
into Product_info values('D-34394781', 'Corduroy cap', '54000', 'black', 'cap')
into Product_info values('D-23323789', '3-way bag', '95000', 'navy', 'bag')
into Product_info values('L-52390783', 'Wool rider Jacket', '219000', 'khaki', 'jacket')
into Product_info values('L-68453990', 'chesterfield coat', '349000', 'olive', 'jacket')
into Product_info values('L-98325239', 'Mid Century Cut Pants', '129000', 'grey', 'pants')
into Product_info values('L-57924223', 'Gurkha pants', '99000', 'beige', 'pants')
into Product_info values('L-49789023', 'West coast T', '45000', 'white', 'T-shirts')
into Product_info values('F-43578932', 'Brief case', '442000', 'black', 'bag')
into Product_info values('F-14868625', 'Nylon back-pack', '230000', 'black', 'bag')
into Product_info values('F-64856334', 'Business bag', '270000', 'brown', 'bag')
into Product_info values('F-46832359', 'Leather tote bag', '130000', 'navy', 'bag')
into Product_info values('F-45723893', 'Shoulder bag', '170000', 'brown', 'bag')
select*from dual;

insert all
into Brand_info values('L-1001', 'Lebeau', 'L-52390783')
into Brand_info values('L-1001', 'Lebeau', 'L-68453990')
into Brand_info values('L-1001', 'Lebeau', 'L-98325239' )
into Brand_info values('L-1001', 'Lebeau', 'L-57924223' )
into Brand_info values('L-1001', 'Lebeau', 'L-49789023' )
into Brand_info values('D-3002', 'DANTON', 'D-79813490' )
into Brand_info values('D-3002', 'DANTON', 'D-32457908' )
into Brand_info values('D-3002', 'DANTON', 'D-21378902' )
into Brand_info values('D-3002', 'DANTON', 'D-34394781' )
into Brand_info values('D-3002', 'DANTON', 'D-23323789' )
into Brand_info values('F-2005', 'FELISI', 'F-43578932' )
into Brand_info values('F-2005', 'FELISI', 'F-14868625' )
into Brand_info values('F-2005', 'FELISI', 'F-64856334' )
into Brand_info values('F-2005', 'FELISI', 'F-46832359' )
into Brand_info values('F-2005', 'FELISI', 'F-45723893' )
select * from dual;

insert all
into Branch_info values('S-001', '신촌점', '서울')
into Branch_info values('S-002', '송도점', '인천')
into Branch_info values('S-003', '서현점', '분당')
select*from dual;

insert all
into Stock_info values('S-001', 'D-79813490',20180824,50)
into Stock_info values('S-001', 'D-32457908',20180824,50)
into Stock_info values('S-001', 'D-21378902',20180824,50)
into Stock_info values('S-001', 'D-34394781',20181019,30)
into Stock_info values('S-001', 'D-23323789',20181012,20)
into Stock_info values('S-001', 'L-52390783',20180913,50)
into Stock_info values('S-001', 'L-68453990',20180913,50)
into Stock_info values('S-001', 'L-98325239',20180927,50)
into Stock_info values('S-001', 'L-57924223',20180927,50)
into Stock_info values('S-001', 'L-49789023',20181004,100)
into Stock_info values('S-001', 'F-43578932',20180903,40)
into Stock_info values('S-001', 'F-14868625',20180903,40)
into Stock_info values('S-001', 'F-64856334',20180910,40)
into Stock_info values('S-001', 'F-46832359',20180917,40)
into Stock_info values('S-001', 'F-45723893',20180917,40)
into Stock_info values('S-002', 'D-79813490',20180824,50)
into Stock_info values('S-002', 'D-32457908',20180824,50)
into Stock_info values('S-002', 'D-21378902',20180824,50)
into Stock_info values('S-002', 'D-34394781',20181019,30)
into Stock_info values('S-002', 'D-23323789',20181012,20)
into Stock_info values('S-002', 'L-52390783',20180913,50)
into Stock_info values('S-002', 'L-68453990',20180913,50)
into Stock_info values('S-002', 'L-98325239',20180927,50)
into Stock_info values('S-002', 'L-57924223',20180927,50)
into Stock_info values('S-002', 'L-49789023',20181004,100)
into Stock_info values('S-002', 'F-43578932',20180903,40)
into Stock_info values('S-002', 'F-14868625',20180903,40)
into Stock_info values('S-002', 'F-64856334',20180910,40)
into Stock_info values('S-002', 'F-46832359',20180917,40)
into Stock_info values('S-002', 'F-45723893',20180917,40)
into Stock_info values('S-003', 'D-79813490',20180824,50)
into Stock_info values('S-003', 'D-32457908',20180824,50)
into Stock_info values('S-003', 'D-21378902',20180824,50)
into Stock_info values('S-003', 'D-34394781',20181019,30)
into Stock_info values('S-003', 'D-23323789',20181012,20)
into Stock_info values('S-003', 'L-52390783',20180913,50)
into Stock_info values('S-003', 'L-68453990',20180913,50)
into Stock_info values('S-003', 'L-98325239',20180927,50)
into Stock_info values('S-003', 'L-57924223',20180927,50)
into Stock_info values('S-003', 'L-49789023',20181004,100)
into Stock_info values('S-003', 'F-43578932',20180903,40)
into Stock_info values('S-003', 'F-14868625',20180903,40)
into Stock_info values('S-003', 'F-64856334',20180910,40)
into Stock_info values('S-003', 'F-46832359',20180917,40)
into Stock_info values('S-003', 'F-45723893',20180917,40)
select * from dual;


