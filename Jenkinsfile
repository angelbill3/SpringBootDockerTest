pipeline {
    agent any
    parameters {
        choice(name: 'SELECT_VERSION', choices: ['v1.0', 'v1.1'], description: 'select target version')
        booleanParam(name: 'TEST_FLAG', defaultValue: true, description: 'test flag')
    }
    stages {
        stage("build") {
            steps {
                echo 'building the application...'
            }
        }
        stage("test") {
            when {
                expression {
                    params.TEST_FLAG == true
                }
            }
            steps {
                echo 'testing the application...'
            }
        }
        stage("deploy") {
            steps {
                echo 'deploying the application...'
                echo "deploying the version with: ${params.SELECT_VERSION}"
            }
        }
    }
}
