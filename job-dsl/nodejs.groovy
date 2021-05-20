job('NodeJS example') {
    scm {
        git('git://github.com/matish-bhuyan/docker-demo.git') {  node -> 
            node / gitConfigName('DSL User')
            node / gitConfigEmail('jenkins-dsl@newtech.academy')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') 
                         
    }
    steps {
        shell("npm install")
    }
}
