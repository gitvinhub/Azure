import hudson.util.Secret

def secret = Secret.fromString("Password@123")
println(secret.getEncryptedValue())
