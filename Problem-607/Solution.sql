SELECT name
FROM SalesPerson s
WHERE NOT EXISTS (
    SELECT sales_id
    FROM Orders o JOIN Company c ON o.com_id = c.com_id
    WHERE c.name = 'RED' AND s.sales_id = o.sales_id
);
