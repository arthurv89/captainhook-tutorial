rm -rf $tut/hellomoonservice
rm -rf $tut/hellomoonservice-clientlib

cp -r $tut/helloworldservice $tut/hellomoonservice
cp -r $tut/helloworldservice-clientlib $tut/hellomoonservice-clientlib

rm -rf $tut/hellomoonservice/src/main/generated-sources
rm -rf $tut/hellomoonservice-clientlib/src/main/generated-sources

mv $tut/hellomoonservice/src/main/java/com/swipecrowd/captainhook/tutorial/helloworldservice/server/activity/helloworld/HelloWorldActivity.java $tut/hellomoonservice/src/main/java/com/swipecrowd/captainhook/tutorial/helloworldservice/server/activity/helloworld/HelloMoonActivity.java
mv $tut/hellomoonservice/src/main/java/com/swipecrowd/captainhook/tutorial/helloworldservice/server/activity/helloworld/ $tut/hellomoonservice/src/main/java/com/swipecrowd/captainhook/tutorial/helloworldservice/server/activity/hellomoon/
mv $tut/hellomoonservice/src/main/java/com/swipecrowd/captainhook/tutorial/helloworldservice/ $tut/hellomoonservice/src/main/java/com/swipecrowd/captainhook/tutorial/hellomoonservice/

mv $tut/hellomoonservice-clientlib/src/main/java/com/swipecrowd/captainhook/tutorial/helloworldservice/activity/helloworld/HelloWorldInput.java $tut/hellomoonservice-clientlib/src/main/java/com/swipecrowd/captainhook/tutorial/helloworldservice/activity/helloworld/HelloMoonInput.java
mv $tut/hellomoonservice-clientlib/src/main/java/com/swipecrowd/captainhook/tutorial/helloworldservice/activity/helloworld/HelloWorldOutput.java $tut/hellomoonservice-clientlib/src/main/java/com/swipecrowd/captainhook/tutorial/helloworldservice/activity/helloworld/HelloMoonOutput.java
mv $tut/hellomoonservice-clientlib/src/main/java/com/swipecrowd/captainhook/tutorial/helloworldservice/activity/helloworld/ $tut/hellomoonservice-clientlib/src/main/java/com/swipecrowd/captainhook/tutorial/helloworldservice/activity/hellomoon/
mv $tut/hellomoonservice-clientlib/src/main/java/com/swipecrowd/captainhook/tutorial/helloworldservice $tut/hellomoonservice-clientlib/src/main/java/com/swipecrowd/captainhook/tutorial/hellomoonservice

cd $tut/hellomoonservice/
perl -p -i -e 's/world/moon/g' `find . -type f`
perl -p -i -e 's/World/Moon/g' `find . -type f`
perl -p -i -e 's/8080/8081/g' `find . -type f`

cd $tut/hellomoonservice-clientlib/
perl -p -i -e 's/world/moon/g' `find . -type f`
perl -p -i -e 's/World/Moon/g' `find . -type f`
perl -p -i -e 's/8080/8081/g' `find . -type f`

echo "Done"
