package com.nmp.projectnmp

object AchievementData {
    var achievements: Array<Achievement> = arrayOf(
        Achievement("Best Offensive Team Award",
            WhatWePlayData.games[0], TeamData.teams[1], 2024),
        Achievement("Valorant Champions of the Year",
            WhatWePlayData.games[0], TeamData.teams[0], 2023),
        Achievement("Most Improved Team Award",
            WhatWePlayData.games[0], TeamData.teams[1], 2022),
        Achievement("Valorant Rookie Team of the Year",
            WhatWePlayData.games[0], TeamData.teams[2], 2021),
        Achievement("Fortnite Champion of the Year", WhatWePlayData.games[2], TeamData.teams[3], 2024),
        Achievement("Fortnite Rising Star Team", WhatWePlayData.games[2], TeamData.teams[5], 2023),
        Achievement("Fortnite Strategic Mastery Award", WhatWePlayData.games[2], TeamData.teams[5], 2022),
        Achievement("Fortnite Rookie Team of the Year", WhatWePlayData.games[2], TeamData.teams[4], 2021),
        Achievement("Finals MVP", WhatWePlayData.games[1], TeamData.teams[7], 2024),
        Achievement("Week 8 Best Rookie", WhatWePlayData.games[2], TeamData.teams[7], 2023),
        Achievement("First Team Winner", WhatWePlayData.games[1], TeamData.teams[9], 2022),
    )
}