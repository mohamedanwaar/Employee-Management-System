# Employee Management System

## Overview
The **Employee Management System** is a Java-based application designed to manage employee information efficiently. With a focus on object-oriented principles, it provides a user-friendly way to handle various employee types (salaried, commission-based, and hourly) and includes functions to add, remove, and retrieve employee details.

## Features
- **Add Employee**: Supports adding salaried, commission-based, or hourly employees with specific details such as name, national ID, and salary.
- **Remove Employee**: Allows for easy removal of employees from the system.
- **Retrieve Employee Information**: Displays information of a specific employee upon request.
- **Data Storage**: Utilizes an ArrayList to store employee details.
- **Exception Handling**: Ensures robust error handling for data validation and processing.

## Project Structure
- `Employee`: The base class representing a general employee, containing common properties like name and national ID.
- `SalariedEmployee`, `CommissionEmployee`, `HourlyEmployee`: Subclasses that extend the base `Employee` class with unique properties.
- `EmployeeManagementSystem`: The main class where employee data is managed and stored in an ArrayList.

## Technologies Used
- **Java**: For application development.
- **Object-Oriented Programming**: To implement employee types and operations.
- **Exception Handling**: To manage errors during input and processing.

## Installation
1. Clone this repository:
   ```bash
   git clone https://github.com/mohamedanwaar/Employee-Management-System.git
