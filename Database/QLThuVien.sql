create database QLThuVien
go
use QLThuVien
go

create table DocGia
(
	madocgia int not null identity(1,1) primary key,	
	tendocgia nvarchar(50) not null,
	
	diachi nvarchar(50) not null,
	sdt int
	
)
create table Sach_LoaiSach
(
	maloai varchar(20) not null,
	tenloai nvarchar(50) not null,
	constraint PK_sach_maloai primary key (maloai)
	
)
create table Sach
(
	masach nvarchar(20) not null primary key,
	tensach nvarchar(50) not null,
	soluong int,
	giatien int,
	hinhanh image not null,
	namxuatban int,
	maloai varchar(20) not null,
	tenloai nvarchar(50) not null,
	constraint FRK_loai_sach foreign key (maloai) references Sach_LoaiSach(maloai)
)

create table Kho
(
	makho int not null identity(1,1) primary key,
	tenkho nvarchar(50) not null,
	mathukho int not null,
	masach nvarchar(20) not null,
	constraint FRK_kho_sach foreign key (masach) references Sach(masach)
)
create table ThuKho
(
	mathukho int not null identity(1,1) primary key,
	tenthukho nvarchar(50) not null,
	sdt int,
	diachi nvarchar(50),
	hinhanh image not null,
	UserName nvarchar(50) NOT NULL,
	PassWord nvarchar(50) not null,
	makho int not null,
	constraint FRK_thukho_kho_makho foreign key (makho) references Kho(makho)
)
create table ThuThu
(
	mathuthu int not null identity(1,1) primary key,
	tenthuthu nvarchar(50) not null,
	sdt int,
	UserName nvarchar(50) NOT NULL,
	PassWord nvarchar(50) not null,
	hinhanh image not null,
	diachi nvarchar(50)
)
create table PhieuMuon
(
	maphieumuon int not null identity(1,1) primary key,
	masach nvarchar(20) not null,
	madocgia int not null,
	mathuthu int not null,
	ngaymuon datetime not null,
	ngaytra datetime not null,
	constraint FRK_phieumuon_sach_masach foreign key (masach) references Sach(masach),
	constraint FRK_phieumuon_docgia_madocgia foreign key (madocgia) references DocGia(madocgia),
	constraint FRK_phieumuon_thuthu_mathuthu foreign key (mathuthu) references ThuThu(mathuthu)
)

create table CTPhieuMuon
(
	maphieumuon int not null identity(1,1),
	masach nvarchar(20) not null,
	soluong int not null,
	dongia varchar not null,
	PRIMARY KEY (maphieumuon,masach),
	FOREIGN KEY (maphieumuon) REFERENCES PhieuMuon(maphieumuon),
	FOREIGN KEY (masach) REFERENCES Sach(masach)
)

------insert table LoaiSach

insert into Sach_LoaiSach values('L001',N'Truyện tranh')
insert into Sach_LoaiSach values('L002',N'Tiểu thuyết')
insert into Sach_LoaiSach values('L003',N'Tài liệu')
insert into Sach_LoaiSach values('L004',N'Báo chí')
insert into Sach_LoaiSach values('L005',N'Sách tham khảo')
insert into Sach_LoaiSach values('L006',N'Sách giáo khoa')
go
-----INSERT TABLE Sach

INSERT INTO Sach VALUES ('S001',N'Doraemon tuyển tập tranh truyện màu',20,20000,'truyen-tranh-doremon-mau.jpg',2012,'L001',N'Truyện tranh')
INSERT INTO Sach VALUES ('S002',N'Thám tử lừng danh Conan',20,20000,'conan.jpg',2007,'L001',N'Truyện tranh')
INSERT INTO Sach VALUES ('S003',N'Hoa học trò',10,12000,'Báo.jpg',2019,'L004',N'Báo chí')
INSERT INTO Sach VALUES ('S004',N'Những người khốn khổ',20,120000,'sach-nhung-nguoi-khon-kho.jpg',1862,'L002',N'Tiểu thuyết')
INSERT INTO Sach VALUES ('S005',N'Tuyển chọn những đề thi Ielts mới nhất',40,110000,'ielts.jpg',2012,'L003',N'Tài liệu')
INSERT INTO Sach VALUES ('S006',N'Lập trình Java căn bản',50,75000,'java.jpg',2010,'L005',N'Sách tham khảo')
INSERT INTO Sach VALUES ('S007',N'Sherlock Holmes',10,120000,'sherlock holmes.jpg',2003,'L002',N'Tiểu thuyết')
INSERT INTO Sach VALUES ('S008',N'Hoá học lớp 12',10,7500,'hoahoc.jpg',2003,'L006',N'Sách giáo khoa')
GO
-----INSERT TABLE THUTHU
INSERT INTO ThuThu VALUES (N'LÊ VĂN NGUYÊN',0123456789,N'lhn1807',N'1552c03e78d38d5005d4ce7b8018addf','tải xuống.jpg',N'Thanh Hóa')
---------------------
Select * From Sach

	select * from ThuThu