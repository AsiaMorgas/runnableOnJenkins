#!/usr/bin/env groovy

pipeline {
    agent any
    environment{
        GH-TOKEN = credentials('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')
    }
    triggers {
        cron('0 * * * *')
    }
    options {
            disableConcurrentBuilds()
            buildDiscarder(logRotator(numToKeepStr: '20', artifactNumToKeepStr: '20'))
            timeout(time: 120, unit: 'MINUTES')
        }
        parameters {
        string(name: 'git_branch', defaultValue: 'master', description: 'Git branch')
        }
//     tools {
//         maven 'maven'
//         jdk 'jdk11'
//     }
    stages {
        stage('Checkout') {
            steps {
            git branch: '${git_branch}',
            url: 'https://github.com/AsiaMorgas/runnableOnJenkins.git'
//             sh '''
//              echo "PATH = ${PATH}"
//              echo "M2_HOME = ${M2_HOME}"
//              '''
            }
        }
        stage('Cleaning up workspace') {
                    steps {
                        sh 'git clean -fdx'
                    }
        stage('Test') {
            steps steps {
             sh 'mvn clean test'
           }
        }
        stage('Deploy') {
            steps {
                sh 'echo This is the Deploy step'
            }
        }
    }
}