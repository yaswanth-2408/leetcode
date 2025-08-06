SELECT Email
FROM PERSON
group by email
having count(*)>1;
