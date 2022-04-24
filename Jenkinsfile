#!/usr/bin/env groovy

pipeline {
    agent any
    tools {
        maven 'maven'
        jdk 'jdk11'
    }
    stages {
        stage('Build') {
            steps {
            sh '''
             echo "PATH = ${PATH}"
             echo "M2_HOME = ${M2_HOME}"
             '''
            }
        }
        stage('Test') {
            steps steps {
             sh '''echo "This is Test step"'''
           }
        }
        stage('Deploy') {
            steps {
                sh '''echo "This is the Deploy step"'''
            }
        }
    }
}