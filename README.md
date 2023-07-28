# synpact
Solution to the Spreadsheet question
The Solution is implemented using Java(18) Spring boot version 3 and in such a way that either Integer values can be passed to set values if the cells or we can pass values as String in such a way that it is of format "=cellid1+cellid2+.." this string operation supports addition opeartion only it will ignore spaces and work even if unwanted spaces are included. The api has two endpoints /setCellValue and /getCellValue and the server runs on port 8080 and url would look like localhost:8080/getCellValue or localhost:8080/setCellValue
