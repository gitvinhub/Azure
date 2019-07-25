# Azure DevOps Utilities

## Contents
* Jenkins
  * [basic-docker-build.groovy](jenkins/basic-docker-build.groovy): Sample Jenkins pipeline that clones a git repository, builds the docker container defined in the Docker file and pushes that container to a private container registry.
  * [add-docker-build-job.sh](jenkins/add-docker-build-job.sh): Adds a Docker Build job in an existing Jenkins instance.
  * [add-aptly-build-job.sh](jenkins/add-aptly-build-job.sh): Adds a sample Build job in an existing Jenkins instance that pushes a debian package to an Aptly repository.
  * [init-aptly-repo.sh](jenkins/init-aptly-repo.sh): Initializes an Aptly repository on an existing Jenkins instance.
  * [unsecure-jenkins-instance.sh](jenkins/unsecure-jenkins-instance.sh): Disables the security of a Jenkins instance.
  * [Jenkins-Windows-Init-Script.ps1](powershell/Jenkins-Windows-Init-Script.ps1): Sample script on how to setup your Windows Azure Jenkins Agent to communicate through JNLP with the Jenkins master.
  * [Migrate-Image-From-Classic.ps1](powershell/Migrate-Image-From-Classic.ps1): Migrates an image from the classic image model to the new Azure Resource Manager model.
  * [install_jenkins.sh](jenkins/install_jenkins.sh): Bash script that installs Jenkins on a Linux VM and exposes it to the public through port 80 (login and cli are disabled).
  * [run-cli-command.sh](jenkins/run-cli-command.sh): Script that runs a Jenkins CLI command.
