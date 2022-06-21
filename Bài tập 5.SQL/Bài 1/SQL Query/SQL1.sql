-- Q1 in ra ?i?m trung bình toàn tr??ng
SELECT
	AVG(mar.mark) AS avgmark
FROM
	ClassDetail mar
	-- Q2 t? l? Tr??t/trung bình/Khá/Gi?i/Xu?t s?c
SELECT
	(
	SELECT
		COUNT(mark)
		FROM ClassDetail
	WHERE
		mark <= 4 )/(
	SELECT
		COUNT(mark)
	FROM
		ClassDetail) as truot
SELECT
	(
	SELECT
		COUNT(mark)
		FROM ClassDetail
	WHERE
		mark > 4
		and mark <= 6 )/(
	SELECT
		COUNT(mark)
	from
		ClassDetail) as trungbinh
SELECT
	(
	SELECT
		COUNT(mark)
		FROM ClassDetail
	WHERE
		mark > 6
		and mark <= 8 )/(
	SELECT
		COUNT(mark)
	from
		ClassDetail) as kha
SELECT
	(
	SELECT
		COUNT(mark)
		FROM ClassDetail
	WHERE
		mark > 8
		and mark <= 9 )/(
	SELECT
		COUNT(mark)
	from
		ClassDetail) as gioi
SELECT
	(
	SELECT
		COUNT(mark)
		FROM ClassDetail
	WHERE
		mark > 9 )/(
	SELECT
		COUNT(mark)
	from
		ClassDetail) as xuatsac
	-- Q3 Môn có ?i?m trung bình cao nh?t
Select
	s.nameSubject ,
	AVG(cd.mark)
from
	ClassDetail cd
Inner join Subject s 
on
	cd.idSubject = s.idSubject
GROUP BY
	s.idSubject
ORDER BY
	AVG(cd.mark) 
DESC
LIMIT 1
-- Q4 L?p có ?i?m trung bình cao nh?t
Select
	c.nameClass ,
	AVG(cd.mark)
from
	ClassDetail cd
INNER JOIN Class c 
on
	cd.idClass = c.idClass
GROUP By
	c.idClass
ORDER BY
	AVG(cd.mark) DESC
limit 1
-- Q5 b?n có ?i?m trung bình cao nh?t
Select
	s.fullname ,
	avg(cd.mark)
from
	ClassDetail cd
INNER JOIN Student s
on
	s.idStudent = cd.idStudent
GROUP BY
	s.idStudent
order by
	AVG(cd.mark) DESC
Limit 1

-- Q6 Môn có t? l? tr??t cao nh?t
SELECT t1.nameSubject AS ten, t2.ct/t1.ct AS truot FROM (
(SELECT s.idSubject AS idSubject, s.nameSubject AS nameSubject, COUNT(s.idSubject) AS ct  
FROM ClassDetail cd, Class c , Subject s 
WHERE cd.idClass = c.idClass AND c.idSubject = s.idSubject
GROUP BY s.idSubject) t1 
INNER JOIN 
(SELECT s.idSubject AS idSubject, s.nameSubject AS nameSubject, COUNT(s.idSubject) AS ct
FROM ClassDetail  cd, Class c, Subject s
WHERE cd.idClass = c.idClass AND c.idSubject = s.idSubject AND cd.mark < 4.0
GROUP BY s.idSubject) t2
ON t1.idSubject = t2.idSubject)
ORDER BY t2.ct/t1.ct DESC  
LIMIT 10;
-- Q7 Danh sách các b?n không có môn nào tr??t
SELECT t1.fullName AS danh_sach
FROM
(SELECT DISTINCT s.idStudent AS idStudent, s.fullName AS fullName 
FROM Student s, ClassDetail cd
WHERE s.idStudent = cd.idStudent) t1
LEFT JOIN
(SELECT DISTINCT s.idStudent AS idStudent, s.fullName  AS fullName
FROM Student s, ClassDetail cd
WHERE s.idStudent = cd.idStudent AND cd.mark < 4.0) t2
ON t1.idStudent = t2.idStudent
WHERE t2.idStudent IS NULL;

-- Q8 Top 10 môn h?c khó nh?t
Select s.nameSubject , AVG(cd.mark) from ClassDetail cd Inner join Subject s 
on cd.idSubject = s.idSubject 
GROUP BY s.idSubject 
ORDER BY AVG(cd.mark) asc
LIMIT 10
