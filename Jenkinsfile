```groovy
pipeline {
    agent any

    tools {
        maven 'Maven-3.9.16'
    }

    stages {
        stage('Checkout Git') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Ajith-cell/EvenOddMaven.git'
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Check Compiled Classes') {
            steps {
                bat 'dir target\\classes'
                bat 'dir target\\test-classes'
            }
        }

        stage('Package JAR') {
            steps {
                bat 'mvn package'
            }
        }

        stage('Run Application') {
            steps {
                bat 'java -cp target\\classes com.example.EvenOdd'
            }
        }
    }

    post {
        always {
            junit allowEmptyResults: true,
                  testResults: '**/target/surefire-reports/TEST-*.xml'
        }

        success {
            echo 'BUILD SUCCESS!'
        }

        failure {
            echo 'BUILD FAILURE! Check Console Output.'
        }
    }
}
```
