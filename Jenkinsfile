pipeline {
    agent any

    tools {
        maven 'Maven-3.9.16'
    }

    stages {
        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }

    post {
        success {
            echo 'Maven build and JUnit tests completed successfully.'
        }
        failure {
            echo 'Build or tests failed. Check the console output.'
        }
    }
}
