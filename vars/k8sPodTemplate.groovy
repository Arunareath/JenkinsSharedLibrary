def call() {
    return '''
    apiVersion: v1
    kind: Pod
    metadata:
      labels:
        purpose: build
    spec:
      containers:
      - name: maven
        image: maven:3.8.4-openjdk-17
        command:
        - cat
        tty: true
      - name: docker
        image: docker:23.0.2
        command:
        - cat
        tty: true
    '''
}
