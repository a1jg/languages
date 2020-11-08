pipeline {
    agent any 
    stages {
        stage('Clone repo + Clean') { 
            steps {
                sh "mvn clean"
            }
        }
        stage('Test') { 
            steps {
                sh "mvn test"
            }
        }
        stage('Package') { 
            steps {
                sh "mvn package"
            }
        }
    }
}