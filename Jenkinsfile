pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh './gradle clean build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh './gradle clean test --no-daemon'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}