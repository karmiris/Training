new course:
Create new local folder> Run bash in it:
git clone https://token@github.com/karmiris/Training.git 	// perhaps better without token (?)
git remote add origin2 https://token@github.com/karmiris/Training.git 	// if new token created
git push -u origin2 main	
git pull origin2 

Instructor Git: 
https://github.com/Kaleakash/vadafone_java_fullstack_2023_batch

Getting Tomcat to work (Maven not working):
https://stackoverflow.com/questions/4119448/the-import-javax-servlet-cant-be-resolved
https://stackoverflow.com/questions/2869485/how-to-add-javadoc-for-servlet-api-in-eclipse
Download Tomcat 9 -> Add server (Apache Tomcat 9) -> Change Port (Window-Show View-Servers); Right click server-Open(Ports on the right)

git --version 
git init		: This command is use to make local repository as git local repository 
git status		: This command is use to check the current status of local repository 
git add filename        this command is use to add the file to staging area. 
git add .  		This command is use to add all files or folder present in current location in staging area.
git branch -m master main	To change branch name
git branch
git commit –m “commit message”;		you get error message if you are doing first time. 

git config --global user.email “akash300383@gmail.com”
git config  --global user.name “akash”

git remote add origin https://token@github.com/karmiris/Training.git 

git push -u origin main	
git pull --all

Generating token:
Right icon click on setting 
Then left panel select developer setting option 
Personal access token 
	Token classic 
Click on generate new token option 

vi welcome.java
javac welcome.java
java welcome    (welcome.class)
