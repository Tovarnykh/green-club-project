export const navigation = {
    categories: [
        {
            id: 'houseplants',
            name: 'Хатні рослини',
            featured: [
                {
                    name: 'Нові надходження',
                    href: '/product/204',
                    imageSrc: 'https://plnts.com/_next/image?url=https%3A%2F%2Fwebshop.plnts.com%2Fmedia%2Fcatalog%2Fproduct%2Fcache%2Faa5d334f459227518b6c3cf7ea9d29ed%2Fp%2Fl%2Fpl.m.084-thumbnail.jpg&w=640&q=80',
                    imageAlt: 'Models sitting back to back, wearing Basic Tee in black and bone.',
                },
                {
                    name: 'Хіт сезону',
                    href: '/product/202',
                    imageSrc: 'https://plnts.com/_next/image?url=https%3A%2F%2Fwebshop.plnts.com%2Fmedia%2Fcatalog%2Fproduct%2Fcache%2Faa5d334f459227518b6c3cf7ea9d29ed%2Fp%2Fl%2Fpl.m.138-thumbnail.jpg&w=640&q=80',
                    imageAlt: 'Close up of Basic Tee fall bundle with off-white, ochre, olive, and black tees.',
                },
            ],
            sections: [
                {
                    id: 'plant',
                    name: 'Сімейство рослин',
                    items: [
                        { name: 'Alacosia', id: 'alacosia' },
                        { name: 'Philodendron', id: 'philodendron' },
                        { name: 'Monstera', id: 'monstera' },
                        { name: 'Anthurium', id: 'anthurium' },
                        { name: 'Hoya', id: 'hoya' },
                        { name: 'Syngonium', id: 'syngonium' }
                    ],
                },
                {
                    id: 'placement',
                    name: 'Місце расташування',
                    items: [
                        { name: 'Рослини до ванни', id: 'bathroom' },
                        { name: 'Рослини для спалень', id: 'bedroom' },
                        { name: 'Рослини для вітален', id: 'livingroom' },
                        { name: 'Рослини у офіс', id: 'office' },
                        { name: 'Рослини для кухонь', id: 'kitchen' },
                    ],
                },
                {
                    id: 'size',
                    name: 'Розміри',
                    items: [
                        { name: 'Дітячі рослини (S)', id: 'baby' },
                        { name: 'Звичайні рослини (M, L)', id: 'medium' },
                        { name: 'Великі рослини (XL, XXL)', id: 'large' },
                    ],
                },
            ],
        },
    ],
}