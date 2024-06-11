CREATE TABLE IF NOT EXISTS staff (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    branch_name VARCHAR(255) NOT NULL
);

INSERT INTO staff (name, branch_name) VALUES ('Kundan', 'Mahinam');
INSERT INTO staff (name, branch_name) VALUES ('Chandan', 'Mahinam');