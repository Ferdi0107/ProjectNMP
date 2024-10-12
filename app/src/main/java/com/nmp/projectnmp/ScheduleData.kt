package com.nmp.projectnmp

object ScheduleData {
    var schedule: Array<Schedule> = arrayOf(
        Schedule("Regional Qualifier - Valorant",
            TeamData.teams[0], "3-10-2024", "London, United Kingdom", WhatWePlayData.games[0], "The Regional Qualifier for Valorant is a tournament where regional teams compete for a spot in major international events. It showcases top-level gameplay, with intense matches testing skill, strategy, and teamwork. Fans can expect exciting plays and the emergence of new talent in the competitive Valorant scene.", R.drawable.valorant_crowd),
        Schedule("Regular Season Week 1 - Mobile Legends",
            TeamData.teams[6], "20-9-2024", "Surabaya, Indonesia", WhatWePlayData.games[1], "The Regular Season of MPL Mobile Legends: Bang-Bang is where professional teams compete in a round-robin format, earning points to determine playoff standings. Teams face each other, with performance deciding seeding for the next stage. This phase tests strategies, builds momentum, and engages fans before the high-stakes playoffs.", R.drawable.mpl_crowd),
        Schedule("Fortnite Championship Series (FNCS)",
            TeamData.teams[3], "29-9-2024", "Berlin, German", WhatWePlayData.games[2], "The Fortnite Championship Series (FNCS) is Fortnite’s premier event, where players worldwide compete for large prize pools and the FNCS title. Held in seasonal formats, like Solo or Squads, the competition starts with open qualifiers. Top players advance to regional finals, with the best reaching the Grand Finals to compete for victory and prestige.", R.drawable.fortnite_crowd)
    )
}