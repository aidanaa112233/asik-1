# Software Design Patterns - Assignment #1 (Builder Pattern)
Tumenbai Aidana,SE-2511

## Project Overview
This project implements the **Builder** creational design pattern in Java. The chosen domain is a **KazakhSpace Mars Mission (`MarsMission`)**, which benefits from step-by-step construction, customizable parameters, and multiple representations (e.g., standard scientific missions configured via a Director, and custom national missions built via a Fluent API).

## Project Structure
- `MarsMission.java` - The complex product class representing the Mars mission configuration, complete with validation.
- `MarsMissionBuilder.java` - The builder class providing method chaining (Fluent API) for step-by-step object creation.
- `MissionDirector.java` - The director class that orchestrates the build sequence for predefined/reusable configurations.
- `Main.java` - The client class that tests both the director and fluent builder implementations.

## Applied Clean Code Principles
1. **Validated Construction:** 
   - *Implementation:* The `MarsMission` constructor validates builder parameters (e.g., ensuring `crewSize > 0`) and throws an explicit `IllegalArgumentException` upon invalid state.
2. **Meaningful, Intention-Revealing Names:** 
   - *Implementation:* Classes, methods, and variables (such as `buildGhalamScientificMission`, `setRadiationShield`, and `MarsMissionBuilder`) clearly express their intent and domain purpose without needing redundant comments.
3. **Small Methods Doing One Thing:** 
   - *Implementation:* Each setter method in the builder and each display method handles a single, well-defined responsibility.
4. **No Magic Numbers/Strings:** 
   - *Implementation:* Descriptive default values and explicit constant string assignments (e.g., launch vehicles and rover names) replace ambiguous raw values.
5. **Consistent Formatting and Focused Classes (Single Responsibility):** 
   - *Implementation:* Responsibilities are strictly separated across distinct classes (`MarsMission` holds data, `MarsMissionBuilder` handles creation logic, `MissionDirector` manages sequences, and `Main` runs execution).

