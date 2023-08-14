package org.naveenkumar.data;

import java.util.Random;

public class Words {
    private String[] words = {"Adequate", "Anywhere", "Approach", "Activity", "Anything", "Approval", "Advanced", "Although", "Academic", "Advocate", "Accident", "Athletic", "Aircraft", "Activist", "Actually", "Accurate", "Apparent", "Argument", "Analysis", "Audience", "Announce", "Alliance", "Artistic", "Addition", "Absolute", "Attitude",
            "Birthday", "Behavior", "Bathroom", "Boundary", "Building", "Business",
            "Capacity", "Champion", "Campaign", "Convince", "Conflict", "Changing", "Ceremony", "Clothing", "Category", "Complain", "Complete", "Computer", "Coverage", "Creative", "Confront", "Conclude", "Civilian", "Concrete", "Critical", "Criminal", "Clinical", "Collapse", "Customer", "Contract", "Consumer", "Consider", "Cultural", "Criteria", "Constant", "Creature", "Creation", "Continue", "Contrast",
            "Delivery", "Discover", "Directly", "Darkness", "Document", "Dramatic", "Daughter", "Describe", "Division", "Distinct", "Distance", "Decision", "District", "Decrease", "Director", "Dominant", "Dominate", "Designer", "Disorder", "Dialogue", "Detailed", "Disagree", "Disaster",
            "Exchange", "Everyday", "Exciting", "Exposure", "Exercise", "Existing", "External", "Employer", "Employee", "Emphasis", "Economic", "Everyone", "Evidence", "Electric", "Entirely", "Educator", "Evaluate", "Estimate", "Entrance", "Enormous", "Emission", "Engineer", "Earnings",
            "Frequent", "Facility", "Fighting", "Friendly", "Favorite", "Familiar", "Football", "Function",
            "Graduate", "Generate", "Greatest",
            "Historic", "Hospital", "Headline", "Heritage",
            "Identify", "Involved", "Industry", "Identity", "Incident", "Investor", "Indicate", "Instance", "Increase", "Innocent", "Interest", "Internal", "Internet",
            "Judgment",
            "Lifetime", "Literary", "Language", "Location", "Learning",
            "Magazine", "Majority", "Movement", "Military", "Minority", "Moreover", "Multiple", "Mortgage", "Musician", "Marriage", "Moderate", "Material", "Mountain", "Maintain",
            "Neighbor", "Normally", "Negative", "Northern", "Numerous", "National",
            "Organize", "Official", "Overlook", "Overcome", "Observer", "Opponent", "Ordinary", "Occasion", "Opposite", "Operator", "Original",
            "Physical", "Probably", "Publicly", "Powerful", "Purchase", "Possibly", "Properly", "Property", "Province", "Platform", "Perceive", "Prospect", "Provider", "Practice", "Priority", "Preserve", "Producer", "Proposed", "Positive", "Previous", "Proposal", "Presence", "Possible", "Politics", "Painting", "Pregnant", "Progress", "Persuade", "Planning", "Personal", "Pleasure", "Portrait", "Position", "Prisoner", "Pressure",
            "Question",
            "Recovery", "Remember", "Recently", "Research", "Resemble", "Romantic", "Relative", "Relevant", "Resource", "Response", "Reporter", "Reaction", "Regulate", "Resident", "Register", "Regional", "Religion", "Relation",
            "Sequence", "Specific", "Somewhat", "Somebody", "Shopping", "Slightly", "Survival", "Survivor", "Software", "Schedule", "Supposed", "Suddenly", "Security", "Shoulder", "Strongly", "Strength", "Strategy", "Straight", "Spending", "Shooting", "Southern", "Standard", "Scenario", "Surprise", "Separate", "Struggle", "Sentence", "Standing", "Sanction", "Stranger", "Surround", "Solution",
            "Thinking", "Teaching", "Tendency", "Tomorrow", "Together", "Thousand", "Threaten", "Transfer", "Terrible", "Teaspoon", "Teenager", "Training",
            "Unlikely", "Universe", "Ultimate",
            "Vacation", "Valuable", "Variable",
            "Workshop", "Withdraw", "Whatever", "Whenever",
            "Yourself",
            "the","of","and","a","to","in","is","you","that","it","he","was","for","on","are","as","with","his","they","I","at","be","this","have","from","or","one","had","by","word","but","not","what","all","were","we","when","your","can","said","there","use","an","each","which","she","do","how","their","if","will","up","other","about","out","many","then","them","these","so","some","her","would","make","like",
            "him","into","time","has","look","two","more","write","go","see","number","no","way","could","people","my","than","first","water","been","call","who","oil","its","now","find","long","down","day","did","get","come","made","may","part"};

    public String[] getWords() {
        return words;
    }

    public String getRandomFruitVegetable(){
        Random rand = new Random();
        int randomIndex = rand.nextInt(this.words.length);
        return this.words[randomIndex];
    }

}
