# Unit 6 - Natural Language Processing Project

## Introduction

Natural language processing (NLP) is used in many apps and devices to interact with users and make meaning of text to determine how to respond, find information, or to create new text. Your goal is to use natural language processing techniques to identify structure, patterns, and meaning in a text to have conversations with a user, execute commands, perform manipulations on the text, or generate new text.

## Requirements

Use your knowledge of object-oriented programming, ArrayLists, the String class, and algorithms to create a program that uses natural language processing techniques:

- **Create at least two ArrayLists** – Create at least two ArrayLists to store the data used in your program, such as data from text files or entered by the user.
- **Implement one or more algorithms** – Implement one or more algorithms that use loops and conditionals to find or manipulate elements in an ArrayList or String object.
- **Use methods in the String classs** - Use one or more methods in the String class in your program, such as to divide text into sentences or phrases.
- **Use at least one natural language processing technique** – Use a natural language processing technique to process, analyze, and/or generate text.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one word, otherwise it might not properly get display on this README.

![UML Diagram for my project](<Unit 6 - UML Diagram.png>)

## Video

Record a short video of your project to display here on your README. You can do this by:

- Screen record your project running on Code.org.
- Upload that recording to YouTube.
- Take a thumbnail for your image.
- Upload the thumbnail image to your repo.
- Use the following markdown code:

[![Thumbnail for my projet](nameOfThumbnail.png)](youtube-URL-here)

## Project Description

Write a description of the goal and/or problem that your application. Include descriptions of what text is being analyzed, either if its text files you are using to interpret text an how the user interacts with your project.

For this project, we want to have the user be able to find a song within the text files and be returned similar songs of the same genre. Whenever the user inputs a song title, the program will return whether or not the song is found within the text files. If the song is found, the program gives the user the option to find similar songs based on the genre of the song they inputted earlier.

## NLP Techniques

Write a description of what natural lanugage technique (NLP) you implemented in your project. State which methods in your project are associated with this, and a brief explanation of how those methods work and how they are necessary in the NLP technique. 

The natural language technique implemented within this project is string matching and keyword-based classification. The methods within my project that's associated with this are the similarSongs method and the findGenreOfSong method. The findGenreOfSongs method confirms the song inputted's existence and retrieves the genre associated with the song. This program is a fundamental NLP task where is recognizes users' input by searching through predetermined dataset. The similarSongs method finds songs of the same genre as the song inputted by the user by iterating through the songGenre list. This is necessary in the NLP technique due to it being an implementation of the text classification based on keywords. This is a form of information retrieval which is commonly utilized in NLP recommendation systems.