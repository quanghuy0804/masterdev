use masterdev_huydq129;


CREATE TABLE Student(
 idStudent int unsigned NOT NULL ,
 fullName nvarchar(30) NOT NULL ,
 gender  bit NOT NULL ,
 email   varchar(45) NOT NULL ,
PRIMARY KEY (idStudent)
);

CREATE TABLE Subject(
 idSubject int unsigned NOT NULL ,
 nameSubject nvarchar(45) NOT NULL ,

PRIMARY KEY (`idSubject`)
);
ALTER TABLE Subject MODIFY COLUMN nameSubject nvarchar(255);
CREATE TABLE Class (
idClass int unsigned NOT NULL,
nameClass nvarchar(45) NOT NULL,
idStudent int unsigned NOT NULL,
idTeacher int unsigned NOT NULL,
idSubject int unsigned NOT NULL,
PRIMARY KEY (idClass)
);

CREATE TABLE ClassDetail(
 idStudent int unsigned NOT NULL ,
 idClass  int unsigned NOT NULL ,
 idSubject int unsigned NOT NULL,
 mark   tinyint NOT NULL ,

PRIMARY KEY (idStudent, idClass)
);
ALTER TABLE ClassDetail MODIFY COLUMN idClass  NOT NULL;

CREATE TABLE Teacher(
 idTeacher int unsigned NOT NULL ,
 fullName nvarchar(30) NOT NULL ,
 gender  bit NOT NULL ,

PRIMARY KEY (idTeacher)
);
ALTER TABLE Teacher ADD email varchar(50);


