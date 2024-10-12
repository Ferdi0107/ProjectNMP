package com.nmp.projectnmp

object TeamData {

    var teams: Array<Team> = arrayOf(
        Team("Paper Rex",
            MemberData.memberValoA, WhatWePlayData.games[0]),
        Team("Sentinels",
            MemberData.memberValoB, WhatWePlayData.games[0]),
        Team("Ubaya E-Sport",
            MemberData.memberValoC, WhatWePlayData.games[0]),
        Team("100 Thieves",
            MemberData.memberFortniteA, WhatWePlayData.games[2]),
        Team("FaZe Clan",
            MemberData.memberFortniteB, WhatWePlayData.games[2]),
        Team("Cloud9",
            MemberData.memberFortniteC, WhatWePlayData.games[2]),
        Team("Gofur Saestu",
        MemberData.memberMlA, WhatWePlayData.games[1]),
        Team("Req Regum Qeon (RRQ)",
        MemberData.memberMlB, WhatWePlayData.games[1]),
        Team("Alter Ego (AE)",
        MemberData.memberMlC, WhatWePlayData.games[1]),
        Team("EVOS",
        MemberData.memberMlD, WhatWePlayData.games[1])
    )
}