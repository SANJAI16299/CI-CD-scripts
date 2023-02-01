def call(){
    return wrap([$class: 'BuildUser']) { return env.BUILD_USER }
}
