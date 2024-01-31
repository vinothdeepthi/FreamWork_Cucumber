Feature: Add To Cart Functionality

@Smoke
Scenario: Add To Cart Components Category Products

Given  User Move To The Components Category 
When   User Select The Components Category Product
And    User Select Component Product on "Samsung SyncMaster 941BW"
And    User given The Product Quantity "2"
And    User Click On The AddTo Cart button
Then   User Should Be View The Selected Product "Samsung SyncMaster 941BW" Is Successfully Add To The Cart Page

Scenario: Add To Cart Desktop Category Products

Given  User Move To The Desktop Category 
When   User Select The Desktop Category Product
And    User Select Desktop Product on "iMac"
And    User given The Product Quantity "2"
And    User Click On The AddTo Cart button
Then   User Should Be View The Selected Product "iMac" Is Successfully Add To The Cart Page

Scenario: Add To Cart Laptop and Notebooks Category Products

Given  User Move To The Laptop and Notebooks Category 
When   User Select The Laptop and Notebooks Category Product
And    User Select Laptop Product on "Sony VAIO"
And    User given The Product Quantity "2"
And    User Click On The AddTo Cart button
Then   User Should Be View The Selected Product "Sony VAIO" Is Successfully Add To The Cart Page

Scenario: Add To Cart Tab Category Products

Given  User Move To The Tab Category 
When   User Select The Tab Product
And    User Select Tab Product on "Samsung Galaxy Tab 10.1"
And    User given The Product Quantity "2"
And    User Click On The AddTo Cart button
Then   User Should Be View The Selected Product "Samsung Galaxy Tab 10.1" Is Successfully Add To The Cart Page







