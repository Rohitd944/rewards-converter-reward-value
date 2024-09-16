# Rewards Converter

## Project Information

The `rewards-converter` project is a Java application designed to convert between cash values and airline miles. The core component is the `RewardValue` class, which handles the conversion between these two types of values.

### Features

- Convert cash values to airline miles.
- Convert airline miles to cash values using a conversion rate of 0.0035.

### Project Structure

- **RewardValue.java**: Contains the logic for converting between cash and miles.
- **RewardValueTest.java**: Contains unit tests to verify the correctness of the `RewardValue` class.

### Dependencies

- Java 19 or later
- Maven for project management

### Setup

1. **Clone the Repository:**

    ```sh
    git clone https://github.com/your-username/rewards-converter.git
    ```

2. **Navigate to the Project Directory:**

    ```sh
    cd rewards-converter
    ```

3. **Build the Project:**

    ```sh
    mvn clean package
    ```

4. **Run Tests:**

    ```sh
    mvn test
    ```

