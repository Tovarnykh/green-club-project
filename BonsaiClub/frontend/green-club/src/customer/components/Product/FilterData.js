export const room = [
    "Bathroom",
    "Bedroom",
    "Kitchen",
    "Livingroom",
    "Office",
    "Hallway",
];

export const filters = [
    {
        id: "room",
        name: "Кімнати",
        options: [
            {value: "bathroom", label: "Bathroom"},
            {value: "bedroom", label: "Bedroom"},
            {value: "kitchen", label: "Kitchen"},
            {value: "livingroom", label: "Livingroom"},
            {value: "office", label: "Office"},
            {value: "hallway", label: "Hallway"},
        ],
    },

    {
        id: "size",
        name: "Розмір",
        options: [
            {value: "S", label: "S"},
            {value: "M", label: "M"},
            {value: "L", label: "L"},
        ],
    },
];


export const singleFilter = [
    {
        id: "price",
        name: "Ціна",
        options: [
            {value: "159-399", label: "₴159 To ₴399"},
            {value: "399-999", label: "₴399 To ₴999"},
            {value: "999-1999", label: "₴999 To ₴1999"},
            {value: "1999-2999", label: "₴1999 To ₴2999"},
            {value: "3999-4999", label: "₴3999 To ₴4999"},
        ],
    },
    {
        id: "discount",
        name: "Акції",
        options: [
            {value: "10", label: "10% And Above"},
            {value: "20", label: "20% And Above"},
            {value: "30", label: "30% And Above"},
            {value: "40", label: "40% And Above"},
            {value: "50", label: "50% And Above"},
            {value: "60", label: "60% And Above"},
            {value: "70", label: "70% And Above"},
            {value: "80", label: "80% And Above"},
        ],
    },
    {
        id: "stock",
        name: "За статусом",
        options: [
            {value: "in_stock", label: "In Stock"},
            {value: "out_of_stock", label: "Out Of Stock"}
        ]
    },
]

export const sortOptions = [
    {name: "Ціни: Низькі до Високих", query: "price_low", current: false},
    {name: "Ціни: Високі до низьких", query: "price_high", current: false}
];