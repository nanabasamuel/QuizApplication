package com.example.quizapplication;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {
    private static List<ListOfQuestions> javaQuestions() {

        final List<ListOfQuestions> questionsLists = new ArrayList<>();

        //Create object of ListOfQuestions class and pass a questions along with alternatives and answer
        final ListOfQuestions question1 = new ListOfQuestions("Which of the following packages is automatically loaded, so you don’t need to import it?","java.util", "javax.swing", "java.math", "java.lang", "java.lang", "");
        final ListOfQuestions question2 = new ListOfQuestions("To what object-oriented programming concept does the java keyword private apply?", "Polymorphism", "Inheritance", "Encapsulation", "Overriding", "Overriding", "");
        final ListOfQuestions question3 = new ListOfQuestions("What is the use of ‘javac’ command?", "Execute a java program", "Debug a java program", "Interpret a java program", "Compile a java program", "Compile a java program", "");
        final ListOfQuestions question4 = new ListOfQuestions("Parent class of all java classes is?", "java.lang.system", "java.lang.object", "java.lang.class", "java.lang,reflect.object", "java.lang.object", "");
        final ListOfQuestions question5 = new ListOfQuestions("Which of the following is NOT a java primitive type", "short", "long", "long double", "boolean", "long double", "");
        final ListOfQuestions question6 = new ListOfQuestions("A condition that is caused by run-time error in a computer program is known as?", "syntax error", "fault", "semantic error", "exception", "exception", "");

        //add all questions to List<ListOfQuestions>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<ListOfQuestions> nursingQuestions() {

        final List<ListOfQuestions> questionsLists = new ArrayList<>();

        //Create object of ListOfQuestions class and pass a questions along with alternatives and answer
        final ListOfQuestions question1 = new ListOfQuestions("What needs of a patient does a nurse address?", "Physical", "Emotional", "Mental", "All of the above", "All of the above", "");
        final ListOfQuestions question2 = new ListOfQuestions("The nursing care plan for a client with decreased adrenal function should include?", "Encouraging activity", "Placing client in reverse isolation", "Limiting visitors", "Measures to prevent constipation", "Limiting visitors", "");
        final ListOfQuestions question3 = new ListOfQuestions("The first case of Covid positive case in India reported in?", "Kerala", "Tamilnadu", "Gujarat", "Maharashtra", "Kerala", "");
        final ListOfQuestions question4 = new ListOfQuestions("The epithelial tissue which is found in the uterine tubes is?", "Squamous", "Ciliated", "Columnar", "Simple", "Ciliated", "");
        final ListOfQuestions question5 = new ListOfQuestions("The part of the fetus which occupies the lower pole of the uterus is called?", "Lie", "Presentation", "Denominator", "Position", "Presentation", "");
        final ListOfQuestions question6 = new ListOfQuestions("Low levels of maternal serum alpha-fetoprotein levels are found in?", "Open neural tube defect", "Down syndrome", "Multiple pregnancies", "Rh-isoimmunisation", "Down syndrome", "");

        //add all questions to List<ListOfQuestions>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<ListOfQuestions> sociologyQuestions() {

        final List<ListOfQuestions> questionsLists = new ArrayList<>();

        //Create object of ListOfQuestions class and pass a questions along with alternatives and answer
        final ListOfQuestions question1 = new ListOfQuestions("The term ‘sociology’ was coined by", "Saint Simon", "Herbert Spencer", "Auguste Comte", "Durkheim", "Auguste Comte", "");
        final ListOfQuestions question2 = new ListOfQuestions("In which year the term ‘Sociology’ was coined?", "1798", "1815", "1839", "1857", "1839", "");
        final ListOfQuestions question3 = new ListOfQuestions("French Revolution took place in the year?", "1789", "1776", "1798", "1898", "1789", "");
        final ListOfQuestions question4 = new ListOfQuestions("Sociology emerged in?", "America", "Europe", "Asia", "Africa", "Europe", "");
        final ListOfQuestions question5 = new ListOfQuestions("The word ‘Sociology’ is made up of two words. These are...", "Societies and Logy", "Societia and Logistia", "Socious and Logos", "Socia and Logos", "Socious and Logos", "");
        final ListOfQuestions question6 = new ListOfQuestions("Society emerges out of?", "Community's existence", "Men's existence", "Problem's existence", "Relationship", "Men's existence", "");

        //add all questions to List<ListOfQuestions>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<ListOfQuestions> physicsQuestions() {

        final List<ListOfQuestions> questionsLists = new ArrayList<>();

        //Create object of ListOfQuestions class and pass a questions along with alternatives and answer
        final ListOfQuestions question1 = new ListOfQuestions("Which of the following measurements is not a unit of distance?", "Ammeter", "Cubit", "Parsec", "angstrom", "Ammeter", "");
        final ListOfQuestions question2 = new ListOfQuestions("Which one of the following remains constant while throwing a ball upward?", "Displacement", "Kinetic Energy", "Acceleration", "Velocity", "Acceleration", "");
        final ListOfQuestions question3 = new ListOfQuestions("Pure water freezes at what temperature?", "47F", "32F", "0F", "19F", "32F", "");
        final ListOfQuestions question4 = new ListOfQuestions("Zinc Oxide is?", "Acidic", "Basic", "Neutral", "Amphoteric", "Amphoteric", "");
        final ListOfQuestions question5 = new ListOfQuestions("Pure water is a ______ conductor of electricity.", "super", "bad", "speed", "None of these", "bad", "");
        final ListOfQuestions question6 = new ListOfQuestions("What element’s three isotopes have different names?", "Helium", "Oxygen","Carbon", "Hydrogen", "Hydrogen", "");

        //add all questions to List<ListOfQuestions>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<ListOfQuestions> civilEngineeringQuestions() {

        final List<ListOfQuestions> questionsLists = new ArrayList<>();

        //Create object of ListOfQuestions class and pass a questions along with alternatives and answer
        final ListOfQuestions question1 = new ListOfQuestions("The rocks formed from molten magma are called?", "sedimentary rocks", "igneous rocks", "metamorphic rocks", "none of these", "igneous rocks", "");
        final ListOfQuestions question2 = new ListOfQuestions("The rocks formed by gradual deposition are called?", "sedimentary rocks", "igneous rocks", "metamorphic rocks", "none of these", "sedimentary rocks", "");
        final ListOfQuestions question3 = new ListOfQuestions("The curvature of the earth's surface, is taken into account only if the extent of survey is more than?", "100 sq km", "160 sq km", "200 sq km", "260 sq km", "260 sq km", "");
        final ListOfQuestions question4 = new ListOfQuestions("Hydrographic surveys deal with the mapping of?", "large water bodies", "heavenly bodies", "mountainous region", "canal system", "large water bodies", "");
        final ListOfQuestions question5 = new ListOfQuestions("The distance between the centers of adjacent rivets in the same row is called?", "pitch", "lap", "gauge", "staggered pitch", "pitch", "");
        final ListOfQuestions question6 = new ListOfQuestions("Failure of riveted joints is due to?", "Tearing of the plates b/n the edge of the plate", "Tearing of plates b/n rivets","Shearing of rivets", "All the above", "All the above", "");

        //add all questions to List<ListOfQuestions>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<ListOfQuestions> farmingQuestions() {

        final List<ListOfQuestions> questionsLists = new ArrayList<>();

        //Create object of ListOfQuestions class and pass a questions along with alternatives and answer
        final ListOfQuestions question1 = new ListOfQuestions("Primary resources for agriculture are?", "Land, air and water", "Seed, Fertilizer and Pesticide", "Seed, air and water", "Land, Fertilizer and water", "Land, air and water", "");
        final ListOfQuestions question2 = new ListOfQuestions("For the cultivation of Tobacco the soil should be rich in?", "Calcareous matter", "Nitrogen", "Organic Content", "Potash", "Potash", "");
        final ListOfQuestions question3 = new ListOfQuestions("Rice is which kind of crop?", "Autumn", "Evergreen", "Fall", "Monsoon", "Monsoon", "");
        final ListOfQuestions question4 = new ListOfQuestions("Cultivation involving slash and burn?", "Shifting cultivation", "Nomadic herding", "Mixed farming", "Plantation", "Shifting cultivation", "");
        final ListOfQuestions question5 = new ListOfQuestions("Potato and tomato are native of?", "Canada", "North America", "China", "South America", "South America", "");
        final ListOfQuestions question6 = new ListOfQuestions("Which of the following is suitable for growing cotton?", "Sandy soil", "Clayey soil","Black soil", "Alluvial soil", "Black soil", "");

        //add all questions to List<ListOfQuestions>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    public static List<ListOfQuestions> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "java":
                return javaQuestions();
            case "nursing":
                return nursingQuestions();
            case "sociology":
                return sociologyQuestions();
            case "physics":
                return physicsQuestions();
            case "farming":
                return farmingQuestions();
            case "civilEngineering":
                return civilEngineeringQuestions();
            default:
                return null;
        }
    }
}

