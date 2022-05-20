# check-in-sim
This program will be working as a check in machine.
The user will input their id number and their tickets will be visible
with the output

Functions:
-Check-in
-Lounge access
-Review Ticket
-Quit program

Business.java file is used for business class tickets
-name --> general information about the passanger
-surname --> general information about the passanger
-age --> general information about the passanger
-identity --> login number
-status --> check in status
-loungePass is set to true because all business class tickets have access to lounge

Economy.java file is used for economy class tickets
-name --> general information about the passanger
-surname --> general information about the passanger
-age --> general information about the passanger
-identity --> login number
-status --> check in status
-loungePass is set to false because economy tickets don't come with access to lounge

Machine.java file is the general system for the program

Bilet is an abstract class for the usage purposes of business and economy
