Pull the code Mvn clean install Mvn package Run java -jar target/*.jar

Since we did not push the webtokens for moodle/erpnext - we added a response JSON for search from Moodle and using that hardcoded in the code. ( though we implemented integration and wrote the code to get the request and map it dynamically to Beckn spec)

We are returning dummy responses for select, confirm API's haven't integrated with Moodle.

We are making a callback to the bap_url in a new thread - we plan to implement through event-driven architecture.

We did not implement Auth

Note : We have hardcoded values and code-duplicates in the code and need to clean-up