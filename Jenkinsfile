pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps { //Checking out the repo
                echo 'Checkout the repo'
                checkout changelog: true, poll: true, scm: [$class: 'GitSCM', branches: [[name: '*/master']], browser: [$class: 'BitbucketWeb', repoUrl: 'https://web.com/blah'], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'git', url: 'https://github.com/bassdude5/BasicCucumberTestingWithJenkinsFile.git']]]
            }
        }

        stage('Build') {
            steps {
                echo 'Building..'
                script {
                    sh './gradle clean build'
                } 
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                //sh './gradle clean test --no-daemon'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}