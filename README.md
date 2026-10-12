# TSS - EvoSuite

Proiect Java pentru demonstrarea generarii automate de teste unitare folosind **EvoSuite 1.0.6** si **JUnit 4**.

## Clase implementate
- `Calculator` - operatii matematice
- `DiscountCalculator` - calculul reducerilor
- `BankAccount` - operatii bancare

## Tehnologii
Java 8, Maven, EvoSuite 1.0.6, JUnit 4.

## Compilare si testare

Deschideti proiectul in IntelliJ IDEA si configurati **JDK 8** pentru Maven.

Din terminal, in folderul proiectului:

```bash
mvn clean test
```

Sau din IntelliJ: **Maven → Lifecycle → test**.

## Generarea testelor cu EvoSuite

Dupa compilarea proiectului:

```bash
java -jar evosuite-1.0.6.jar -class demo.Calculator -projectCP target/classes -Dcriterion=BRANCH -Dsearch_budget=60
```

Comanda necesita EvoSuite 1.0.6 descarcat separat si Java 8. Inlocuiti `demo.Calculator` cu numele clasei dorite.

## Rezultate

- **3 clase Java testate**
- **21 de teste JUnit generate si executate**
- **0 erori, 0 teste esuate**
- **100% Branch Coverage** pentru `Calculator`

Documentatie: https://www.evosuite.org/
