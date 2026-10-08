Day 3 – Project Setup, Constants & Sample Data
1. Today's Objective

Set up the Home Services Marketplace project repository with a .gitignore file and README.md, and create a Constants class to store important business rules along with one week of sample service data using arrays.

2. Concepts Learned
Git Repository: A repository used to track and manage project source code and changes.
.gitignore: Specifies files and folders that Git should ignore, such as compiled Java files and IDE-specific files.
README.md: A documentation file that explains the project, its purpose, technologies, and usage.
Constants: Fixed values used throughout the application that should not change during program execution.
static final: Used to define constants in Java.
Arrays: Data structures used to store multiple values of the same type.
Sample Data: Dummy data used to test the application's functionality before connecting a database.
Business Rules: Fixed rules that define how the marketplace operates, such as service duration, maximum bookings, or cancellation limits.
3. What Was Implemented
Created a GitHub repository for the Home Services Marketplace.
Added a .gitignore file to exclude unnecessary files from version control.
Created a README.md containing the project overview and setup information.
Created a Constants class to centralize business rules.
Added one week of sample service-related data using Java arrays.
Organized the project so that configuration values and sample data can be easily reused by other classes.
4. Business Rules

The Constants class contains fixed values such as:

Maximum bookings allowed per day
Minimum service duration
Cancellation limit
Number of working days
Service charges

Keeping these values in one place makes the application easier to maintain and modify.

5. Sample Data

Created sample data representing services/bookings for one week.

Example:

Monday → Tuesday → Wednesday → Thursday → Friday → Saturday → Sunday

This sample data will be used for testing the Home Services Marketplace before implementing database-based storage.

6. Testing & Verification

Verified that:

The project repository is created successfully.
.gitignore prevents unwanted files from being tracked.
README.md contains the project documentation.
Constants stores the defined business rules.
The weekly sample data is created and accessible from the Java program.
The project compiles and runs successfully.