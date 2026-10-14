# EvenOddMaven

A simple Java Maven project that checks whether a number is even or odd and tests the logic with JUnit 5.

## Project files

- `src/main/java/com/example/EvenOdd.java` - Java program
- `src/test/java/com/example/EvenOddTest.java` - JUnit tests
- `pom.xml` - Maven and JUnit configuration
- `Jenkinsfile` - Jenkins pipeline

## Run locally in VS Code terminal

Run tests and build:

```powershell
mvn clean test
```

Expected result includes `BUILD SUCCESS` and 4 tests passing.

To run the Java program from Maven after compiling:

```powershell
mvn -q package
java -cp target/classes com.example.EvenOdd
```

Expected output:

```text
7 is Odd
```

## Upload to GitHub

1. Create a new empty repository on GitHub named `EvenOddMaven`.
2. Open a terminal in this project folder.
3. Run these commands, replacing `YOUR-USERNAME` with your GitHub username:

```powershell
git init
git add .
git commit -m "Add Even Odd Maven project with JUnit tests"
git branch -M main
git remote add origin https://github.com/YOUR-USERNAME/EvenOddMaven.git
git push -u origin main
```

If Git asks you to sign in, complete the GitHub sign-in flow.

## Run through Jenkins

1. Ensure Jenkins has Git and Maven configured.
2. The Maven tool name in the `Jenkinsfile` is `Maven-3.9.16`. In Jenkins, go to **Manage Jenkins → Tools** and make sure the configured Maven installation name matches exactly. If yours has a different name, change the `tools` name in `Jenkinsfile` to match.
3. Create a **Pipeline** job in Jenkins.
4. Under **Pipeline**, select **Pipeline script from SCM**.
5. Select **Git**, enter your GitHub repository URL, and set branch to `*/main`.
6. Set Script Path to `Jenkinsfile`, save, and click **Build Now**.
7. Open **Console Output** and look for `BUILD SUCCESS`.
