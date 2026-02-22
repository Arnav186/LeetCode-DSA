DELETE FROM person p1
WHERE p1.id IN (
SELECT p1.id
FROM person p1, person p2
WHERE p1.email = p2.email
AND p1.id > p2.id
);
