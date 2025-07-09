# Auto & General Cucumber Framework

A Java-based test automation framework using Cucumber, Maven, and Selenium for testing the SauceDemo web application.

## Project Structure

```
AandGInsurance/
├── src/
│   ├── main/
│   │   └── java/
│   └── test/
│       ├── java/
│       │   └── stepdefinitions/
│       │   └── runners/
│       └── resources/
│           └── features/
├── pom.xml
└── README.md
```

- `src/main/java/`: Application code (if any)
- `src/test/java/stepdefinitions/`: Step definition classes for Cucumber
- `src/test/java/runners/`: Test runner classes
- `src/test/resources/features/`: Cucumber feature files
- `pom.xml`: Maven configuration

## Prerequisites

- Java 11 or higher
- Maven 3.6+
- Chrome browser (for Selenium tests)

## Setup

1. Clone the repository:
   ```
   git clone https://github.com/Mpodi-Seloane/AandGInsurance.git
   ```

2. Install dependencies:
   ```
   mvn clean install
   ```

## Running Tests

To execute all Cucumber tests:
```
mvn test
```

## Customization

- Add or modify feature files in `src/test/resources/features/`
- Implement step definitions in `src/test/java/stepdefinitions/`
- Configure test runners in `src/test/java/runners/`

## Reporting

Test reports are generated in the `target/` directory after execution.


### Extent Spark Report

This framework is configured to use the Extent Spark Reporter for test reporting.

1.  **Adapter Plugin**:
    Add the following dependency to your `pom.xml`:
    ```xml
    <dependency>
        <groupId>tech.grasshopper</groupId>
        <artifactId>cucumber-extentsreport</artifactId>
        <version>5.0.9</version>
        <scope>test</scope>
    </dependency>
    ```

2.  **Runner Configuration**:
    Update your Cucumber runner class (`RunnerTest.java`) to include the Extent Spark Reporter plugin:
    ```java
    @CucumberOptions(
        features = "src/test/resources/features",
        glue = {"StepsDefinition"},
        tags = "@addUser",
        plugin = {"pretty", "html:Reports/cucumber-reports.html", "json:target/cucumber.json",
                "tech.grasshopper.extent:extent-cucumber-adapter:"},
        publish = true,
        monochrome = true
    )
    ```

After executing the tests, the Extent Spark report will be generated in the `test-output/ExtentReport/` directory by default.

## Customization

- Add or modify feature files in `src/test/resources/features/`
- Implement step definitions in `src/test/java/stepdefinitions/`
- Configure test runners in `src/test/java/runners/`

## License

This project is licensed under the MIT License.

## License

This project is licensed under the MIT License.

