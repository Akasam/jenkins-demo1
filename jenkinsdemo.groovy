job('Jenkins Demo - Prod') {
    scm {
        git('https://github.com/akasam/jenkins-demo1') {  node -> 
            node / gitConfigName('srohaut')
            node / gitConfigEmail('srohaut@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('NodeJS-20-LTS')
    }
    steps {
        shell("npm install")
        shell("npm test")
    }
}

job('Jenkins Demo - Experimental') {
    scm {
        git('https://github.com/akasam/jenkins-demo1') {  node -> 
            node / gitConfigName('srohaut')
            node / gitConfigEmail('srohaut@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('NodeJS-Experimental')
    }
    steps {
        shell("npm install")
        shell("npm test")
    }
}
