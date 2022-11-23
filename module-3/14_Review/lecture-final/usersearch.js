
function caseInsensitiveContains(str1, str2) {
    return str1.toLowerCase().includes(str2.toLowerCase());
}

const search = {
    first: "",
    last: "U"
};

const users = [
    {
        first: "george",
        last: "jungle"
    },
    {
        first: "micky",
        last: "mouse"
    },
    {
        first: "donald",
        last: "duck"
    }
]

const filteredUsers = users.filter(u =>
    caseInsensitiveContains(u.first, search.first) &&
    caseInsensitiveContains(u.last, search.last));

filteredUsers.forEach(u => {
    console.log(u);
})