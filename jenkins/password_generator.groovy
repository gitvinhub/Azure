import hudson.util.Secret

def secret = Secret.fromString(this.args[0])
println(secret.getEncryptedValue())
