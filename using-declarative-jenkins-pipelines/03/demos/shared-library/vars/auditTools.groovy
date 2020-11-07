def call() { // required 
    node {   // required
      sh '''
        git version
        docker version
        dotnet --list-sdks
        dotnet --list-runtimes
      '''
    }
}