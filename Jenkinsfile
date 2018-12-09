pipeline {
    agent any
    setEnvironment()
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh "mvn clean install"
            }
        }
    }
    
    def setEnvironment(){
        M2_HOME = "C:/Users/ganna/Downloads/Maven/bin"
        PATH+MAVEN = env.PATH + M2_HOME
        JAVA_HOME = "C:/Users/ganna/Downloads/Java/jdk-8.0.1/bin"
        PATH+JAVA = env.PATH + JAVA_HOME
    }
}
