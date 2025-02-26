/*! Element Plus Icons Vue v2.1.0 */

"use strict";
var ElementPlusIconsVue = (() => {
    var Ds = Object.create;
    var L0 = Object.defineProperty;
    var Ms = Object.getOwnPropertyDescriptor;
    var Ns = Object.getOwnPropertyNames;
    var ys = Object.getPrototypeOf, Ls = Object.prototype.hasOwnProperty;
    var As = (o, t) => () => (t || o((t = {exports: {}}).exports, t), t.exports), Ss = (o, t) => {
        for (var r in t) L0(o, r, {get: t[r], enumerable: !0})
    }, A0 = (o, t, r, a) => {
        if (t && typeof t == "object" || typeof t == "function") for (let n of Ns(t)) !Ls.call(o, n) && n !== r && L0(o, n, {
            get: () => t[n],
            enumerable: !(a = Ms(t, n)) || a.enumerable
        });
        return o
    };
    var c = (o, t, r) => (r = o != null ? Ds(ys(o)) : {}, A0(t || !o || !o.__esModule ? L0(r, "default", {
        value: o,
        enumerable: !0
    }) : r, o)), qs = o => A0(L0({}, "__esModule", {value: !0}), o);
    var l = As((DD, q0) => {
        q0.exports = Vue
    });
    var zD = {};
    Ss(zD, {
        AddLocation: () => F0,
        Aim: () => P0,
        AlarmClock: () => T0,
        Apple: () => G0,
        ArrowDown: () => Z0,
        ArrowDownBold: () => W0,
        ArrowLeft: () => J0,
        ArrowLeftBold: () => Q0,
        ArrowRight: () => o1,
        ArrowRightBold: () => Y0,
        ArrowUp: () => a1,
        ArrowUpBold: () => r1,
        Avatar: () => c1,
        Back: () => m1,
        Baseball: () => _1,
        Basketball: () => i1,
        Bell: () => x1,
        BellFilled: () => u1,
        Bicycle: () => w1,
        Bottom: () => V1,
        BottomLeft: () => k1,
        BottomRight: () => E1,
        Bowl: () => g1,
        Box: () => D1,
        Briefcase: () => N1,
        Brush: () => S1,
        BrushFilled: () => L1,
        Burger: () => F1,
        Calendar: () => P1,
        Camera: () => G1,
        CameraFilled: () => T1,
        CaretBottom: () => W1,
        CaretLeft: () => Z1,
        CaretRight: () => Q1,
        CaretTop: () => J1,
        Cellphone: () => Y1,
        ChatDotRound: () => or,
        ChatDotSquare: () => rr,
        ChatLineRound: () => ar,
        ChatLineSquare: () => cr,
        ChatRound: () => mr,
        ChatSquare: () => _r,
        Check: () => ir,
        Checked: () => ur,
        Cherry: () => xr,
        Chicken: () => wr,
        ChromeFilled: () => kr,
        CircleCheck: () => Vr,
        CircleCheckFilled: () => Er,
        CircleClose: () => Dr,
        CircleCloseFilled: () => gr,
        CirclePlus: () => Lr,
        CirclePlusFilled: () => Nr,
        Clock: () => Sr,
        Close: () => Pr,
        CloseBold: () => Fr,
        Cloudy: () => Tr,
        Coffee: () => Wr,
        CoffeeCup: () => Gr,
        Coin: () => Zr,
        ColdDrink: () => Qr,
        Collection: () => Yr,
        CollectionTag: () => Jr,
        Comment: () => o4,
        Compass: () => r4,
        Connection: () => a4,
        Coordinate: () => c4,
        CopyDocument: () => m4,
        Cpu: () => _4,
        CreditCard: () => i4,
        Crop: () => u4,
        DArrowLeft: () => x4,
        DArrowRight: () => w4,
        DCaret: () => k4,
        DataAnalysis: () => E4,
        DataBoard: () => V4,
        DataLine: () => g4,
        Delete: () => L4,
        DeleteFilled: () => D4,
        DeleteLocation: () => N4,
        Dessert: () => S4,
        Discount: () => F4,
        Dish: () => T4,
        DishDot: () => P4,
        Document: () => Y4,
        DocumentAdd: () => G4,
        DocumentChecked: () => W4,
        DocumentCopy: () => Z4,
        DocumentDelete: () => Q4,
        DocumentRemove: () => J4,
        Download: () => on,
        Drizzling: () => rn,
        Edit: () => cn,
        EditPen: () => an,
        Eleme: () => _n,
        ElemeFilled: () => mn,
        ElementPlus: () => dn,
        Expand: () => hn,
        Failed: () => vn,
        Female: () => Bn,
        Files: () => Cn,
        Film: () => $n,
        Filter: () => zn,
        Finished: () => Hn,
        FirstAidKit: () => Mn,
        Flag: () => yn,
        Fold: () => An,
        Folder: () => In,
        FolderAdd: () => qn,
        FolderChecked: () => bn,
        FolderDelete: () => Rn,
        FolderOpened: () => On,
        FolderRemove: () => Un,
        Food: () => Kn,
        Football: () => jn,
        ForkSpoon: () => Xn,
        Fries: () => e6,
        FullScreen: () => t6,
        Goblet: () => p6,
        GobletFull: () => n6,
        GobletSquare: () => s6,
        GobletSquareFull: () => l6,
        GoldMedal: () => f6,
        Goods: () => h6,
        GoodsFilled: () => d6,
        Grape: () => v6,
        Grid: () => B6,
        Guide: () => C6,
        Handbag: () => $6,
        Headset: () => z6,
        Help: () => M6,
        HelpFilled: () => H6,
        Hide: () => y6,
        Histogram: () => A6,
        HomeFilled: () => q6,
        HotWater: () => b6,
        House: () => R6,
        IceCream: () => I6,
        IceCreamRound: () => O6,
        IceCreamSquare: () => U6,
        IceDrink: () => K6,
        IceTea: () => j6,
        InfoFilled: () => X6,
        Iphone: () => e3,
        Key: () => t3,
        KnifeFork: () => n3,
        Lightning: () => l3,
        Link: () => s3,
        List: () => p3,
        Loading: () => f3,
        Location: () => v3,
        LocationFilled: () => d3,
        LocationInformation: () => h3,
        Lock: () => B3,
        Lollipop: () => C3,
        MagicStick: () => $3,
        Magnet: () => z3,
        Male: () => H3,
        Management: () => M3,
        MapLocation: () => y3,
        Medal: () => A3,
        Memo: () => q3,
        Menu: () => b3,
        Message: () => O3,
        MessageBox: () => R3,
        Mic: () => U3,
        Microphone: () => I3,
        MilkTea: () => K3,
        Minus: () => j3,
        Money: () => X3,
        Monitor: () => ea,
        Moon: () => na,
        MoonNight: () => ta,
        More: () => sa,
        MoreFilled: () => la,
        MostlyCloudy: () => pa,
        Mouse: () => fa,
        Mug: () => da,
        Mute: () => va,
        MuteNotification: () => ha,
        NoSmoking: () => Ba,
        Notebook: () => Ca,
        Notification: () => $a,
        Odometer: () => za,
        OfficeBuilding: () => Ha,
        Open: () => Ma,
        Operation: () => ya,
        Opportunity: () => Aa,
        Orange: () => qa,
        Paperclip: () => ba,
        PartlyCloudy: () => Ra,
        Pear: () => Oa,
        Phone: () => Ia,
        PhoneFilled: () => Ua,
        Picture: () => Xa,
        PictureFilled: () => Ka,
        PictureRounded: () => ja,
        PieChart: () => e8,
        Place: () => t8,
        Platform: () => n8,
        Plus: () => l8,
        Pointer: () => s8,
        Position: () => p8,
        Postcard: () => f8,
        Pouring: () => d8,
        Present: () => h8,
        PriceTag: () => v8,
        Printer: () => B8,
        Promotion: () => C8,
        QuartzWatch: () => $8,
        QuestionFilled: () => z8,
        Rank: () => H8,
        Reading: () => y8,
        ReadingLamp: () => M8,
        Refresh: () => b8,
        RefreshLeft: () => A8,
        RefreshRight: () => q8,
        Refrigerator: () => R8,
        Remove: () => U8,
        RemoveFilled: () => O8,
        Right: () => I8,
        ScaleToOriginal: () => K8,
        School: () => j8,
        Scissor: () => X8,
        Search: () => el,
        Select: () => tl,
        Sell: () => nl,
        SemiSelect: () => ll,
        Service: () => sl,
        SetUp: () => pl,
        Setting: () => fl,
        Share: () => dl,
        Ship: () => hl,
        Shop: () => vl,
        ShoppingBag: () => Bl,
        ShoppingCart: () => $l,
        ShoppingCartFull: () => Cl,
        ShoppingTrolley: () => zl,
        Smoking: () => Hl,
        Soccer: () => Ml,
        SoldOut: () => yl,
        Sort: () => bl,
        SortDown: () => Al,
        SortUp: () => ql,
        Stamp: () => Rl,
        Star: () => Ul,
        StarFilled: () => Ol,
        Stopwatch: () => Il,
        SuccessFilled: () => Kl,
        Sugar: () => jl,
        Suitcase: () => ec,
        SuitcaseLine: () => Xl,
        Sunny: () => tc,
        Sunrise: () => nc,
        Sunset: () => lc,
        Switch: () => fc,
        SwitchButton: () => sc,
        SwitchFilled: () => pc,
        TakeawayBox: () => dc,
        Ticket: () => hc,
        Tickets: () => vc,
        Timer: () => Bc,
        ToiletPaper: () => Cc,
        Tools: () => $c,
        Top: () => Mc,
        TopLeft: () => zc,
        TopRight: () => Hc,
        TrendCharts: () => yc,
        Trophy: () => qc,
        TrophyBase: () => Ac,
        TurnOff: () => bc,
        Umbrella: () => Rc,
        Unlock: () => Oc,
        Upload: () => Ic,
        UploadFilled: () => Uc,
        User: () => jc,
        UserFilled: () => Kc,
        Van: () => Xc,
        VideoCamera: () => ts,
        VideoCameraFilled: () => es,
        VideoPause: () => ns,
        VideoPlay: () => ls,
        View: () => ss,
        Wallet: () => fs,
        WalletFilled: () => ps,
        WarnTriangleFilled: () => ds,
        Warning: () => vs,
        WarningFilled: () => hs,
        Watch: () => Bs,
        Watermelon: () => Cs,
        WindPower: () => $s,
        ZoomIn: () => zs,
        ZoomOut: () => Hs
    });
    var S0 = {name: "AddLocation"};
    var _ = c(l());
    var e = (o, t) => {
        let r = o.__vccOpts || o;
        for (let [a, n] of t) r[a] = n;
        return r
    };
    var Fs = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, bs = (0, _.createElementVNode)("path", {
        fill: "currentColor",
        d: "M288 896h448q32 0 32 32t-32 32H288q-32 0-32-32t32-32z"
    }, null, -1), Ps = (0, _.createElementVNode)("path", {
        fill: "currentColor",
        d: "M800 416a288 288 0 1 0-576 0c0 118.144 94.528 272.128 288 456.576C705.472 688.128 800 534.144 800 416zM512 960C277.312 746.688 160 565.312 160 416a352 352 0 0 1 704 0c0 149.312-117.312 330.688-352 544z"
    }, null, -1), Rs = (0, _.createElementVNode)("path", {
        fill: "currentColor",
        d: "M544 384h96a32 32 0 1 1 0 64h-96v96a32 32 0 0 1-64 0v-96h-96a32 32 0 0 1 0-64h96v-96a32 32 0 0 1 64 0v96z"
    }, null, -1), Ts = [bs, Ps, Rs];

    function Os(o, t, r, a, n, s) {
        return (0, _.openBlock)(), (0, _.createElementBlock)("svg", Fs, Ts)
    }

    var F0 = e(S0, [["render", Os], ["__file", "add-location.vue"]]);
    var b0 = {name: "Aim"};
    var L = c(l());
    var Gs = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Us = (0, L.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 896a384 384 0 1 0 0-768 384 384 0 0 0 0 768zm0 64a448 448 0 1 1 0-896 448 448 0 0 1 0 896z"
    }, null, -1), Ws = (0, L.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 96a32 32 0 0 1 32 32v192a32 32 0 0 1-64 0V128a32 32 0 0 1 32-32zm0 576a32 32 0 0 1 32 32v192a32 32 0 1 1-64 0V704a32 32 0 0 1 32-32zM96 512a32 32 0 0 1 32-32h192a32 32 0 0 1 0 64H128a32 32 0 0 1-32-32zm576 0a32 32 0 0 1 32-32h192a32 32 0 1 1 0 64H704a32 32 0 0 1-32-32z"
    }, null, -1), Is = [Us, Ws];

    function Zs(o, t, r, a, n, s) {
        return (0, L.openBlock)(), (0, L.createElementBlock)("svg", Gs, Is)
    }

    var P0 = e(b0, [["render", Zs], ["__file", "aim.vue"]]);
    var R0 = {name: "AlarmClock"};
    var A = c(l());
    var Ks = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Qs = (0, A.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 832a320 320 0 1 0 0-640 320 320 0 0 0 0 640zm0 64a384 384 0 1 1 0-768 384 384 0 0 1 0 768z"
    }, null, -1), js = (0, A.createElementVNode)("path", {
        fill: "currentColor",
        d: "m292.288 824.576 55.424 32-48 83.136a32 32 0 1 1-55.424-32l48-83.136zm439.424 0-55.424 32 48 83.136a32 32 0 1 0 55.424-32l-48-83.136zM512 512h160a32 32 0 1 1 0 64H480a32 32 0 0 1-32-32V320a32 32 0 0 1 64 0v192zM90.496 312.256A160 160 0 0 1 312.32 90.496l-46.848 46.848a96 96 0 0 0-128 128L90.56 312.256zm835.264 0A160 160 0 0 0 704 90.496l46.848 46.848a96 96 0 0 1 128 128l46.912 46.912z"
    }, null, -1), Js = [Qs, js];

    function Xs(o, t, r, a, n, s) {
        return (0, A.openBlock)(), (0, A.createElementBlock)("svg", Ks, Js)
    }

    var T0 = e(R0, [["render", Xs], ["__file", "alarm-clock.vue"]]);
    var O0 = {name: "Apple"};
    var Te = c(l());
    var Ys = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, em = (0, Te.createElementVNode)("path", {
        fill: "currentColor",
        d: "M599.872 203.776a189.44 189.44 0 0 1 64.384-4.672l2.624.128c31.168 1.024 51.2 4.096 79.488 16.32 37.632 16.128 74.496 45.056 111.488 89.344 96.384 115.264 82.752 372.8-34.752 521.728-7.68 9.728-32 41.6-30.72 39.936a426.624 426.624 0 0 1-30.08 35.776c-31.232 32.576-65.28 49.216-110.08 50.048-31.36.64-53.568-5.312-84.288-18.752l-6.528-2.88c-20.992-9.216-30.592-11.904-47.296-11.904-18.112 0-28.608 2.88-51.136 12.672l-6.464 2.816c-28.416 12.224-48.32 18.048-76.16 19.2-74.112 2.752-116.928-38.08-180.672-132.16-96.64-142.08-132.608-349.312-55.04-486.4 46.272-81.92 129.92-133.632 220.672-135.04 32.832-.576 60.288 6.848 99.648 22.72 27.136 10.88 34.752 13.76 37.376 14.272 16.256-20.16 27.776-36.992 34.56-50.24 13.568-26.304 27.2-59.968 40.704-100.8a32 32 0 1 1 60.8 20.224c-12.608 37.888-25.408 70.4-38.528 97.664zm-51.52 78.08c-14.528 17.792-31.808 37.376-51.904 58.816a32 32 0 1 1-46.72-43.776l12.288-13.248c-28.032-11.2-61.248-26.688-95.68-26.112-70.4 1.088-135.296 41.6-171.648 105.792C121.6 492.608 176 684.16 247.296 788.992c34.816 51.328 76.352 108.992 130.944 106.944 52.48-2.112 72.32-34.688 135.872-34.688 63.552 0 81.28 34.688 136.96 33.536 56.448-1.088 75.776-39.04 126.848-103.872 107.904-136.768 107.904-362.752 35.776-449.088-72.192-86.272-124.672-84.096-151.68-85.12-41.472-4.288-81.6 12.544-113.664 25.152z"
    }, null, -1), om = [em];

    function tm(o, t, r, a, n, s) {
        return (0, Te.openBlock)(), (0, Te.createElementBlock)("svg", Ys, om)
    }

    var G0 = e(O0, [["render", tm], ["__file", "apple.vue"]]);
    var U0 = {name: "ArrowDownBold"};
    var Oe = c(l());
    var rm = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, nm = (0, Oe.createElementVNode)("path", {
        fill: "currentColor",
        d: "M104.704 338.752a64 64 0 0 1 90.496 0l316.8 316.8 316.8-316.8a64 64 0 0 1 90.496 90.496L557.248 791.296a64 64 0 0 1-90.496 0L104.704 429.248a64 64 0 0 1 0-90.496z"
    }, null, -1), am = [nm];

    function lm(o, t, r, a, n, s) {
        return (0, Oe.openBlock)(), (0, Oe.createElementBlock)("svg", rm, am)
    }

    var W0 = e(U0, [["render", lm], ["__file", "arrow-down-bold.vue"]]);
    var I0 = {name: "ArrowDown"};
    var Ge = c(l());
    var cm = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, sm = (0, Ge.createElementVNode)("path", {
        fill: "currentColor",
        d: "M831.872 340.864 512 652.672 192.128 340.864a30.592 30.592 0 0 0-42.752 0 29.12 29.12 0 0 0 0 41.6L489.664 714.24a32 32 0 0 0 44.672 0l340.288-331.712a29.12 29.12 0 0 0 0-41.728 30.592 30.592 0 0 0-42.752 0z"
    }, null, -1), mm = [sm];

    function pm(o, t, r, a, n, s) {
        return (0, Ge.openBlock)(), (0, Ge.createElementBlock)("svg", cm, mm)
    }

    var Z0 = e(I0, [["render", pm], ["__file", "arrow-down.vue"]]);
    var K0 = {name: "ArrowLeftBold"};
    var Ue = c(l());
    var _m = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, fm = (0, Ue.createElementVNode)("path", {
        fill: "currentColor",
        d: "M685.248 104.704a64 64 0 0 1 0 90.496L368.448 512l316.8 316.8a64 64 0 0 1-90.496 90.496L232.704 557.248a64 64 0 0 1 0-90.496l362.048-362.048a64 64 0 0 1 90.496 0z"
    }, null, -1), im = [fm];

    function dm(o, t, r, a, n, s) {
        return (0, Ue.openBlock)(), (0, Ue.createElementBlock)("svg", _m, im)
    }

    var Q0 = e(K0, [["render", dm], ["__file", "arrow-left-bold.vue"]]);
    var j0 = {name: "ArrowLeft"};
    var We = c(l());
    var um = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, hm = (0, We.createElementVNode)("path", {
        fill: "currentColor",
        d: "M609.408 149.376 277.76 489.6a32 32 0 0 0 0 44.672l331.648 340.352a29.12 29.12 0 0 0 41.728 0 30.592 30.592 0 0 0 0-42.752L339.264 511.936l311.872-319.872a30.592 30.592 0 0 0 0-42.688 29.12 29.12 0 0 0-41.728 0z"
    }, null, -1), xm = [hm];

    function vm(o, t, r, a, n, s) {
        return (0, We.openBlock)(), (0, We.createElementBlock)("svg", um, xm)
    }

    var J0 = e(j0, [["render", vm], ["__file", "arrow-left.vue"]]);
    var X0 = {name: "ArrowRightBold"};
    var Ie = c(l());
    var wm = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Bm = (0, Ie.createElementVNode)("path", {
        fill: "currentColor",
        d: "M338.752 104.704a64 64 0 0 0 0 90.496l316.8 316.8-316.8 316.8a64 64 0 0 0 90.496 90.496l362.048-362.048a64 64 0 0 0 0-90.496L429.248 104.704a64 64 0 0 0-90.496 0z"
    }, null, -1), km = [Bm];

    function Cm(o, t, r, a, n, s) {
        return (0, Ie.openBlock)(), (0, Ie.createElementBlock)("svg", wm, km)
    }

    var Y0 = e(X0, [["render", Cm], ["__file", "arrow-right-bold.vue"]]);
    var e1 = {name: "ArrowRight"};
    var Ze = c(l());
    var Em = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, $m = (0, Ze.createElementVNode)("path", {
        fill: "currentColor",
        d: "M340.864 149.312a30.592 30.592 0 0 0 0 42.752L652.736 512 340.864 831.872a30.592 30.592 0 0 0 0 42.752 29.12 29.12 0 0 0 41.728 0L714.24 534.336a32 32 0 0 0 0-44.672L382.592 149.376a29.12 29.12 0 0 0-41.728 0z"
    }, null, -1), Vm = [$m];

    function zm(o, t, r, a, n, s) {
        return (0, Ze.openBlock)(), (0, Ze.createElementBlock)("svg", Em, Vm)
    }

    var o1 = e(e1, [["render", zm], ["__file", "arrow-right.vue"]]);
    var t1 = {name: "ArrowUpBold"};
    var Ke = c(l());
    var gm = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Hm = (0, Ke.createElementVNode)("path", {
        fill: "currentColor",
        d: "M104.704 685.248a64 64 0 0 0 90.496 0l316.8-316.8 316.8 316.8a64 64 0 0 0 90.496-90.496L557.248 232.704a64 64 0 0 0-90.496 0L104.704 594.752a64 64 0 0 0 0 90.496z"
    }, null, -1), Dm = [Hm];

    function Mm(o, t, r, a, n, s) {
        return (0, Ke.openBlock)(), (0, Ke.createElementBlock)("svg", gm, Dm)
    }

    var r1 = e(t1, [["render", Mm], ["__file", "arrow-up-bold.vue"]]);
    var n1 = {name: "ArrowUp"};
    var Qe = c(l());
    var Nm = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, ym = (0, Qe.createElementVNode)("path", {
        fill: "currentColor",
        d: "m488.832 344.32-339.84 356.672a32 32 0 0 0 0 44.16l.384.384a29.44 29.44 0 0 0 42.688 0l320-335.872 319.872 335.872a29.44 29.44 0 0 0 42.688 0l.384-.384a32 32 0 0 0 0-44.16L535.168 344.32a32 32 0 0 0-46.336 0z"
    }, null, -1), Lm = [ym];

    function Am(o, t, r, a, n, s) {
        return (0, Qe.openBlock)(), (0, Qe.createElementBlock)("svg", Nm, Lm)
    }

    var a1 = e(n1, [["render", Am], ["__file", "arrow-up.vue"]]);
    var l1 = {name: "Avatar"};
    var je = c(l());
    var Sm = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, qm = (0, je.createElementVNode)("path", {
        fill: "currentColor",
        d: "M628.736 528.896A416 416 0 0 1 928 928H96a415.872 415.872 0 0 1 299.264-399.104L512 704l116.736-175.104zM720 304a208 208 0 1 1-416 0 208 208 0 0 1 416 0z"
    }, null, -1), Fm = [qm];

    function bm(o, t, r, a, n, s) {
        return (0, je.openBlock)(), (0, je.createElementBlock)("svg", Sm, Fm)
    }

    var c1 = e(l1, [["render", bm], ["__file", "avatar.vue"]]);
    var s1 = {name: "Back"};
    var S = c(l());
    var Pm = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Rm = (0, S.createElementVNode)("path", {
        fill: "currentColor",
        d: "M224 480h640a32 32 0 1 1 0 64H224a32 32 0 0 1 0-64z"
    }, null, -1), Tm = (0, S.createElementVNode)("path", {
        fill: "currentColor",
        d: "m237.248 512 265.408 265.344a32 32 0 0 1-45.312 45.312l-288-288a32 32 0 0 1 0-45.312l288-288a32 32 0 1 1 45.312 45.312L237.248 512z"
    }, null, -1), Om = [Rm, Tm];

    function Gm(o, t, r, a, n, s) {
        return (0, S.openBlock)(), (0, S.createElementBlock)("svg", Pm, Om)
    }

    var m1 = e(s1, [["render", Gm], ["__file", "back.vue"]]);
    var p1 = {name: "Baseball"};
    var q = c(l());
    var Um = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Wm = (0, q.createElementVNode)("path", {
        fill: "currentColor",
        d: "M195.2 828.8a448 448 0 1 1 633.6-633.6 448 448 0 0 1-633.6 633.6zm45.248-45.248a384 384 0 1 0 543.104-543.104 384 384 0 0 0-543.104 543.104z"
    }, null, -1), Im = (0, q.createElementVNode)("path", {
        fill: "currentColor",
        d: "M497.472 96.896c22.784 4.672 44.416 9.472 64.896 14.528a256.128 256.128 0 0 0 350.208 350.208c5.056 20.48 9.856 42.112 14.528 64.896A320.128 320.128 0 0 1 497.472 96.896zM108.48 491.904a320.128 320.128 0 0 1 423.616 423.68c-23.04-3.648-44.992-7.424-65.728-11.52a256.128 256.128 0 0 0-346.496-346.432 1736.64 1736.64 0 0 1-11.392-65.728z"
    }, null, -1), Zm = [Wm, Im];

    function Km(o, t, r, a, n, s) {
        return (0, q.openBlock)(), (0, q.createElementBlock)("svg", Um, Zm)
    }

    var _1 = e(p1, [["render", Km], ["__file", "baseball.vue"]]);
    var f1 = {name: "Basketball"};
    var Je = c(l());
    var Qm = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, jm = (0, Je.createElementVNode)("path", {
        fill: "currentColor",
        d: "M778.752 788.224a382.464 382.464 0 0 0 116.032-245.632 256.512 256.512 0 0 0-241.728-13.952 762.88 762.88 0 0 1 125.696 259.584zm-55.04 44.224a699.648 699.648 0 0 0-125.056-269.632 256.128 256.128 0 0 0-56.064 331.968 382.72 382.72 0 0 0 181.12-62.336zm-254.08 61.248A320.128 320.128 0 0 1 557.76 513.6a715.84 715.84 0 0 0-48.192-48.128 320.128 320.128 0 0 1-379.264 88.384 382.4 382.4 0 0 0 110.144 229.696 382.4 382.4 0 0 0 229.184 110.08zM129.28 481.088a256.128 256.128 0 0 0 331.072-56.448 699.648 699.648 0 0 0-268.8-124.352 382.656 382.656 0 0 0-62.272 180.8zm106.56-235.84a762.88 762.88 0 0 1 258.688 125.056 256.512 256.512 0 0 0-13.44-241.088A382.464 382.464 0 0 0 235.84 245.248zm318.08-114.944c40.576 89.536 37.76 193.92-8.448 281.344a779.84 779.84 0 0 1 66.176 66.112 320.832 320.832 0 0 1 282.112-8.128 382.4 382.4 0 0 0-110.144-229.12 382.4 382.4 0 0 0-229.632-110.208zM828.8 828.8a448 448 0 1 1-633.6-633.6 448 448 0 0 1 633.6 633.6z"
    }, null, -1), Jm = [jm];

    function Xm(o, t, r, a, n, s) {
        return (0, Je.openBlock)(), (0, Je.createElementBlock)("svg", Qm, Jm)
    }

    var i1 = e(f1, [["render", Xm], ["__file", "basketball.vue"]]);
    var d1 = {name: "BellFilled"};
    var Xe = c(l());
    var Ym = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, ep = (0, Xe.createElementVNode)("path", {
        fill: "currentColor",
        d: "M640 832a128 128 0 0 1-256 0h256zm192-64H134.4a38.4 38.4 0 0 1 0-76.8H192V448c0-154.88 110.08-284.16 256.32-313.6a64 64 0 1 1 127.36 0A320.128 320.128 0 0 1 832 448v243.2h57.6a38.4 38.4 0 0 1 0 76.8H832z"
    }, null, -1), op = [ep];

    function tp(o, t, r, a, n, s) {
        return (0, Xe.openBlock)(), (0, Xe.createElementBlock)("svg", Ym, op)
    }

    var u1 = e(d1, [["render", tp], ["__file", "bell-filled.vue"]]);
    var h1 = {name: "Bell"};
    var f = c(l());
    var rp = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, np = (0, f.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 64a64 64 0 0 1 64 64v64H448v-64a64 64 0 0 1 64-64z"
    }, null, -1), ap = (0, f.createElementVNode)("path", {
        fill: "currentColor",
        d: "M256 768h512V448a256 256 0 1 0-512 0v320zm256-640a320 320 0 0 1 320 320v384H192V448a320 320 0 0 1 320-320z"
    }, null, -1), lp = (0, f.createElementVNode)("path", {
        fill: "currentColor",
        d: "M96 768h832q32 0 32 32t-32 32H96q-32 0-32-32t32-32zm352 128h128a64 64 0 0 1-128 0z"
    }, null, -1), cp = [np, ap, lp];

    function sp(o, t, r, a, n, s) {
        return (0, f.openBlock)(), (0, f.createElementBlock)("svg", rp, cp)
    }

    var x1 = e(h1, [["render", sp], ["__file", "bell.vue"]]);
    var v1 = {name: "Bicycle"};
    var Ye = c(l());
    var mp = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"},
        pp = (0, Ye.createStaticVNode)('<path fill="currentColor" d="M256 832a128 128 0 1 0 0-256 128 128 0 0 0 0 256zm0 64a192 192 0 1 1 0-384 192 192 0 0 1 0 384z"></path><path fill="currentColor" d="M288 672h320q32 0 32 32t-32 32H288q-32 0-32-32t32-32z"></path><path fill="currentColor" d="M768 832a128 128 0 1 0 0-256 128 128 0 0 0 0 256zm0 64a192 192 0 1 1 0-384 192 192 0 0 1 0 384z"></path><path fill="currentColor" d="M480 192a32 32 0 0 1 0-64h160a32 32 0 0 1 31.04 24.256l96 384a32 32 0 0 1-62.08 15.488L615.04 192H480zM96 384a32 32 0 0 1 0-64h128a32 32 0 0 1 30.336 21.888l64 192a32 32 0 1 1-60.672 20.224L200.96 384H96z"></path><path fill="currentColor" d="m373.376 599.808-42.752-47.616 320-288 42.752 47.616z"></path>', 5),
        _p = [pp];

    function fp(o, t, r, a, n, s) {
        return (0, Ye.openBlock)(), (0, Ye.createElementBlock)("svg", mp, _p)
    }

    var w1 = e(v1, [["render", fp], ["__file", "bicycle.vue"]]);
    var B1 = {name: "BottomLeft"};
    var F = c(l());
    var ip = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, dp = (0, F.createElementVNode)("path", {
        fill: "currentColor",
        d: "M256 768h416a32 32 0 1 1 0 64H224a32 32 0 0 1-32-32V352a32 32 0 0 1 64 0v416z"
    }, null, -1), up = (0, F.createElementVNode)("path", {
        fill: "currentColor",
        d: "M246.656 822.656a32 32 0 0 1-45.312-45.312l544-544a32 32 0 0 1 45.312 45.312l-544 544z"
    }, null, -1), hp = [dp, up];

    function xp(o, t, r, a, n, s) {
        return (0, F.openBlock)(), (0, F.createElementBlock)("svg", ip, hp)
    }

    var k1 = e(B1, [["render", xp], ["__file", "bottom-left.vue"]]);
    var C1 = {name: "BottomRight"};
    var b = c(l());
    var vp = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, wp = (0, b.createElementVNode)("path", {
        fill: "currentColor",
        d: "M352 768a32 32 0 1 0 0 64h448a32 32 0 0 0 32-32V352a32 32 0 0 0-64 0v416H352z"
    }, null, -1), Bp = (0, b.createElementVNode)("path", {
        fill: "currentColor",
        d: "M777.344 822.656a32 32 0 0 0 45.312-45.312l-544-544a32 32 0 0 0-45.312 45.312l544 544z"
    }, null, -1), kp = [wp, Bp];

    function Cp(o, t, r, a, n, s) {
        return (0, b.openBlock)(), (0, b.createElementBlock)("svg", vp, kp)
    }

    var E1 = e(C1, [["render", Cp], ["__file", "bottom-right.vue"]]);
    var $1 = {name: "Bottom"};
    var e2 = c(l());
    var Ep = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, $p = (0, e2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M544 805.888V168a32 32 0 1 0-64 0v637.888L246.656 557.952a30.72 30.72 0 0 0-45.312 0 35.52 35.52 0 0 0 0 48.064l288 306.048a30.72 30.72 0 0 0 45.312 0l288-306.048a35.52 35.52 0 0 0 0-48 30.72 30.72 0 0 0-45.312 0L544 805.824z"
    }, null, -1), Vp = [$p];

    function zp(o, t, r, a, n, s) {
        return (0, e2.openBlock)(), (0, e2.createElementBlock)("svg", Ep, Vp)
    }

    var V1 = e($1, [["render", zp], ["__file", "bottom.vue"]]);
    var z1 = {name: "Bowl"};
    var o2 = c(l());
    var gp = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Hp = (0, o2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M714.432 704a351.744 351.744 0 0 0 148.16-256H161.408a351.744 351.744 0 0 0 148.16 256h404.864zM288 766.592A415.68 415.68 0 0 1 96 416a32 32 0 0 1 32-32h768a32 32 0 0 1 32 32 415.68 415.68 0 0 1-192 350.592V832a64 64 0 0 1-64 64H352a64 64 0 0 1-64-64v-65.408zM493.248 320h-90.496l254.4-254.4a32 32 0 1 1 45.248 45.248L493.248 320zm187.328 0h-128l269.696-155.712a32 32 0 0 1 32 55.424L680.576 320zM352 768v64h320v-64H352z"
    }, null, -1), Dp = [Hp];

    function Mp(o, t, r, a, n, s) {
        return (0, o2.openBlock)(), (0, o2.createElementBlock)("svg", gp, Dp)
    }

    var g1 = e(z1, [["render", Mp], ["__file", "bowl.vue"]]);
    var H1 = {name: "Box"};
    var i = c(l());
    var Np = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, yp = (0, i.createElementVNode)("path", {
            fill: "currentColor",
            d: "M317.056 128 128 344.064V896h768V344.064L706.944 128H317.056zm-14.528-64h418.944a32 32 0 0 1 24.064 10.88l206.528 236.096A32 32 0 0 1 960 332.032V928a32 32 0 0 1-32 32H96a32 32 0 0 1-32-32V332.032a32 32 0 0 1 7.936-21.12L278.4 75.008A32 32 0 0 1 302.528 64z"
        }, null, -1), Lp = (0, i.createElementVNode)("path", {fill: "currentColor", d: "M64 320h896v64H64z"}, null, -1),
        Ap = (0, i.createElementVNode)("path", {
            fill: "currentColor",
            d: "M448 327.872V640h128V327.872L526.08 128h-28.16L448 327.872zM448 64h128l64 256v352a32 32 0 0 1-32 32H416a32 32 0 0 1-32-32V320l64-256z"
        }, null, -1), Sp = [yp, Lp, Ap];

    function qp(o, t, r, a, n, s) {
        return (0, i.openBlock)(), (0, i.createElementBlock)("svg", Np, Sp)
    }

    var D1 = e(H1, [["render", qp], ["__file", "box.vue"]]);
    var M1 = {name: "Briefcase"};
    var t2 = c(l());
    var Fp = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, bp = (0, t2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M320 320V128h384v192h192v192H128V320h192zM128 576h768v320H128V576zm256-256h256.064V192H384v128z"
    }, null, -1), Pp = [bp];

    function Rp(o, t, r, a, n, s) {
        return (0, t2.openBlock)(), (0, t2.createElementBlock)("svg", Fp, Pp)
    }

    var N1 = e(M1, [["render", Rp], ["__file", "briefcase.vue"]]);
    var y1 = {name: "BrushFilled"};
    var r2 = c(l());
    var Tp = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Op = (0, r2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M608 704v160a96 96 0 0 1-192 0V704h-96a128 128 0 0 1-128-128h640a128 128 0 0 1-128 128h-96zM192 512V128.064h640V512H192z"
    }, null, -1), Gp = [Op];

    function Up(o, t, r, a, n, s) {
        return (0, r2.openBlock)(), (0, r2.createElementBlock)("svg", Tp, Gp)
    }

    var L1 = e(y1, [["render", Up], ["__file", "brush-filled.vue"]]);
    var A1 = {name: "Brush"};
    var n2 = c(l());
    var Wp = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Ip = (0, n2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M896 448H128v192a64 64 0 0 0 64 64h192v192h256V704h192a64 64 0 0 0 64-64V448zm-770.752-64c0-47.552 5.248-90.24 15.552-128 14.72-54.016 42.496-107.392 83.2-160h417.28l-15.36 70.336L736 96h211.2c-24.832 42.88-41.92 96.256-51.2 160a663.872 663.872 0 0 0-6.144 128H960v256a128 128 0 0 1-128 128H704v160a32 32 0 0 1-32 32H352a32 32 0 0 1-32-32V768H192A128 128 0 0 1 64 640V384h61.248zm64 0h636.544c-2.048-45.824.256-91.584 6.848-137.216 4.48-30.848 10.688-59.776 18.688-86.784h-96.64l-221.12 141.248L561.92 160H256.512c-25.856 37.888-43.776 75.456-53.952 112.832-8.768 32.064-13.248 69.12-13.312 111.168z"
    }, null, -1), Zp = [Ip];

    function Kp(o, t, r, a, n, s) {
        return (0, n2.openBlock)(), (0, n2.createElementBlock)("svg", Wp, Zp)
    }

    var S1 = e(A1, [["render", Kp], ["__file", "brush.vue"]]);
    var q1 = {name: "Burger"};
    var a2 = c(l());
    var Qp = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, jp = (0, a2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M160 512a32 32 0 0 0-32 32v64a32 32 0 0 0 30.08 32H864a32 32 0 0 0 32-32v-64a32 32 0 0 0-32-32H160zm736-58.56A96 96 0 0 1 960 544v64a96 96 0 0 1-51.968 85.312L855.36 833.6a96 96 0 0 1-89.856 62.272H258.496A96 96 0 0 1 168.64 833.6l-52.608-140.224A96 96 0 0 1 64 608v-64a96 96 0 0 1 64-90.56V448a384 384 0 1 1 768 5.44zM832 448a320 320 0 0 0-640 0h640zM512 704H188.352l40.192 107.136a32 32 0 0 0 29.952 20.736h507.008a32 32 0 0 0 29.952-20.736L835.648 704H512z"
    }, null, -1), Jp = [jp];

    function Xp(o, t, r, a, n, s) {
        return (0, a2.openBlock)(), (0, a2.createElementBlock)("svg", Qp, Jp)
    }

    var F1 = e(q1, [["render", Xp], ["__file", "burger.vue"]]);
    var b1 = {name: "Calendar"};
    var l2 = c(l());
    var Yp = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, e_ = (0, l2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M128 384v512h768V192H768v32a32 32 0 1 1-64 0v-32H320v32a32 32 0 0 1-64 0v-32H128v128h768v64H128zm192-256h384V96a32 32 0 1 1 64 0v32h160a32 32 0 0 1 32 32v768a32 32 0 0 1-32 32H96a32 32 0 0 1-32-32V160a32 32 0 0 1 32-32h160V96a32 32 0 0 1 64 0v32zm-32 384h64a32 32 0 0 1 0 64h-64a32 32 0 0 1 0-64zm0 192h64a32 32 0 1 1 0 64h-64a32 32 0 1 1 0-64zm192-192h64a32 32 0 0 1 0 64h-64a32 32 0 0 1 0-64zm0 192h64a32 32 0 1 1 0 64h-64a32 32 0 1 1 0-64zm192-192h64a32 32 0 1 1 0 64h-64a32 32 0 1 1 0-64zm0 192h64a32 32 0 1 1 0 64h-64a32 32 0 1 1 0-64z"
    }, null, -1), o_ = [e_];

    function t_(o, t, r, a, n, s) {
        return (0, l2.openBlock)(), (0, l2.createElementBlock)("svg", Yp, o_)
    }

    var P1 = e(b1, [["render", t_], ["__file", "calendar.vue"]]);
    var R1 = {name: "CameraFilled"};
    var c2 = c(l());
    var r_ = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, n_ = (0, c2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M160 224a64 64 0 0 0-64 64v512a64 64 0 0 0 64 64h704a64 64 0 0 0 64-64V288a64 64 0 0 0-64-64H748.416l-46.464-92.672A64 64 0 0 0 644.736 96H379.328a64 64 0 0 0-57.216 35.392L275.776 224H160zm352 435.2a115.2 115.2 0 1 0 0-230.4 115.2 115.2 0 0 0 0 230.4zm0 140.8a256 256 0 1 1 0-512 256 256 0 0 1 0 512z"
    }, null, -1), a_ = [n_];

    function l_(o, t, r, a, n, s) {
        return (0, c2.openBlock)(), (0, c2.createElementBlock)("svg", r_, a_)
    }

    var T1 = e(R1, [["render", l_], ["__file", "camera-filled.vue"]]);
    var O1 = {name: "Camera"};
    var s2 = c(l());
    var c_ = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, s_ = (0, s2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M896 256H128v576h768V256zm-199.424-64-32.064-64h-304.96l-32 64h369.024zM96 192h160l46.336-92.608A64 64 0 0 1 359.552 64h304.96a64 64 0 0 1 57.216 35.328L768.192 192H928a32 32 0 0 1 32 32v640a32 32 0 0 1-32 32H96a32 32 0 0 1-32-32V224a32 32 0 0 1 32-32zm416 512a160 160 0 1 0 0-320 160 160 0 0 0 0 320zm0 64a224 224 0 1 1 0-448 224 224 0 0 1 0 448z"
    }, null, -1), m_ = [s_];

    function p_(o, t, r, a, n, s) {
        return (0, s2.openBlock)(), (0, s2.createElementBlock)("svg", c_, m_)
    }

    var G1 = e(O1, [["render", p_], ["__file", "camera.vue"]]);
    var U1 = {name: "CaretBottom"};
    var m2 = c(l());
    var __ = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"},
        f_ = (0, m2.createElementVNode)("path", {fill: "currentColor", d: "m192 384 320 384 320-384z"}, null, -1),
        i_ = [f_];

    function d_(o, t, r, a, n, s) {
        return (0, m2.openBlock)(), (0, m2.createElementBlock)("svg", __, i_)
    }

    var W1 = e(U1, [["render", d_], ["__file", "caret-bottom.vue"]]);
    var I1 = {name: "CaretLeft"};
    var p2 = c(l());
    var u_ = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"},
        h_ = (0, p2.createElementVNode)("path", {fill: "currentColor", d: "M672 192 288 511.936 672 832z"}, null, -1),
        x_ = [h_];

    function v_(o, t, r, a, n, s) {
        return (0, p2.openBlock)(), (0, p2.createElementBlock)("svg", u_, x_)
    }

    var Z1 = e(I1, [["render", v_], ["__file", "caret-left.vue"]]);
    var K1 = {name: "CaretRight"};
    var _2 = c(l());
    var w_ = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"},
        B_ = (0, _2.createElementVNode)("path", {fill: "currentColor", d: "M384 192v640l384-320.064z"}, null, -1),
        k_ = [B_];

    function C_(o, t, r, a, n, s) {
        return (0, _2.openBlock)(), (0, _2.createElementBlock)("svg", w_, k_)
    }

    var Q1 = e(K1, [["render", C_], ["__file", "caret-right.vue"]]);
    var j1 = {name: "CaretTop"};
    var f2 = c(l());
    var E_ = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"},
        $_ = (0, f2.createElementVNode)("path", {fill: "currentColor", d: "M512 320 192 704h639.936z"}, null, -1),
        V_ = [$_];

    function z_(o, t, r, a, n, s) {
        return (0, f2.openBlock)(), (0, f2.createElementBlock)("svg", E_, V_)
    }

    var J1 = e(j1, [["render", z_], ["__file", "caret-top.vue"]]);
    var X1 = {name: "Cellphone"};
    var i2 = c(l());
    var g_ = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, H_ = (0, i2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M256 128a64 64 0 0 0-64 64v640a64 64 0 0 0 64 64h512a64 64 0 0 0 64-64V192a64 64 0 0 0-64-64H256zm0-64h512a128 128 0 0 1 128 128v640a128 128 0 0 1-128 128H256a128 128 0 0 1-128-128V192A128 128 0 0 1 256 64zm128 128h256a32 32 0 1 1 0 64H384a32 32 0 0 1 0-64zm128 640a64 64 0 1 1 0-128 64 64 0 0 1 0 128z"
    }, null, -1), D_ = [H_];

    function M_(o, t, r, a, n, s) {
        return (0, i2.openBlock)(), (0, i2.createElementBlock)("svg", g_, D_)
    }

    var Y1 = e(X1, [["render", M_], ["__file", "cellphone.vue"]]);
    var er = {name: "ChatDotRound"};
    var P = c(l());
    var N_ = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, y_ = (0, P.createElementVNode)("path", {
        fill: "currentColor",
        d: "m174.72 855.68 135.296-45.12 23.68 11.84C388.096 849.536 448.576 864 512 864c211.84 0 384-166.784 384-352S723.84 160 512 160 128 326.784 128 512c0 69.12 24.96 139.264 70.848 199.232l22.08 28.8-46.272 115.584zm-45.248 82.56A32 32 0 0 1 89.6 896l58.368-145.92C94.72 680.32 64 596.864 64 512 64 299.904 256 96 512 96s448 203.904 448 416-192 416-448 416a461.056 461.056 0 0 1-206.912-48.384l-175.616 58.56z"
    }, null, -1), L_ = (0, P.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 563.2a51.2 51.2 0 1 1 0-102.4 51.2 51.2 0 0 1 0 102.4zm192 0a51.2 51.2 0 1 1 0-102.4 51.2 51.2 0 0 1 0 102.4zm-384 0a51.2 51.2 0 1 1 0-102.4 51.2 51.2 0 0 1 0 102.4z"
    }, null, -1), A_ = [y_, L_];

    function S_(o, t, r, a, n, s) {
        return (0, P.openBlock)(), (0, P.createElementBlock)("svg", N_, A_)
    }

    var or = e(er, [["render", S_], ["__file", "chat-dot-round.vue"]]);
    var tr = {name: "ChatDotSquare"};
    var R = c(l());
    var q_ = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, F_ = (0, R.createElementVNode)("path", {
        fill: "currentColor",
        d: "M273.536 736H800a64 64 0 0 0 64-64V256a64 64 0 0 0-64-64H224a64 64 0 0 0-64 64v570.88L273.536 736zM296 800 147.968 918.4A32 32 0 0 1 96 893.44V256a128 128 0 0 1 128-128h576a128 128 0 0 1 128 128v416a128 128 0 0 1-128 128H296z"
    }, null, -1), b_ = (0, R.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 499.2a51.2 51.2 0 1 1 0-102.4 51.2 51.2 0 0 1 0 102.4zm192 0a51.2 51.2 0 1 1 0-102.4 51.2 51.2 0 0 1 0 102.4zm-384 0a51.2 51.2 0 1 1 0-102.4 51.2 51.2 0 0 1 0 102.4z"
    }, null, -1), P_ = [F_, b_];

    function R_(o, t, r, a, n, s) {
        return (0, R.openBlock)(), (0, R.createElementBlock)("svg", q_, P_)
    }

    var rr = e(tr, [["render", R_], ["__file", "chat-dot-square.vue"]]);
    var nr = {name: "ChatLineRound"};
    var T = c(l());
    var T_ = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, O_ = (0, T.createElementVNode)("path", {
        fill: "currentColor",
        d: "m174.72 855.68 135.296-45.12 23.68 11.84C388.096 849.536 448.576 864 512 864c211.84 0 384-166.784 384-352S723.84 160 512 160 128 326.784 128 512c0 69.12 24.96 139.264 70.848 199.232l22.08 28.8-46.272 115.584zm-45.248 82.56A32 32 0 0 1 89.6 896l58.368-145.92C94.72 680.32 64 596.864 64 512 64 299.904 256 96 512 96s448 203.904 448 416-192 416-448 416a461.056 461.056 0 0 1-206.912-48.384l-175.616 58.56z"
    }, null, -1), G_ = (0, T.createElementVNode)("path", {
        fill: "currentColor",
        d: "M352 576h320q32 0 32 32t-32 32H352q-32 0-32-32t32-32zm32-192h256q32 0 32 32t-32 32H384q-32 0-32-32t32-32z"
    }, null, -1), U_ = [O_, G_];

    function W_(o, t, r, a, n, s) {
        return (0, T.openBlock)(), (0, T.createElementBlock)("svg", T_, U_)
    }

    var ar = e(nr, [["render", W_], ["__file", "chat-line-round.vue"]]);
    var lr = {name: "ChatLineSquare"};
    var O = c(l());
    var I_ = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Z_ = (0, O.createElementVNode)("path", {
        fill: "currentColor",
        d: "M160 826.88 273.536 736H800a64 64 0 0 0 64-64V256a64 64 0 0 0-64-64H224a64 64 0 0 0-64 64v570.88zM296 800 147.968 918.4A32 32 0 0 1 96 893.44V256a128 128 0 0 1 128-128h576a128 128 0 0 1 128 128v416a128 128 0 0 1-128 128H296z"
    }, null, -1), K_ = (0, O.createElementVNode)("path", {
        fill: "currentColor",
        d: "M352 512h320q32 0 32 32t-32 32H352q-32 0-32-32t32-32zm0-192h320q32 0 32 32t-32 32H352q-32 0-32-32t32-32z"
    }, null, -1), Q_ = [Z_, K_];

    function j_(o, t, r, a, n, s) {
        return (0, O.openBlock)(), (0, O.createElementBlock)("svg", I_, Q_)
    }

    var cr = e(lr, [["render", j_], ["__file", "chat-line-square.vue"]]);
    var sr = {name: "ChatRound"};
    var d2 = c(l());
    var J_ = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, X_ = (0, d2.createElementVNode)("path", {
        fill: "currentColor",
        d: "m174.72 855.68 130.048-43.392 23.424 11.392C382.4 849.984 444.352 864 512 864c223.744 0 384-159.872 384-352 0-192.832-159.104-352-384-352S128 319.168 128 512a341.12 341.12 0 0 0 69.248 204.288l21.632 28.8-44.16 110.528zm-45.248 82.56A32 32 0 0 1 89.6 896l56.512-141.248A405.12 405.12 0 0 1 64 512C64 299.904 235.648 96 512 96s448 203.904 448 416-173.44 416-448 416c-79.68 0-150.848-17.152-211.712-46.72l-170.88 56.96z"
    }, null, -1), Y_ = [X_];

    function ef(o, t, r, a, n, s) {
        return (0, d2.openBlock)(), (0, d2.createElementBlock)("svg", J_, Y_)
    }

    var mr = e(sr, [["render", ef], ["__file", "chat-round.vue"]]);
    var pr = {name: "ChatSquare"};
    var u2 = c(l());
    var of = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, tf = (0, u2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M273.536 736H800a64 64 0 0 0 64-64V256a64 64 0 0 0-64-64H224a64 64 0 0 0-64 64v570.88L273.536 736zM296 800 147.968 918.4A32 32 0 0 1 96 893.44V256a128 128 0 0 1 128-128h576a128 128 0 0 1 128 128v416a128 128 0 0 1-128 128H296z"
    }, null, -1), rf = [tf];

    function nf(o, t, r, a, n, s) {
        return (0, u2.openBlock)(), (0, u2.createElementBlock)("svg", of, rf)
    }

    var _r = e(pr, [["render", nf], ["__file", "chat-square.vue"]]);
    var fr = {name: "Check"};
    var h2 = c(l());
    var af = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, lf = (0, h2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M406.656 706.944 195.84 496.256a32 32 0 1 0-45.248 45.248l256 256 512-512a32 32 0 0 0-45.248-45.248L406.592 706.944z"
    }, null, -1), cf = [lf];

    function sf(o, t, r, a, n, s) {
        return (0, h2.openBlock)(), (0, h2.createElementBlock)("svg", af, cf)
    }

    var ir = e(fr, [["render", sf], ["__file", "check.vue"]]);
    var dr = {name: "Checked"};
    var x2 = c(l());
    var mf = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, pf = (0, x2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M704 192h160v736H160V192h160.064v64H704v-64zM311.616 537.28l-45.312 45.248L447.36 763.52l316.8-316.8-45.312-45.184L447.36 673.024 311.616 537.28zM384 192V96h256v96H384z"
    }, null, -1), _f = [pf];

    function ff(o, t, r, a, n, s) {
        return (0, x2.openBlock)(), (0, x2.createElementBlock)("svg", mf, _f)
    }

    var ur = e(dr, [["render", ff], ["__file", "checked.vue"]]);
    var hr = {name: "Cherry"};
    var v2 = c(l());
    var df = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, uf = (0, v2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M261.056 449.6c13.824-69.696 34.88-128.96 63.36-177.728 23.744-40.832 61.12-88.64 112.256-143.872H320a32 32 0 0 1 0-64h384a32 32 0 1 1 0 64H554.752c14.912 39.168 41.344 86.592 79.552 141.76 47.36 68.48 84.8 106.752 106.304 114.304a224 224 0 1 1-84.992 14.784c-22.656-22.912-47.04-53.76-73.92-92.608-38.848-56.128-67.008-105.792-84.352-149.312-55.296 58.24-94.528 107.52-117.76 147.2-23.168 39.744-41.088 88.768-53.568 147.072a224.064 224.064 0 1 1-64.96-1.6zM288 832a160 160 0 1 0 0-320 160 160 0 0 0 0 320zm448-64a160 160 0 1 0 0-320 160 160 0 0 0 0 320z"
    }, null, -1), hf = [uf];

    function xf(o, t, r, a, n, s) {
        return (0, v2.openBlock)(), (0, v2.createElementBlock)("svg", df, hf)
    }

    var xr = e(hr, [["render", xf], ["__file", "cherry.vue"]]);
    var vr = {name: "Chicken"};
    var w2 = c(l());
    var vf = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, wf = (0, w2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M349.952 716.992 478.72 588.16a106.688 106.688 0 0 1-26.176-19.072 106.688 106.688 0 0 1-19.072-26.176L304.704 671.744c.768 3.072 1.472 6.144 2.048 9.216l2.048 31.936 31.872 1.984c3.136.64 6.208 1.28 9.28 2.112zm57.344 33.152a128 128 0 1 1-216.32 114.432l-1.92-32-32-1.92a128 128 0 1 1 114.432-216.32L416.64 469.248c-2.432-101.44 58.112-239.104 149.056-330.048 107.328-107.328 231.296-85.504 316.8 0 85.44 85.44 107.328 209.408 0 316.8-91.008 90.88-228.672 151.424-330.112 149.056L407.296 750.08zm90.496-226.304c49.536 49.536 233.344-7.04 339.392-113.088 78.208-78.208 63.232-163.072 0-226.304-63.168-63.232-148.032-78.208-226.24 0C504.896 290.496 448.32 474.368 497.792 523.84zM244.864 708.928a64 64 0 1 0-59.84 59.84l56.32-3.52 3.52-56.32zm8.064 127.68a64 64 0 1 0 59.84-59.84l-56.32 3.52-3.52 56.32z"
    }, null, -1), Bf = [wf];

    function kf(o, t, r, a, n, s) {
        return (0, w2.openBlock)(), (0, w2.createElementBlock)("svg", vf, Bf)
    }

    var wr = e(vr, [["render", kf], ["__file", "chicken.vue"]]);
    var Br = {name: "ChromeFilled"};
    var d = c(l());
    var Cf = {
        xmlns: "http://www.w3.org/2000/svg",
        "xml:space": "preserve",
        style: {"enable-background": "new 0 0 1024 1024"},
        viewBox: "0 0 1024 1024"
    }, Ef = (0, d.createElementVNode)("path", {
        fill: "currentColor",
        d: "M938.67 512.01c0-44.59-6.82-87.6-19.54-128H682.67a212.372 212.372 0 0 1 42.67 128c.06 38.71-10.45 76.7-30.42 109.87l-182.91 316.8c235.65-.01 426.66-191.02 426.66-426.67z"
    }, null, -1), $f = (0, d.createElementVNode)("path", {
        fill: "currentColor",
        d: "M576.79 401.63a127.92 127.92 0 0 0-63.56-17.6c-22.36-.22-44.39 5.43-63.89 16.38s-35.79 26.82-47.25 46.02a128.005 128.005 0 0 0-2.16 127.44l1.24 2.13a127.906 127.906 0 0 0 46.36 46.61 127.907 127.907 0 0 0 63.38 17.44c22.29.2 44.24-5.43 63.68-16.33a127.94 127.94 0 0 0 47.16-45.79v-.01l1.11-1.92a127.984 127.984 0 0 0 .29-127.46 127.957 127.957 0 0 0-46.36-46.91z"
    }, null, -1), Vf = (0, d.createElementVNode)("path", {
        fill: "currentColor",
        d: "M394.45 333.96A213.336 213.336 0 0 1 512 298.67h369.58A426.503 426.503 0 0 0 512 85.34a425.598 425.598 0 0 0-171.74 35.98 425.644 425.644 0 0 0-142.62 102.22l118.14 204.63a213.397 213.397 0 0 1 78.67-94.21zm117.56 604.72H512zm-97.25-236.73a213.284 213.284 0 0 1-89.54-86.81L142.48 298.6c-36.35 62.81-57.13 135.68-57.13 213.42 0 203.81 142.93 374.22 333.95 416.55h.04l118.19-204.71a213.315 213.315 0 0 1-122.77-21.91z"
    }, null, -1), zf = [Ef, $f, Vf];

    function gf(o, t, r, a, n, s) {
        return (0, d.openBlock)(), (0, d.createElementBlock)("svg", Cf, zf)
    }

    var kr = e(Br, [["render", gf], ["__file", "chrome-filled.vue"]]);
    var Cr = {name: "CircleCheckFilled"};
    var B2 = c(l());
    var Hf = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Df = (0, B2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 64a448 448 0 1 1 0 896 448 448 0 0 1 0-896zm-55.808 536.384-99.52-99.584a38.4 38.4 0 1 0-54.336 54.336l126.72 126.72a38.272 38.272 0 0 0 54.336 0l262.4-262.464a38.4 38.4 0 1 0-54.272-54.336L456.192 600.384z"
    }, null, -1), Mf = [Df];

    function Nf(o, t, r, a, n, s) {
        return (0, B2.openBlock)(), (0, B2.createElementBlock)("svg", Hf, Mf)
    }

    var Er = e(Cr, [["render", Nf], ["__file", "circle-check-filled.vue"]]);
    var $r = {name: "CircleCheck"};
    var G = c(l());
    var yf = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Lf = (0, G.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 896a384 384 0 1 0 0-768 384 384 0 0 0 0 768zm0 64a448 448 0 1 1 0-896 448 448 0 0 1 0 896z"
    }, null, -1), Af = (0, G.createElementVNode)("path", {
        fill: "currentColor",
        d: "M745.344 361.344a32 32 0 0 1 45.312 45.312l-288 288a32 32 0 0 1-45.312 0l-160-160a32 32 0 1 1 45.312-45.312L480 626.752l265.344-265.408z"
    }, null, -1), Sf = [Lf, Af];

    function qf(o, t, r, a, n, s) {
        return (0, G.openBlock)(), (0, G.createElementBlock)("svg", yf, Sf)
    }

    var Vr = e($r, [["render", qf], ["__file", "circle-check.vue"]]);
    var zr = {name: "CircleCloseFilled"};
    var k2 = c(l());
    var Ff = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, bf = (0, k2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 64a448 448 0 1 1 0 896 448 448 0 0 1 0-896zm0 393.664L407.936 353.6a38.4 38.4 0 1 0-54.336 54.336L457.664 512 353.6 616.064a38.4 38.4 0 1 0 54.336 54.336L512 566.336 616.064 670.4a38.4 38.4 0 1 0 54.336-54.336L566.336 512 670.4 407.936a38.4 38.4 0 1 0-54.336-54.336L512 457.664z"
    }, null, -1), Pf = [bf];

    function Rf(o, t, r, a, n, s) {
        return (0, k2.openBlock)(), (0, k2.createElementBlock)("svg", Ff, Pf)
    }

    var gr = e(zr, [["render", Rf], ["__file", "circle-close-filled.vue"]]);
    var Hr = {name: "CircleClose"};
    var U = c(l());
    var Tf = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Of = (0, U.createElementVNode)("path", {
        fill: "currentColor",
        d: "m466.752 512-90.496-90.496a32 32 0 0 1 45.248-45.248L512 466.752l90.496-90.496a32 32 0 1 1 45.248 45.248L557.248 512l90.496 90.496a32 32 0 1 1-45.248 45.248L512 557.248l-90.496 90.496a32 32 0 0 1-45.248-45.248L466.752 512z"
    }, null, -1), Gf = (0, U.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 896a384 384 0 1 0 0-768 384 384 0 0 0 0 768zm0 64a448 448 0 1 1 0-896 448 448 0 0 1 0 896z"
    }, null, -1), Uf = [Of, Gf];

    function Wf(o, t, r, a, n, s) {
        return (0, U.openBlock)(), (0, U.createElementBlock)("svg", Tf, Uf)
    }

    var Dr = e(Hr, [["render", Wf], ["__file", "circle-close.vue"]]);
    var Mr = {name: "CirclePlusFilled"};
    var C2 = c(l());
    var If = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Zf = (0, C2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 64a448 448 0 1 1 0 896 448 448 0 0 1 0-896zm-38.4 409.6H326.4a38.4 38.4 0 1 0 0 76.8h147.2v147.2a38.4 38.4 0 0 0 76.8 0V550.4h147.2a38.4 38.4 0 0 0 0-76.8H550.4V326.4a38.4 38.4 0 1 0-76.8 0v147.2z"
    }, null, -1), Kf = [Zf];

    function Qf(o, t, r, a, n, s) {
        return (0, C2.openBlock)(), (0, C2.createElementBlock)("svg", If, Kf)
    }

    var Nr = e(Mr, [["render", Qf], ["__file", "circle-plus-filled.vue"]]);
    var yr = {name: "CirclePlus"};
    var u = c(l());
    var jf = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Jf = (0, u.createElementVNode)("path", {
        fill: "currentColor",
        d: "M352 480h320a32 32 0 1 1 0 64H352a32 32 0 0 1 0-64z"
    }, null, -1), Xf = (0, u.createElementVNode)("path", {
        fill: "currentColor",
        d: "M480 672V352a32 32 0 1 1 64 0v320a32 32 0 0 1-64 0z"
    }, null, -1), Yf = (0, u.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 896a384 384 0 1 0 0-768 384 384 0 0 0 0 768zm0 64a448 448 0 1 1 0-896 448 448 0 0 1 0 896z"
    }, null, -1), ei = [Jf, Xf, Yf];

    function oi(o, t, r, a, n, s) {
        return (0, u.openBlock)(), (0, u.createElementBlock)("svg", jf, ei)
    }

    var Lr = e(yr, [["render", oi], ["__file", "circle-plus.vue"]]);
    var Ar = {name: "Clock"};
    var h = c(l());
    var ti = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, ri = (0, h.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 896a384 384 0 1 0 0-768 384 384 0 0 0 0 768zm0 64a448 448 0 1 1 0-896 448 448 0 0 1 0 896z"
    }, null, -1), ni = (0, h.createElementVNode)("path", {
        fill: "currentColor",
        d: "M480 256a32 32 0 0 1 32 32v256a32 32 0 0 1-64 0V288a32 32 0 0 1 32-32z"
    }, null, -1), ai = (0, h.createElementVNode)("path", {
        fill: "currentColor",
        d: "M480 512h256q32 0 32 32t-32 32H480q-32 0-32-32t32-32z"
    }, null, -1), li = [ri, ni, ai];

    function ci(o, t, r, a, n, s) {
        return (0, h.openBlock)(), (0, h.createElementBlock)("svg", ti, li)
    }

    var Sr = e(Ar, [["render", ci], ["__file", "clock.vue"]]);
    var qr = {name: "CloseBold"};
    var E2 = c(l());
    var si = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, mi = (0, E2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M195.2 195.2a64 64 0 0 1 90.496 0L512 421.504 738.304 195.2a64 64 0 0 1 90.496 90.496L602.496 512 828.8 738.304a64 64 0 0 1-90.496 90.496L512 602.496 285.696 828.8a64 64 0 0 1-90.496-90.496L421.504 512 195.2 285.696a64 64 0 0 1 0-90.496z"
    }, null, -1), pi = [mi];

    function _i(o, t, r, a, n, s) {
        return (0, E2.openBlock)(), (0, E2.createElementBlock)("svg", si, pi)
    }

    var Fr = e(qr, [["render", _i], ["__file", "close-bold.vue"]]);
    var br = {name: "Close"};
    var $2 = c(l());
    var fi = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, ii = (0, $2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M764.288 214.592 512 466.88 259.712 214.592a31.936 31.936 0 0 0-45.12 45.12L466.752 512 214.528 764.224a31.936 31.936 0 1 0 45.12 45.184L512 557.184l252.288 252.288a31.936 31.936 0 0 0 45.12-45.12L557.12 512.064l252.288-252.352a31.936 31.936 0 1 0-45.12-45.184z"
    }, null, -1), di = [ii];

    function ui(o, t, r, a, n, s) {
        return (0, $2.openBlock)(), (0, $2.createElementBlock)("svg", fi, di)
    }

    var Pr = e(br, [["render", ui], ["__file", "close.vue"]]);
    var Rr = {name: "Cloudy"};
    var V2 = c(l());
    var hi = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, xi = (0, V2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M598.4 831.872H328.192a256 256 0 0 1-34.496-510.528A352 352 0 1 1 598.4 831.872zm-271.36-64h272.256a288 288 0 1 0-248.512-417.664L335.04 381.44l-34.816 3.584a192 192 0 0 0 26.88 382.848z"
    }, null, -1), vi = [xi];

    function wi(o, t, r, a, n, s) {
        return (0, V2.openBlock)(), (0, V2.createElementBlock)("svg", hi, vi)
    }

    var Tr = e(Rr, [["render", wi], ["__file", "cloudy.vue"]]);
    var Or = {name: "CoffeeCup"};
    var z2 = c(l());
    var Bi = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, ki = (0, z2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M768 192a192 192 0 1 1-8 383.808A256.128 256.128 0 0 1 512 768H320A256 256 0 0 1 64 512V160a32 32 0 0 1 32-32h640a32 32 0 0 1 32 32v32zm0 64v256a128 128 0 1 0 0-256zM96 832h640a32 32 0 1 1 0 64H96a32 32 0 1 1 0-64zm32-640v320a192 192 0 0 0 192 192h192a192 192 0 0 0 192-192V192H128z"
    }, null, -1), Ci = [ki];

    function Ei(o, t, r, a, n, s) {
        return (0, z2.openBlock)(), (0, z2.createElementBlock)("svg", Bi, Ci)
    }

    var Gr = e(Or, [["render", Ei], ["__file", "coffee-cup.vue"]]);
    var Ur = {name: "Coffee"};
    var g2 = c(l());
    var $i = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Vi = (0, g2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M822.592 192h14.272a32 32 0 0 1 31.616 26.752l21.312 128A32 32 0 0 1 858.24 384h-49.344l-39.04 546.304A32 32 0 0 1 737.92 960H285.824a32 32 0 0 1-32-29.696L214.912 384H165.76a32 32 0 0 1-31.552-37.248l21.312-128A32 32 0 0 1 187.136 192h14.016l-6.72-93.696A32 32 0 0 1 226.368 64h571.008a32 32 0 0 1 31.936 34.304L822.592 192zm-64.128 0 4.544-64H260.736l4.544 64h493.184zm-548.16 128H820.48l-10.688-64H214.208l-10.688 64h6.784zm68.736 64 36.544 512H708.16l36.544-512H279.04z"
    }, null, -1), zi = [Vi];

    function gi(o, t, r, a, n, s) {
        return (0, g2.openBlock)(), (0, g2.createElementBlock)("svg", $i, zi)
    }

    var Wr = e(Ur, [["render", gi], ["__file", "coffee.vue"]]);
    var Ir = {name: "Coin"};
    var x = c(l());
    var Hi = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Di = (0, x.createElementVNode)("path", {
        fill: "currentColor",
        d: "m161.92 580.736 29.888 58.88C171.328 659.776 160 681.728 160 704c0 82.304 155.328 160 352 160s352-77.696 352-160c0-22.272-11.392-44.16-31.808-64.32l30.464-58.432C903.936 615.808 928 657.664 928 704c0 129.728-188.544 224-416 224S96 833.728 96 704c0-46.592 24.32-88.576 65.92-123.264z"
    }, null, -1), Mi = (0, x.createElementVNode)("path", {
        fill: "currentColor",
        d: "m161.92 388.736 29.888 58.88C171.328 467.84 160 489.792 160 512c0 82.304 155.328 160 352 160s352-77.696 352-160c0-22.272-11.392-44.16-31.808-64.32l30.464-58.432C903.936 423.808 928 465.664 928 512c0 129.728-188.544 224-416 224S96 641.728 96 512c0-46.592 24.32-88.576 65.92-123.264z"
    }, null, -1), Ni = (0, x.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 544c-227.456 0-416-94.272-416-224S284.544 96 512 96s416 94.272 416 224-188.544 224-416 224zm0-64c196.672 0 352-77.696 352-160S708.672 160 512 160s-352 77.696-352 160 155.328 160 352 160z"
    }, null, -1), yi = [Di, Mi, Ni];

    function Li(o, t, r, a, n, s) {
        return (0, x.openBlock)(), (0, x.createElementBlock)("svg", Hi, yi)
    }

    var Zr = e(Ir, [["render", Li], ["__file", "coin.vue"]]);
    var Kr = {name: "ColdDrink"};
    var H2 = c(l());
    var Ai = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Si = (0, H2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M768 64a192 192 0 1 1-69.952 370.88L480 725.376V896h96a32 32 0 1 1 0 64H320a32 32 0 1 1 0-64h96V725.376L76.8 273.536a64 64 0 0 1-12.8-38.4v-10.688a32 32 0 0 1 32-32h71.808l-65.536-83.84a32 32 0 0 1 50.432-39.424l96.256 123.264h337.728A192.064 192.064 0 0 1 768 64zM656.896 192.448H800a32 32 0 0 1 32 32v10.624a64 64 0 0 1-12.8 38.4l-80.448 107.2a128 128 0 1 0-81.92-188.16v-.064zm-357.888 64 129.472 165.76a32 32 0 0 1-50.432 39.36l-160.256-205.12H144l304 404.928 304-404.928H299.008z"
    }, null, -1), qi = [Si];

    function Fi(o, t, r, a, n, s) {
        return (0, H2.openBlock)(), (0, H2.createElementBlock)("svg", Ai, qi)
    }

    var Qr = e(Kr, [["render", Fi], ["__file", "cold-drink.vue"]]);
    var jr = {name: "CollectionTag"};
    var D2 = c(l());
    var bi = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Pi = (0, D2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M256 128v698.88l196.032-156.864a96 96 0 0 1 119.936 0L768 826.816V128H256zm-32-64h576a32 32 0 0 1 32 32v797.44a32 32 0 0 1-51.968 24.96L531.968 720a32 32 0 0 0-39.936 0L243.968 918.4A32 32 0 0 1 192 893.44V96a32 32 0 0 1 32-32z"
    }, null, -1), Ri = [Pi];

    function Ti(o, t, r, a, n, s) {
        return (0, D2.openBlock)(), (0, D2.createElementBlock)("svg", bi, Ri)
    }

    var Jr = e(jr, [["render", Ti], ["__file", "collection-tag.vue"]]);
    var Xr = {name: "Collection"};
    var W = c(l());
    var Oi = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Gi = (0, W.createElementVNode)("path", {
        fill: "currentColor",
        d: "M192 736h640V128H256a64 64 0 0 0-64 64v544zm64-672h608a32 32 0 0 1 32 32v672a32 32 0 0 1-32 32H160l-32 57.536V192A128 128 0 0 1 256 64z"
    }, null, -1), Ui = (0, W.createElementVNode)("path", {
        fill: "currentColor",
        d: "M240 800a48 48 0 1 0 0 96h592v-96H240zm0-64h656v160a64 64 0 0 1-64 64H240a112 112 0 0 1 0-224zm144-608v250.88l96-76.8 96 76.8V128H384zm-64-64h320v381.44a32 32 0 0 1-51.968 24.96L480 384l-108.032 86.4A32 32 0 0 1 320 445.44V64z"
    }, null, -1), Wi = [Gi, Ui];

    function Ii(o, t, r, a, n, s) {
        return (0, W.openBlock)(), (0, W.createElementBlock)("svg", Oi, Wi)
    }

    var Yr = e(Xr, [["render", Ii], ["__file", "collection.vue"]]);
    var e4 = {name: "Comment"};
    var M2 = c(l());
    var Zi = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Ki = (0, M2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M736 504a56 56 0 1 1 0-112 56 56 0 0 1 0 112zm-224 0a56 56 0 1 1 0-112 56 56 0 0 1 0 112zm-224 0a56 56 0 1 1 0-112 56 56 0 0 1 0 112zM128 128v640h192v160l224-160h352V128H128z"
    }, null, -1), Qi = [Ki];

    function ji(o, t, r, a, n, s) {
        return (0, M2.openBlock)(), (0, M2.createElementBlock)("svg", Zi, Qi)
    }

    var o4 = e(e4, [["render", ji], ["__file", "comment.vue"]]);
    var t4 = {name: "Compass"};
    var I = c(l());
    var Ji = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Xi = (0, I.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 896a384 384 0 1 0 0-768 384 384 0 0 0 0 768zm0 64a448 448 0 1 1 0-896 448 448 0 0 1 0 896z"
    }, null, -1), Yi = (0, I.createElementVNode)("path", {
        fill: "currentColor",
        d: "M725.888 315.008C676.48 428.672 624 513.28 568.576 568.64c-55.424 55.424-139.968 107.904-253.568 157.312a12.8 12.8 0 0 1-16.896-16.832c49.536-113.728 102.016-198.272 157.312-253.632 55.36-55.296 139.904-107.776 253.632-157.312a12.8 12.8 0 0 1 16.832 16.832z"
    }, null, -1), e5 = [Xi, Yi];

    function o5(o, t, r, a, n, s) {
        return (0, I.openBlock)(), (0, I.createElementBlock)("svg", Ji, e5)
    }

    var r4 = e(t4, [["render", o5], ["__file", "compass.vue"]]);
    var n4 = {name: "Connection"};
    var Z = c(l());
    var t5 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, r5 = (0, Z.createElementVNode)("path", {
        fill: "currentColor",
        d: "M640 384v64H448a128 128 0 0 0-128 128v128a128 128 0 0 0 128 128h320a128 128 0 0 0 128-128V576a128 128 0 0 0-64-110.848V394.88c74.56 26.368 128 97.472 128 181.056v128a192 192 0 0 1-192 192H448a192 192 0 0 1-192-192V576a192 192 0 0 1 192-192h192z"
    }, null, -1), n5 = (0, Z.createElementVNode)("path", {
        fill: "currentColor",
        d: "M384 640v-64h192a128 128 0 0 0 128-128V320a128 128 0 0 0-128-128H256a128 128 0 0 0-128 128v128a128 128 0 0 0 64 110.848v70.272A192.064 192.064 0 0 1 64 448V320a192 192 0 0 1 192-192h320a192 192 0 0 1 192 192v128a192 192 0 0 1-192 192H384z"
    }, null, -1), a5 = [r5, n5];

    function l5(o, t, r, a, n, s) {
        return (0, Z.openBlock)(), (0, Z.createElementBlock)("svg", t5, a5)
    }

    var a4 = e(n4, [["render", l5], ["__file", "connection.vue"]]);
    var l4 = {name: "Coordinate"};
    var K = c(l());
    var c5 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"},
        s5 = (0, K.createElementVNode)("path", {fill: "currentColor", d: "M480 512h64v320h-64z"}, null, -1),
        m5 = (0, K.createElementVNode)("path", {
            fill: "currentColor",
            d: "M192 896h640a64 64 0 0 0-64-64H256a64 64 0 0 0-64 64zm64-128h512a128 128 0 0 1 128 128v64H128v-64a128 128 0 0 1 128-128zm256-256a192 192 0 1 0 0-384 192 192 0 0 0 0 384zm0 64a256 256 0 1 1 0-512 256 256 0 0 1 0 512z"
        }, null, -1), p5 = [s5, m5];

    function _5(o, t, r, a, n, s) {
        return (0, K.openBlock)(), (0, K.createElementBlock)("svg", c5, p5)
    }

    var c4 = e(l4, [["render", _5], ["__file", "coordinate.vue"]]);
    var s4 = {name: "CopyDocument"};
    var Q = c(l());
    var f5 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, i5 = (0, Q.createElementVNode)("path", {
        fill: "currentColor",
        d: "M768 832a128 128 0 0 1-128 128H192A128 128 0 0 1 64 832V384a128 128 0 0 1 128-128v64a64 64 0 0 0-64 64v448a64 64 0 0 0 64 64h448a64 64 0 0 0 64-64h64z"
    }, null, -1), d5 = (0, Q.createElementVNode)("path", {
        fill: "currentColor",
        d: "M384 128a64 64 0 0 0-64 64v448a64 64 0 0 0 64 64h448a64 64 0 0 0 64-64V192a64 64 0 0 0-64-64H384zm0-64h448a128 128 0 0 1 128 128v448a128 128 0 0 1-128 128H384a128 128 0 0 1-128-128V192A128 128 0 0 1 384 64z"
    }, null, -1), u5 = [i5, d5];

    function h5(o, t, r, a, n, s) {
        return (0, Q.openBlock)(), (0, Q.createElementBlock)("svg", f5, u5)
    }

    var m4 = e(s4, [["render", h5], ["__file", "copy-document.vue"]]);
    var p4 = {name: "Cpu"};
    var j = c(l());
    var x5 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, v5 = (0, j.createElementVNode)("path", {
        fill: "currentColor",
        d: "M320 256a64 64 0 0 0-64 64v384a64 64 0 0 0 64 64h384a64 64 0 0 0 64-64V320a64 64 0 0 0-64-64H320zm0-64h384a128 128 0 0 1 128 128v384a128 128 0 0 1-128 128H320a128 128 0 0 1-128-128V320a128 128 0 0 1 128-128z"
    }, null, -1), w5 = (0, j.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 64a32 32 0 0 1 32 32v128h-64V96a32 32 0 0 1 32-32zm160 0a32 32 0 0 1 32 32v128h-64V96a32 32 0 0 1 32-32zm-320 0a32 32 0 0 1 32 32v128h-64V96a32 32 0 0 1 32-32zm160 896a32 32 0 0 1-32-32V800h64v128a32 32 0 0 1-32 32zm160 0a32 32 0 0 1-32-32V800h64v128a32 32 0 0 1-32 32zm-320 0a32 32 0 0 1-32-32V800h64v128a32 32 0 0 1-32 32zM64 512a32 32 0 0 1 32-32h128v64H96a32 32 0 0 1-32-32zm0-160a32 32 0 0 1 32-32h128v64H96a32 32 0 0 1-32-32zm0 320a32 32 0 0 1 32-32h128v64H96a32 32 0 0 1-32-32zm896-160a32 32 0 0 1-32 32H800v-64h128a32 32 0 0 1 32 32zm0-160a32 32 0 0 1-32 32H800v-64h128a32 32 0 0 1 32 32zm0 320a32 32 0 0 1-32 32H800v-64h128a32 32 0 0 1 32 32z"
    }, null, -1), B5 = [v5, w5];

    function k5(o, t, r, a, n, s) {
        return (0, j.openBlock)(), (0, j.createElementBlock)("svg", x5, B5)
    }

    var _4 = e(p4, [["render", k5], ["__file", "cpu.vue"]]);
    var f4 = {name: "CreditCard"};
    var J = c(l());
    var C5 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, E5 = (0, J.createElementVNode)("path", {
        fill: "currentColor",
        d: "M896 324.096c0-42.368-2.496-55.296-9.536-68.48a52.352 52.352 0 0 0-22.144-22.08c-13.12-7.04-26.048-9.536-68.416-9.536H228.096c-42.368 0-55.296 2.496-68.48 9.536a52.352 52.352 0 0 0-22.08 22.144c-7.04 13.12-9.536 26.048-9.536 68.416v375.808c0 42.368 2.496 55.296 9.536 68.48a52.352 52.352 0 0 0 22.144 22.08c13.12 7.04 26.048 9.536 68.416 9.536h567.808c42.368 0 55.296-2.496 68.48-9.536a52.352 52.352 0 0 0 22.08-22.144c7.04-13.12 9.536-26.048 9.536-68.416V324.096zm64 0v375.808c0 57.088-5.952 77.76-17.088 98.56-11.136 20.928-27.52 37.312-48.384 48.448-20.864 11.136-41.6 17.088-98.56 17.088H228.032c-57.088 0-77.76-5.952-98.56-17.088a116.288 116.288 0 0 1-48.448-48.384c-11.136-20.864-17.088-41.6-17.088-98.56V324.032c0-57.088 5.952-77.76 17.088-98.56 11.136-20.928 27.52-37.312 48.384-48.448 20.864-11.136 41.6-17.088 98.56-17.088H795.84c57.088 0 77.76 5.952 98.56 17.088 20.928 11.136 37.312 27.52 48.448 48.384 11.136 20.864 17.088 41.6 17.088 98.56z"
    }, null, -1), $5 = (0, J.createElementVNode)("path", {
        fill: "currentColor",
        d: "M64 320h896v64H64v-64zm0 128h896v64H64v-64zm128 192h256v64H192z"
    }, null, -1), V5 = [E5, $5];

    function z5(o, t, r, a, n, s) {
        return (0, J.openBlock)(), (0, J.createElementBlock)("svg", C5, V5)
    }

    var i4 = e(f4, [["render", z5], ["__file", "credit-card.vue"]]);
    var d4 = {name: "Crop"};
    var X = c(l());
    var g5 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, H5 = (0, X.createElementVNode)("path", {
        fill: "currentColor",
        d: "M256 768h672a32 32 0 1 1 0 64H224a32 32 0 0 1-32-32V96a32 32 0 0 1 64 0v672z"
    }, null, -1), D5 = (0, X.createElementVNode)("path", {
        fill: "currentColor",
        d: "M832 224v704a32 32 0 1 1-64 0V256H96a32 32 0 0 1 0-64h704a32 32 0 0 1 32 32z"
    }, null, -1), M5 = [H5, D5];

    function N5(o, t, r, a, n, s) {
        return (0, X.openBlock)(), (0, X.createElementBlock)("svg", g5, M5)
    }

    var u4 = e(d4, [["render", N5], ["__file", "crop.vue"]]);
    var h4 = {name: "DArrowLeft"};
    var N2 = c(l());
    var y5 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, L5 = (0, N2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M529.408 149.376a29.12 29.12 0 0 1 41.728 0 30.592 30.592 0 0 1 0 42.688L259.264 511.936l311.872 319.936a30.592 30.592 0 0 1-.512 43.264 29.12 29.12 0 0 1-41.216-.512L197.76 534.272a32 32 0 0 1 0-44.672l331.648-340.224zm256 0a29.12 29.12 0 0 1 41.728 0 30.592 30.592 0 0 1 0 42.688L515.264 511.936l311.872 319.936a30.592 30.592 0 0 1-.512 43.264 29.12 29.12 0 0 1-41.216-.512L453.76 534.272a32 32 0 0 1 0-44.672l331.648-340.224z"
    }, null, -1), A5 = [L5];

    function S5(o, t, r, a, n, s) {
        return (0, N2.openBlock)(), (0, N2.createElementBlock)("svg", y5, A5)
    }

    var x4 = e(h4, [["render", S5], ["__file", "d-arrow-left.vue"]]);
    var v4 = {name: "DArrowRight"};
    var y2 = c(l());
    var q5 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, F5 = (0, y2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M452.864 149.312a29.12 29.12 0 0 1 41.728.064L826.24 489.664a32 32 0 0 1 0 44.672L494.592 874.624a29.12 29.12 0 0 1-41.728 0 30.592 30.592 0 0 1 0-42.752L764.736 512 452.864 192a30.592 30.592 0 0 1 0-42.688zm-256 0a29.12 29.12 0 0 1 41.728.064L570.24 489.664a32 32 0 0 1 0 44.672L238.592 874.624a29.12 29.12 0 0 1-41.728 0 30.592 30.592 0 0 1 0-42.752L508.736 512 196.864 192a30.592 30.592 0 0 1 0-42.688z"
    }, null, -1), b5 = [F5];

    function P5(o, t, r, a, n, s) {
        return (0, y2.openBlock)(), (0, y2.createElementBlock)("svg", q5, b5)
    }

    var w4 = e(v4, [["render", P5], ["__file", "d-arrow-right.vue"]]);
    var B4 = {name: "DCaret"};
    var L2 = c(l());
    var R5 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, T5 = (0, L2.createElementVNode)("path", {
        fill: "currentColor",
        d: "m512 128 288 320H224l288-320zM224 576h576L512 896 224 576z"
    }, null, -1), O5 = [T5];

    function G5(o, t, r, a, n, s) {
        return (0, L2.openBlock)(), (0, L2.createElementBlock)("svg", R5, O5)
    }

    var k4 = e(B4, [["render", G5], ["__file", "d-caret.vue"]]);
    var C4 = {name: "DataAnalysis"};
    var A2 = c(l());
    var U5 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, W5 = (0, A2.createElementVNode)("path", {
        fill: "currentColor",
        d: "m665.216 768 110.848 192h-73.856L591.36 768H433.024L322.176 960H248.32l110.848-192H160a32 32 0 0 1-32-32V192H64a32 32 0 0 1 0-64h896a32 32 0 1 1 0 64h-64v544a32 32 0 0 1-32 32H665.216zM832 192H192v512h640V192zM352 448a32 32 0 0 1 32 32v64a32 32 0 0 1-64 0v-64a32 32 0 0 1 32-32zm160-64a32 32 0 0 1 32 32v128a32 32 0 0 1-64 0V416a32 32 0 0 1 32-32zm160-64a32 32 0 0 1 32 32v192a32 32 0 1 1-64 0V352a32 32 0 0 1 32-32z"
    }, null, -1), I5 = [W5];

    function Z5(o, t, r, a, n, s) {
        return (0, A2.openBlock)(), (0, A2.createElementBlock)("svg", U5, I5)
    }

    var E4 = e(C4, [["render", Z5], ["__file", "data-analysis.vue"]]);
    var $4 = {name: "DataBoard"};
    var v = c(l());
    var K5 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"},
        Q5 = (0, v.createElementVNode)("path", {fill: "currentColor", d: "M32 128h960v64H32z"}, null, -1),
        j5 = (0, v.createElementVNode)("path", {
            fill: "currentColor",
            d: "M192 192v512h640V192H192zm-64-64h768v608a32 32 0 0 1-32 32H160a32 32 0 0 1-32-32V128z"
        }, null, -1), J5 = (0, v.createElementVNode)("path", {
            fill: "currentColor",
            d: "M322.176 960H248.32l144.64-250.56 55.424 32L322.176 960zm453.888 0h-73.856L576 741.44l55.424-32L776.064 960z"
        }, null, -1), X5 = [Q5, j5, J5];

    function Y5(o, t, r, a, n, s) {
        return (0, v.openBlock)(), (0, v.createElementBlock)("svg", K5, X5)
    }

    var V4 = e($4, [["render", Y5], ["__file", "data-board.vue"]]);
    var z4 = {name: "DataLine"};
    var S2 = c(l());
    var e9 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, o9 = (0, S2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M359.168 768H160a32 32 0 0 1-32-32V192H64a32 32 0 0 1 0-64h896a32 32 0 1 1 0 64h-64v544a32 32 0 0 1-32 32H665.216l110.848 192h-73.856L591.36 768H433.024L322.176 960H248.32l110.848-192zM832 192H192v512h640V192zM342.656 534.656a32 32 0 1 1-45.312-45.312L444.992 341.76l125.44 94.08L679.04 300.032a32 32 0 1 1 49.92 39.936L581.632 524.224 451.008 426.24 342.656 534.592z"
    }, null, -1), t9 = [o9];

    function r9(o, t, r, a, n, s) {
        return (0, S2.openBlock)(), (0, S2.createElementBlock)("svg", e9, t9)
    }

    var g4 = e(z4, [["render", r9], ["__file", "data-line.vue"]]);
    var H4 = {name: "DeleteFilled"};
    var q2 = c(l());
    var n9 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, a9 = (0, q2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M352 192V95.936a32 32 0 0 1 32-32h256a32 32 0 0 1 32 32V192h256a32 32 0 1 1 0 64H96a32 32 0 0 1 0-64h256zm64 0h192v-64H416v64zM192 960a32 32 0 0 1-32-32V256h704v672a32 32 0 0 1-32 32H192zm224-192a32 32 0 0 0 32-32V416a32 32 0 0 0-64 0v320a32 32 0 0 0 32 32zm192 0a32 32 0 0 0 32-32V416a32 32 0 0 0-64 0v320a32 32 0 0 0 32 32z"
    }, null, -1), l9 = [a9];

    function c9(o, t, r, a, n, s) {
        return (0, q2.openBlock)(), (0, q2.createElementBlock)("svg", n9, l9)
    }

    var D4 = e(H4, [["render", c9], ["__file", "delete-filled.vue"]]);
    var M4 = {name: "DeleteLocation"};
    var w = c(l());
    var s9 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, m9 = (0, w.createElementVNode)("path", {
        fill: "currentColor",
        d: "M288 896h448q32 0 32 32t-32 32H288q-32 0-32-32t32-32z"
    }, null, -1), p9 = (0, w.createElementVNode)("path", {
        fill: "currentColor",
        d: "M800 416a288 288 0 1 0-576 0c0 118.144 94.528 272.128 288 456.576C705.472 688.128 800 534.144 800 416zM512 960C277.312 746.688 160 565.312 160 416a352 352 0 0 1 704 0c0 149.312-117.312 330.688-352 544z"
    }, null, -1), _9 = (0, w.createElementVNode)("path", {
        fill: "currentColor",
        d: "M384 384h256q32 0 32 32t-32 32H384q-32 0-32-32t32-32z"
    }, null, -1), f9 = [m9, p9, _9];

    function i9(o, t, r, a, n, s) {
        return (0, w.openBlock)(), (0, w.createElementBlock)("svg", s9, f9)
    }

    var N4 = e(M4, [["render", i9], ["__file", "delete-location.vue"]]);
    var y4 = {name: "Delete"};
    var F2 = c(l());
    var d9 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, u9 = (0, F2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M160 256H96a32 32 0 0 1 0-64h256V95.936a32 32 0 0 1 32-32h256a32 32 0 0 1 32 32V192h256a32 32 0 1 1 0 64h-64v672a32 32 0 0 1-32 32H192a32 32 0 0 1-32-32V256zm448-64v-64H416v64h192zM224 896h576V256H224v640zm192-128a32 32 0 0 1-32-32V416a32 32 0 0 1 64 0v320a32 32 0 0 1-32 32zm192 0a32 32 0 0 1-32-32V416a32 32 0 0 1 64 0v320a32 32 0 0 1-32 32z"
    }, null, -1), h9 = [u9];

    function x9(o, t, r, a, n, s) {
        return (0, F2.openBlock)(), (0, F2.createElementBlock)("svg", d9, h9)
    }

    var L4 = e(y4, [["render", x9], ["__file", "delete.vue"]]);
    var A4 = {name: "Dessert"};
    var b2 = c(l());
    var v9 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, w9 = (0, b2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M128 416v-48a144 144 0 0 1 168.64-141.888 224.128 224.128 0 0 1 430.72 0A144 144 0 0 1 896 368v48a384 384 0 0 1-352 382.72V896h-64v-97.28A384 384 0 0 1 128 416zm287.104-32.064h193.792a143.808 143.808 0 0 1 58.88-132.736 160.064 160.064 0 0 0-311.552 0 143.808 143.808 0 0 1 58.88 132.8zm-72.896 0a72 72 0 1 0-140.48 0h140.48zm339.584 0h140.416a72 72 0 1 0-140.48 0zM512 736a320 320 0 0 0 318.4-288.064H193.6A320 320 0 0 0 512 736zM384 896.064h256a32 32 0 1 1 0 64H384a32 32 0 1 1 0-64z"
    }, null, -1), B9 = [w9];

    function k9(o, t, r, a, n, s) {
        return (0, b2.openBlock)(), (0, b2.createElementBlock)("svg", v9, B9)
    }

    var S4 = e(A4, [["render", k9], ["__file", "dessert.vue"]]);
    var q4 = {name: "Discount"};
    var Y = c(l());
    var C9 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, E9 = (0, Y.createElementVNode)("path", {
        fill: "currentColor",
        d: "M224 704h576V318.336L552.512 115.84a64 64 0 0 0-81.024 0L224 318.336V704zm0 64v128h576V768H224zM593.024 66.304l259.2 212.096A32 32 0 0 1 864 303.168V928a32 32 0 0 1-32 32H192a32 32 0 0 1-32-32V303.168a32 32 0 0 1 11.712-24.768l259.2-212.096a128 128 0 0 1 162.112 0z"
    }, null, -1), $9 = (0, Y.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 448a64 64 0 1 0 0-128 64 64 0 0 0 0 128zm0 64a128 128 0 1 1 0-256 128 128 0 0 1 0 256z"
    }, null, -1), V9 = [E9, $9];

    function z9(o, t, r, a, n, s) {
        return (0, Y.openBlock)(), (0, Y.createElementBlock)("svg", C9, V9)
    }

    var F4 = e(q4, [["render", z9], ["__file", "discount.vue"]]);
    var b4 = {name: "DishDot"};
    var P2 = c(l());
    var g9 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, H9 = (0, P2.createElementVNode)("path", {
        fill: "currentColor",
        d: "m384.064 274.56.064-50.688A128 128 0 0 1 512.128 96c70.528 0 127.68 57.152 127.68 127.68v50.752A448.192 448.192 0 0 1 955.392 768H68.544A448.192 448.192 0 0 1 384 274.56zM96 832h832a32 32 0 1 1 0 64H96a32 32 0 1 1 0-64zm32-128h768a384 384 0 1 0-768 0zm447.808-448v-32.32a63.68 63.68 0 0 0-63.68-63.68 64 64 0 0 0-64 63.936V256h127.68z"
    }, null, -1), D9 = [H9];

    function M9(o, t, r, a, n, s) {
        return (0, P2.openBlock)(), (0, P2.createElementBlock)("svg", g9, D9)
    }

    var P4 = e(b4, [["render", M9], ["__file", "dish-dot.vue"]]);
    var R4 = {name: "Dish"};
    var R2 = c(l());
    var N9 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, y9 = (0, R2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M480 257.152V192h-96a32 32 0 0 1 0-64h256a32 32 0 1 1 0 64h-96v65.152A448 448 0 0 1 955.52 768H68.48A448 448 0 0 1 480 257.152zM128 704h768a384 384 0 1 0-768 0zM96 832h832a32 32 0 1 1 0 64H96a32 32 0 1 1 0-64z"
    }, null, -1), L9 = [y9];

    function A9(o, t, r, a, n, s) {
        return (0, R2.openBlock)(), (0, R2.createElementBlock)("svg", N9, L9)
    }

    var T4 = e(R4, [["render", A9], ["__file", "dish.vue"]]);
    var O4 = {name: "DocumentAdd"};
    var T2 = c(l());
    var S9 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, q9 = (0, T2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M832 384H576V128H192v768h640V384zm-26.496-64L640 154.496V320h165.504zM160 64h480l256 256v608a32 32 0 0 1-32 32H160a32 32 0 0 1-32-32V96a32 32 0 0 1 32-32zm320 512V448h64v128h128v64H544v128h-64V640H352v-64h128z"
    }, null, -1), F9 = [q9];

    function b9(o, t, r, a, n, s) {
        return (0, T2.openBlock)(), (0, T2.createElementBlock)("svg", S9, F9)
    }

    var G4 = e(O4, [["render", b9], ["__file", "document-add.vue"]]);
    var U4 = {name: "DocumentChecked"};
    var O2 = c(l());
    var P9 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, R9 = (0, O2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M805.504 320 640 154.496V320h165.504zM832 384H576V128H192v768h640V384zM160 64h480l256 256v608a32 32 0 0 1-32 32H160a32 32 0 0 1-32-32V96a32 32 0 0 1 32-32zm318.4 582.144 180.992-180.992L704.64 510.4 478.4 736.64 320 578.304l45.248-45.312L478.4 646.144z"
    }, null, -1), T9 = [R9];

    function O9(o, t, r, a, n, s) {
        return (0, O2.openBlock)(), (0, O2.createElementBlock)("svg", P9, T9)
    }

    var W4 = e(U4, [["render", O9], ["__file", "document-checked.vue"]]);
    var I4 = {name: "DocumentCopy"};
    var G2 = c(l());
    var G9 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, U9 = (0, G2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M128 320v576h576V320H128zm-32-64h640a32 32 0 0 1 32 32v640a32 32 0 0 1-32 32H96a32 32 0 0 1-32-32V288a32 32 0 0 1 32-32zM960 96v704a32 32 0 0 1-32 32h-96v-64h64V128H384v64h-64V96a32 32 0 0 1 32-32h576a32 32 0 0 1 32 32zM256 672h320v64H256v-64zm0-192h320v64H256v-64z"
    }, null, -1), W9 = [U9];

    function I9(o, t, r, a, n, s) {
        return (0, G2.openBlock)(), (0, G2.createElementBlock)("svg", G9, W9)
    }

    var Z4 = e(I4, [["render", I9], ["__file", "document-copy.vue"]]);
    var K4 = {name: "DocumentDelete"};
    var U2 = c(l());
    var Z9 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, K9 = (0, U2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M805.504 320 640 154.496V320h165.504zM832 384H576V128H192v768h640V384zM160 64h480l256 256v608a32 32 0 0 1-32 32H160a32 32 0 0 1-32-32V96a32 32 0 0 1 32-32zm308.992 546.304-90.496-90.624 45.248-45.248 90.56 90.496 90.496-90.432 45.248 45.248-90.496 90.56 90.496 90.496-45.248 45.248-90.496-90.496-90.56 90.496-45.248-45.248 90.496-90.496z"
    }, null, -1), Q9 = [K9];

    function j9(o, t, r, a, n, s) {
        return (0, U2.openBlock)(), (0, U2.createElementBlock)("svg", Z9, Q9)
    }

    var Q4 = e(K4, [["render", j9], ["__file", "document-delete.vue"]]);
    var j4 = {name: "DocumentRemove"};
    var W2 = c(l());
    var J9 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, X9 = (0, W2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M805.504 320 640 154.496V320h165.504zM832 384H576V128H192v768h640V384zM160 64h480l256 256v608a32 32 0 0 1-32 32H160a32 32 0 0 1-32-32V96a32 32 0 0 1 32-32zm192 512h320v64H352v-64z"
    }, null, -1), Y9 = [X9];

    function ed(o, t, r, a, n, s) {
        return (0, W2.openBlock)(), (0, W2.createElementBlock)("svg", J9, Y9)
    }

    var J4 = e(j4, [["render", ed], ["__file", "document-remove.vue"]]);
    var X4 = {name: "Document"};
    var I2 = c(l());
    var od = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, td = (0, I2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M832 384H576V128H192v768h640V384zm-26.496-64L640 154.496V320h165.504zM160 64h480l256 256v608a32 32 0 0 1-32 32H160a32 32 0 0 1-32-32V96a32 32 0 0 1 32-32zm160 448h384v64H320v-64zm0-192h160v64H320v-64zm0 384h384v64H320v-64z"
    }, null, -1), rd = [td];

    function nd(o, t, r, a, n, s) {
        return (0, I2.openBlock)(), (0, I2.createElementBlock)("svg", od, rd)
    }

    var Y4 = e(X4, [["render", nd], ["__file", "document.vue"]]);
    var en = {name: "Download"};
    var Z2 = c(l());
    var ad = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, ld = (0, Z2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M160 832h704a32 32 0 1 1 0 64H160a32 32 0 1 1 0-64zm384-253.696 236.288-236.352 45.248 45.248L508.8 704 192 387.2l45.248-45.248L480 584.704V128h64v450.304z"
    }, null, -1), cd = [ld];

    function sd(o, t, r, a, n, s) {
        return (0, Z2.openBlock)(), (0, Z2.createElementBlock)("svg", ad, cd)
    }

    var on = e(en, [["render", sd], ["__file", "download.vue"]]);
    var tn = {name: "Drizzling"};
    var K2 = c(l());
    var md = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, pd = (0, K2.createElementVNode)("path", {
        fill: "currentColor",
        d: "m739.328 291.328-35.2-6.592-12.8-33.408a192.064 192.064 0 0 0-365.952 23.232l-9.92 40.896-41.472 7.04a176.32 176.32 0 0 0-146.24 173.568c0 97.28 78.72 175.936 175.808 175.936h400a192 192 0 0 0 35.776-380.672zM959.552 480a256 256 0 0 1-256 256h-400A239.808 239.808 0 0 1 63.744 496.192a240.32 240.32 0 0 1 199.488-236.8 256.128 256.128 0 0 1 487.872-30.976A256.064 256.064 0 0 1 959.552 480zM288 800h64v64h-64v-64zm192 0h64v64h-64v-64zm-96 96h64v64h-64v-64zm192 0h64v64h-64v-64zm96-96h64v64h-64v-64z"
    }, null, -1), _d = [pd];

    function fd(o, t, r, a, n, s) {
        return (0, K2.openBlock)(), (0, K2.createElementBlock)("svg", md, _d)
    }

    var rn = e(tn, [["render", fd], ["__file", "drizzling.vue"]]);
    var nn = {name: "EditPen"};
    var Q2 = c(l());
    var id = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, dd = (0, Q2.createElementVNode)("path", {
        fill: "currentColor",
        d: "m199.04 672.64 193.984 112 224-387.968-193.92-112-224 388.032zm-23.872 60.16 32.896 148.288 144.896-45.696L175.168 732.8zM455.04 229.248l193.92 112 56.704-98.112-193.984-112-56.64 98.112zM104.32 708.8l384-665.024 304.768 175.936L409.152 884.8h.064l-248.448 78.336L104.32 708.8zm384 254.272v-64h448v64h-448z"
    }, null, -1), ud = [dd];

    function hd(o, t, r, a, n, s) {
        return (0, Q2.openBlock)(), (0, Q2.createElementBlock)("svg", id, ud)
    }

    var an = e(nn, [["render", hd], ["__file", "edit-pen.vue"]]);
    var ln = {name: "Edit"};
    var ee = c(l());
    var xd = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, vd = (0, ee.createElementVNode)("path", {
        fill: "currentColor",
        d: "M832 512a32 32 0 1 1 64 0v352a32 32 0 0 1-32 32H160a32 32 0 0 1-32-32V160a32 32 0 0 1 32-32h352a32 32 0 0 1 0 64H192v640h640V512z"
    }, null, -1), wd = (0, ee.createElementVNode)("path", {
        fill: "currentColor",
        d: "m469.952 554.24 52.8-7.552L847.104 222.4a32 32 0 1 0-45.248-45.248L477.44 501.44l-7.552 52.8zm422.4-422.4a96 96 0 0 1 0 135.808l-331.84 331.84a32 32 0 0 1-18.112 9.088L436.8 623.68a32 32 0 0 1-36.224-36.224l15.104-105.6a32 32 0 0 1 9.024-18.112l331.904-331.84a96 96 0 0 1 135.744 0z"
    }, null, -1), Bd = [vd, wd];

    function kd(o, t, r, a, n, s) {
        return (0, ee.openBlock)(), (0, ee.createElementBlock)("svg", xd, Bd)
    }

    var cn = e(ln, [["render", kd], ["__file", "edit.vue"]]);
    var sn = {name: "ElemeFilled"};
    var j2 = c(l());
    var Cd = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Ed = (0, j2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M176 64h672c61.824 0 112 50.176 112 112v672a112 112 0 0 1-112 112H176A112 112 0 0 1 64 848V176c0-61.824 50.176-112 112-112zm150.528 173.568c-152.896 99.968-196.544 304.064-97.408 456.96a330.688 330.688 0 0 0 456.96 96.64c9.216-5.888 17.6-11.776 25.152-18.56a18.24 18.24 0 0 0 4.224-24.32L700.352 724.8a47.552 47.552 0 0 0-65.536-14.272A234.56 234.56 0 0 1 310.592 641.6C240 533.248 271.104 387.968 379.456 316.48a234.304 234.304 0 0 1 276.352 15.168c1.664.832 2.56 2.56 3.392 4.224 5.888 8.384 3.328 19.328-5.12 25.216L456.832 489.6a47.552 47.552 0 0 0-14.336 65.472l16 24.384c5.888 8.384 16.768 10.88 25.216 5.056l308.224-199.936a19.584 19.584 0 0 0 6.72-23.488v-.896c-4.992-9.216-10.048-17.6-15.104-26.88-99.968-151.168-304.064-194.88-456.96-95.744zM786.88 504.704l-62.208 40.32c-8.32 5.888-10.88 16.768-4.992 25.216L760 632.32c5.888 8.448 16.768 11.008 25.152 5.12l31.104-20.16a55.36 55.36 0 0 0 16-76.48l-20.224-31.04a19.52 19.52 0 0 0-25.152-5.12z"
    }, null, -1), $d = [Ed];

    function Vd(o, t, r, a, n, s) {
        return (0, j2.openBlock)(), (0, j2.createElementBlock)("svg", Cd, $d)
    }

    var mn = e(sn, [["render", Vd], ["__file", "eleme-filled.vue"]]);
    var pn = {name: "Eleme"};
    var J2 = c(l());
    var zd = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, gd = (0, J2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M300.032 188.8c174.72-113.28 408-63.36 522.24 109.44 5.76 10.56 11.52 20.16 17.28 30.72v.96a22.4 22.4 0 0 1-7.68 26.88l-352.32 228.48c-9.6 6.72-22.08 3.84-28.8-5.76l-18.24-27.84a54.336 54.336 0 0 1 16.32-74.88l225.6-146.88c9.6-6.72 12.48-19.2 5.76-28.8-.96-1.92-1.92-3.84-3.84-4.8a267.84 267.84 0 0 0-315.84-17.28c-123.84 81.6-159.36 247.68-78.72 371.52a268.096 268.096 0 0 0 370.56 78.72 54.336 54.336 0 0 1 74.88 16.32l17.28 26.88c5.76 9.6 3.84 21.12-4.8 27.84-8.64 7.68-18.24 14.4-28.8 21.12a377.92 377.92 0 0 1-522.24-110.4c-113.28-174.72-63.36-408 111.36-522.24zm526.08 305.28a22.336 22.336 0 0 1 28.8 5.76l23.04 35.52a63.232 63.232 0 0 1-18.24 87.36l-35.52 23.04c-9.6 6.72-22.08 3.84-28.8-5.76l-46.08-71.04c-6.72-9.6-3.84-22.08 5.76-28.8l71.04-46.08z"
    }, null, -1), Hd = [gd];

    function Dd(o, t, r, a, n, s) {
        return (0, J2.openBlock)(), (0, J2.createElementBlock)("svg", zd, Hd)
    }

    var _n = e(pn, [["render", Dd], ["__file", "eleme.vue"]]);
    var fn = {name: "ElementPlus"};
    var X2 = c(l());
    var Md = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Nd = (0, X2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M839.7 734.7c0 33.3-17.9 41-17.9 41S519.7 949.8 499.2 960c-10.2 5.1-20.5 5.1-30.7 0 0 0-314.9-184.3-325.1-192-5.1-5.1-10.2-12.8-12.8-20.5V368.6c0-17.9 20.5-28.2 20.5-28.2L466 158.6c12.8-5.1 25.6-5.1 38.4 0 0 0 279 161.3 309.8 179.2 17.9 7.7 28.2 25.6 25.6 46.1-.1-5-.1 317.5-.1 350.8zM714.2 371.2c-64-35.8-217.6-125.4-217.6-125.4-7.7-5.1-20.5-5.1-30.7 0L217.6 389.1s-17.9 10.2-17.9 23v297c0 5.1 5.1 12.8 7.7 17.9 7.7 5.1 256 148.5 256 148.5 7.7 5.1 17.9 5.1 25.6 0 15.4-7.7 250.9-145.9 250.9-145.9s12.8-5.1 12.8-30.7v-74.2l-276.5 169v-64c0-17.9 7.7-30.7 20.5-46.1L745 535c5.1-7.7 10.2-20.5 10.2-30.7v-66.6l-279 169v-69.1c0-15.4 5.1-30.7 17.9-38.4l220.1-128zM919 135.7c0-5.1-5.1-7.7-7.7-7.7h-58.9V66.6c0-5.1-5.1-5.1-10.2-5.1l-30.7 5.1c-5.1 0-5.1 2.6-5.1 5.1V128h-56.3c-5.1 0-5.1 5.1-7.7 5.1v38.4h69.1v64c0 5.1 5.1 5.1 10.2 5.1l30.7-5.1c5.1 0 5.1-2.6 5.1-5.1v-56.3h64l-2.5-38.4z"
    }, null, -1), yd = [Nd];

    function Ld(o, t, r, a, n, s) {
        return (0, X2.openBlock)(), (0, X2.createElementBlock)("svg", Md, yd)
    }

    var dn = e(fn, [["render", Ld], ["__file", "element-plus.vue"]]);
    var un = {name: "Expand"};
    var Y2 = c(l());
    var Ad = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Sd = (0, Y2.createElementVNode)("path", {
        fill: "currentColor",
        d: "M128 192h768v128H128V192zm0 256h512v128H128V448zm0 256h768v128H128V704zm576-352 192 160-192 128V352z"
    }, null, -1), qd = [Sd];

    function Fd(o, t, r, a, n, s) {
        return (0, Y2.openBlock)(), (0, Y2.createElementBlock)("svg", Ad, qd)
    }

    var hn = e(un, [["render", Fd], ["__file", "expand.vue"]]);
    var xn = {name: "Failed"};
    var eo = c(l());
    var bd = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Pd = (0, eo.createElementVNode)("path", {
        fill: "currentColor",
        d: "m557.248 608 135.744-135.744-45.248-45.248-135.68 135.744-135.808-135.68-45.248 45.184L466.752 608l-135.68 135.68 45.184 45.312L512 653.248l135.744 135.744 45.248-45.248L557.312 608zM704 192h160v736H160V192h160v64h384v-64zm-320 0V96h256v96H384z"
    }, null, -1), Rd = [Pd];

    function Td(o, t, r, a, n, s) {
        return (0, eo.openBlock)(), (0, eo.createElementBlock)("svg", bd, Rd)
    }

    var vn = e(xn, [["render", Td], ["__file", "failed.vue"]]);
    var wn = {name: "Female"};
    var B = c(l());
    var Od = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Gd = (0, B.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 640a256 256 0 1 0 0-512 256 256 0 0 0 0 512zm0 64a320 320 0 1 1 0-640 320 320 0 0 1 0 640z"
    }, null, -1), Ud = (0, B.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 640q32 0 32 32v256q0 32-32 32t-32-32V672q0-32 32-32z"
    }, null, -1), Wd = (0, B.createElementVNode)("path", {
        fill: "currentColor",
        d: "M352 800h320q32 0 32 32t-32 32H352q-32 0-32-32t32-32z"
    }, null, -1), Id = [Gd, Ud, Wd];

    function Zd(o, t, r, a, n, s) {
        return (0, B.openBlock)(), (0, B.createElementBlock)("svg", Od, Id)
    }

    var Bn = e(wn, [["render", Zd], ["__file", "female.vue"]]);
    var kn = {name: "Files"};
    var oo = c(l());
    var Kd = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Qd = (0, oo.createElementVNode)("path", {
        fill: "currentColor",
        d: "M128 384v448h768V384H128zm-32-64h832a32 32 0 0 1 32 32v512a32 32 0 0 1-32 32H96a32 32 0 0 1-32-32V352a32 32 0 0 1 32-32zm64-128h704v64H160zm96-128h512v64H256z"
    }, null, -1), jd = [Qd];

    function Jd(o, t, r, a, n, s) {
        return (0, oo.openBlock)(), (0, oo.createElementBlock)("svg", Kd, jd)
    }

    var Cn = e(kn, [["render", Jd], ["__file", "files.vue"]]);
    var En = {name: "Film"};
    var oe = c(l());
    var Xd = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Yd = (0, oe.createElementVNode)("path", {
        fill: "currentColor",
        d: "M160 160v704h704V160H160zm-32-64h768a32 32 0 0 1 32 32v768a32 32 0 0 1-32 32H128a32 32 0 0 1-32-32V128a32 32 0 0 1 32-32z"
    }, null, -1), eu = (0, oe.createElementVNode)("path", {
        fill: "currentColor",
        d: "M320 288V128h64v352h256V128h64v160h160v64H704v128h160v64H704v128h160v64H704v160h-64V544H384v352h-64V736H128v-64h192V544H128v-64h192V352H128v-64h192z"
    }, null, -1), ou = [Yd, eu];

    function tu(o, t, r, a, n, s) {
        return (0, oe.openBlock)(), (0, oe.createElementBlock)("svg", Xd, ou)
    }

    var $n = e(En, [["render", tu], ["__file", "film.vue"]]);
    var Vn = {name: "Filter"};
    var to = c(l());
    var ru = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, nu = (0, to.createElementVNode)("path", {
        fill: "currentColor",
        d: "M384 523.392V928a32 32 0 0 0 46.336 28.608l192-96A32 32 0 0 0 640 832V523.392l280.768-343.104a32 32 0 1 0-49.536-40.576l-288 352A32 32 0 0 0 576 512v300.224l-128 64V512a32 32 0 0 0-7.232-20.288L195.52 192H704a32 32 0 1 0 0-64H128a32 32 0 0 0-24.768 52.288L384 523.392z"
    }, null, -1), au = [nu];

    function lu(o, t, r, a, n, s) {
        return (0, to.openBlock)(), (0, to.createElementBlock)("svg", ru, au)
    }

    var zn = e(Vn, [["render", lu], ["__file", "filter.vue"]]);
    var gn = {name: "Finished"};
    var ro = c(l());
    var cu = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, su = (0, ro.createElementVNode)("path", {
        fill: "currentColor",
        d: "M280.768 753.728 691.456 167.04a32 32 0 1 1 52.416 36.672L314.24 817.472a32 32 0 0 1-45.44 7.296l-230.4-172.8a32 32 0 0 1 38.4-51.2l203.968 152.96zM736 448a32 32 0 1 1 0-64h192a32 32 0 1 1 0 64H736zM608 640a32 32 0 0 1 0-64h319.936a32 32 0 1 1 0 64H608zM480 832a32 32 0 1 1 0-64h447.936a32 32 0 1 1 0 64H480z"
    }, null, -1), mu = [su];

    function pu(o, t, r, a, n, s) {
        return (0, ro.openBlock)(), (0, ro.createElementBlock)("svg", cu, mu)
    }

    var Hn = e(gn, [["render", pu], ["__file", "finished.vue"]]);
    var Dn = {name: "FirstAidKit"};
    var te = c(l());
    var _u = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, fu = (0, te.createElementVNode)("path", {
        fill: "currentColor",
        d: "M192 256a64 64 0 0 0-64 64v448a64 64 0 0 0 64 64h640a64 64 0 0 0 64-64V320a64 64 0 0 0-64-64H192zm0-64h640a128 128 0 0 1 128 128v448a128 128 0 0 1-128 128H192A128 128 0 0 1 64 768V320a128 128 0 0 1 128-128z"
    }, null, -1), iu = (0, te.createElementVNode)("path", {
        fill: "currentColor",
        d: "M544 512h96a32 32 0 0 1 0 64h-96v96a32 32 0 0 1-64 0v-96h-96a32 32 0 0 1 0-64h96v-96a32 32 0 0 1 64 0v96zM352 128v64h320v-64H352zm-32-64h384a32 32 0 0 1 32 32v128a32 32 0 0 1-32 32H320a32 32 0 0 1-32-32V96a32 32 0 0 1 32-32z"
    }, null, -1), du = [fu, iu];

    function uu(o, t, r, a, n, s) {
        return (0, te.openBlock)(), (0, te.createElementBlock)("svg", _u, du)
    }

    var Mn = e(Dn, [["render", uu], ["__file", "first-aid-kit.vue"]]);
    var Nn = {name: "Flag"};
    var no = c(l());
    var hu = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, xu = (0, no.createElementVNode)("path", {
        fill: "currentColor",
        d: "M288 128h608L736 384l160 256H288v320h-96V64h96v64z"
    }, null, -1), vu = [xu];

    function wu(o, t, r, a, n, s) {
        return (0, no.openBlock)(), (0, no.createElementBlock)("svg", hu, vu)
    }

    var yn = e(Nn, [["render", wu], ["__file", "flag.vue"]]);
    var Ln = {name: "Fold"};
    var ao = c(l());
    var Bu = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, ku = (0, ao.createElementVNode)("path", {
        fill: "currentColor",
        d: "M896 192H128v128h768V192zm0 256H384v128h512V448zm0 256H128v128h768V704zM320 384 128 512l192 128V384z"
    }, null, -1), Cu = [ku];

    function Eu(o, t, r, a, n, s) {
        return (0, ao.openBlock)(), (0, ao.createElementBlock)("svg", Bu, Cu)
    }

    var An = e(Ln, [["render", Eu], ["__file", "fold.vue"]]);
    var Sn = {name: "FolderAdd"};
    var lo = c(l());
    var $u = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Vu = (0, lo.createElementVNode)("path", {
        fill: "currentColor",
        d: "M128 192v640h768V320H485.76L357.504 192H128zm-32-64h287.872l128.384 128H928a32 32 0 0 1 32 32v576a32 32 0 0 1-32 32H96a32 32 0 0 1-32-32V160a32 32 0 0 1 32-32zm384 416V416h64v128h128v64H544v128h-64V608H352v-64h128z"
    }, null, -1), zu = [Vu];

    function gu(o, t, r, a, n, s) {
        return (0, lo.openBlock)(), (0, lo.createElementBlock)("svg", $u, zu)
    }

    var qn = e(Sn, [["render", gu], ["__file", "folder-add.vue"]]);
    var Fn = {name: "FolderChecked"};
    var co = c(l());
    var Hu = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Du = (0, co.createElementVNode)("path", {
        fill: "currentColor",
        d: "M128 192v640h768V320H485.76L357.504 192H128zm-32-64h287.872l128.384 128H928a32 32 0 0 1 32 32v576a32 32 0 0 1-32 32H96a32 32 0 0 1-32-32V160a32 32 0 0 1 32-32zm414.08 502.144 180.992-180.992L736.32 494.4 510.08 720.64l-158.4-158.336 45.248-45.312L510.08 630.144z"
    }, null, -1), Mu = [Du];

    function Nu(o, t, r, a, n, s) {
        return (0, co.openBlock)(), (0, co.createElementBlock)("svg", Hu, Mu)
    }

    var bn = e(Fn, [["render", Nu], ["__file", "folder-checked.vue"]]);
    var Pn = {name: "FolderDelete"};
    var so = c(l());
    var yu = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Lu = (0, so.createElementVNode)("path", {
        fill: "currentColor",
        d: "M128 192v640h768V320H485.76L357.504 192H128zm-32-64h287.872l128.384 128H928a32 32 0 0 1 32 32v576a32 32 0 0 1-32 32H96a32 32 0 0 1-32-32V160a32 32 0 0 1 32-32zm370.752 448-90.496-90.496 45.248-45.248L512 530.752l90.496-90.496 45.248 45.248L557.248 576l90.496 90.496-45.248 45.248L512 621.248l-90.496 90.496-45.248-45.248L466.752 576z"
    }, null, -1), Au = [Lu];

    function Su(o, t, r, a, n, s) {
        return (0, so.openBlock)(), (0, so.createElementBlock)("svg", yu, Au)
    }

    var Rn = e(Pn, [["render", Su], ["__file", "folder-delete.vue"]]);
    var Tn = {name: "FolderOpened"};
    var mo = c(l());
    var qu = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Fu = (0, mo.createElementVNode)("path", {
        fill: "currentColor",
        d: "M878.08 448H241.92l-96 384h636.16l96-384zM832 384v-64H485.76L357.504 192H128v448l57.92-231.744A32 32 0 0 1 216.96 384H832zm-24.96 512H96a32 32 0 0 1-32-32V160a32 32 0 0 1 32-32h287.872l128.384 128H864a32 32 0 0 1 32 32v96h23.04a32 32 0 0 1 31.04 39.744l-112 448A32 32 0 0 1 807.04 896z"
    }, null, -1), bu = [Fu];

    function Pu(o, t, r, a, n, s) {
        return (0, mo.openBlock)(), (0, mo.createElementBlock)("svg", qu, bu)
    }

    var On = e(Tn, [["render", Pu], ["__file", "folder-opened.vue"]]);
    var Gn = {name: "FolderRemove"};
    var po = c(l());
    var Ru = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Tu = (0, po.createElementVNode)("path", {
        fill: "currentColor",
        d: "M128 192v640h768V320H485.76L357.504 192H128zm-32-64h287.872l128.384 128H928a32 32 0 0 1 32 32v576a32 32 0 0 1-32 32H96a32 32 0 0 1-32-32V160a32 32 0 0 1 32-32zm256 416h320v64H352v-64z"
    }, null, -1), Ou = [Tu];

    function Gu(o, t, r, a, n, s) {
        return (0, po.openBlock)(), (0, po.createElementBlock)("svg", Ru, Ou)
    }

    var Un = e(Gn, [["render", Gu], ["__file", "folder-remove.vue"]]);
    var Wn = {name: "Folder"};
    var _o = c(l());
    var Uu = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Wu = (0, _o.createElementVNode)("path", {
        fill: "currentColor",
        d: "M128 192v640h768V320H485.76L357.504 192H128zm-32-64h287.872l128.384 128H928a32 32 0 0 1 32 32v576a32 32 0 0 1-32 32H96a32 32 0 0 1-32-32V160a32 32 0 0 1 32-32z"
    }, null, -1), Iu = [Wu];

    function Zu(o, t, r, a, n, s) {
        return (0, _o.openBlock)(), (0, _o.createElementBlock)("svg", Uu, Iu)
    }

    var In = e(Wn, [["render", Zu], ["__file", "folder.vue"]]);
    var Zn = {name: "Food"};
    var fo = c(l());
    var Ku = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Qu = (0, fo.createElementVNode)("path", {
        fill: "currentColor",
        d: "M128 352.576V352a288 288 0 0 1 491.072-204.224 192 192 0 0 1 274.24 204.48 64 64 0 0 1 57.216 74.24C921.6 600.512 850.048 710.656 736 756.992V800a96 96 0 0 1-96 96H384a96 96 0 0 1-96-96v-43.008c-114.048-46.336-185.6-156.48-214.528-330.496A64 64 0 0 1 128 352.64zm64-.576h64a160 160 0 0 1 320 0h64a224 224 0 0 0-448 0zm128 0h192a96 96 0 0 0-192 0zm439.424 0h68.544A128.256 128.256 0 0 0 704 192c-15.36 0-29.952 2.688-43.52 7.616 11.328 18.176 20.672 37.76 27.84 58.304A64.128 64.128 0 0 1 759.424 352zM672 768H352v32a32 32 0 0 0 32 32h256a32 32 0 0 0 32-32v-32zm-342.528-64h365.056c101.504-32.64 165.76-124.928 192.896-288H136.576c27.136 163.072 91.392 255.36 192.896 288z"
    }, null, -1), ju = [Qu];

    function Ju(o, t, r, a, n, s) {
        return (0, fo.openBlock)(), (0, fo.createElementBlock)("svg", Ku, ju)
    }

    var Kn = e(Zn, [["render", Ju], ["__file", "food.vue"]]);
    var Qn = {name: "Football"};
    var re = c(l());
    var Xu = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Yu = (0, re.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 960a448 448 0 1 1 0-896 448 448 0 0 1 0 896zm0-64a384 384 0 1 0 0-768 384 384 0 0 0 0 768z"
    }, null, -1), e7 = (0, re.createElementVNode)("path", {
        fill: "currentColor",
        d: "M186.816 268.288c16-16.384 31.616-31.744 46.976-46.08 17.472 30.656 39.808 58.112 65.984 81.28l-32.512 56.448a385.984 385.984 0 0 1-80.448-91.648zm653.696-5.312a385.92 385.92 0 0 1-83.776 96.96l-32.512-56.384a322.923 322.923 0 0 0 68.48-85.76c15.552 14.08 31.488 29.12 47.808 45.184zM465.984 445.248l11.136-63.104a323.584 323.584 0 0 0 69.76 0l11.136 63.104a387.968 387.968 0 0 1-92.032 0zm-62.72-12.8A381.824 381.824 0 0 1 320 396.544l32-55.424a319.885 319.885 0 0 0 62.464 27.712l-11.2 63.488zm300.8-35.84a381.824 381.824 0 0 1-83.328 35.84l-11.2-63.552A319.885 319.885 0 0 0 672 341.184l32 55.424zm-520.768 364.8a385.92 385.92 0 0 1 83.968-97.28l32.512 56.32c-26.88 23.936-49.856 52.352-67.52 84.032-16-13.44-32.32-27.712-48.96-43.072zm657.536.128a1442.759 1442.759 0 0 1-49.024 43.072 321.408 321.408 0 0 0-67.584-84.16l32.512-56.32c33.216 27.456 61.696 60.352 84.096 97.408zM465.92 578.752a387.968 387.968 0 0 1 92.032 0l-11.136 63.104a323.584 323.584 0 0 0-69.76 0l-11.136-63.104zm-62.72 12.8 11.2 63.552a319.885 319.885 0 0 0-62.464 27.712L320 627.392a381.824 381.824 0 0 1 83.264-35.84zm300.8 35.84-32 55.424a318.272 318.272 0 0 0-62.528-27.712l11.2-63.488c29.44 8.64 57.28 20.736 83.264 35.776z"
    }, null, -1), o7 = [Yu, e7];

    function t7(o, t, r, a, n, s) {
        return (0, re.openBlock)(), (0, re.createElementBlock)("svg", Xu, o7)
    }

    var jn = e(Qn, [["render", t7], ["__file", "football.vue"]]);
    var Jn = {name: "ForkSpoon"};
    var io = c(l());
    var r7 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, n7 = (0, io.createElementVNode)("path", {
        fill: "currentColor",
        d: "M256 410.304V96a32 32 0 0 1 64 0v314.304a96 96 0 0 0 64-90.56V96a32 32 0 0 1 64 0v223.744a160 160 0 0 1-128 156.8V928a32 32 0 1 1-64 0V476.544a160 160 0 0 1-128-156.8V96a32 32 0 0 1 64 0v223.744a96 96 0 0 0 64 90.56zM672 572.48C581.184 552.128 512 446.848 512 320c0-141.44 85.952-256 192-256s192 114.56 192 256c0 126.848-69.184 232.128-160 252.48V928a32 32 0 1 1-64 0V572.48zM704 512c66.048 0 128-82.56 128-192s-61.952-192-128-192-128 82.56-128 192 61.952 192 128 192z"
    }, null, -1), a7 = [n7];

    function l7(o, t, r, a, n, s) {
        return (0, io.openBlock)(), (0, io.createElementBlock)("svg", r7, a7)
    }

    var Xn = e(Jn, [["render", l7], ["__file", "fork-spoon.vue"]]);
    var Yn = {name: "Fries"};
    var uo = c(l());
    var c7 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, s7 = (0, uo.createElementVNode)("path", {
        fill: "currentColor",
        d: "M608 224v-64a32 32 0 0 0-64 0v336h26.88A64 64 0 0 0 608 484.096V224zm101.12 160A64 64 0 0 0 672 395.904V384h64V224a32 32 0 1 0-64 0v160h37.12zm74.88 0a92.928 92.928 0 0 1 91.328 110.08l-60.672 323.584A96 96 0 0 1 720.32 896H303.68a96 96 0 0 1-94.336-78.336L148.672 494.08A92.928 92.928 0 0 1 240 384h-16V224a96 96 0 0 1 188.608-25.28A95.744 95.744 0 0 1 480 197.44V160a96 96 0 0 1 188.608-25.28A96 96 0 0 1 800 224v160h-16zM670.784 512a128 128 0 0 1-99.904 48H453.12a128 128 0 0 1-99.84-48H352v-1.536a128.128 128.128 0 0 1-9.984-14.976L314.88 448H240a28.928 28.928 0 0 0-28.48 34.304L241.088 640h541.824l29.568-157.696A28.928 28.928 0 0 0 784 448h-74.88l-27.136 47.488A132.405 132.405 0 0 1 672 510.464V512h-1.216zM480 288a32 32 0 0 0-64 0v196.096A64 64 0 0 0 453.12 496H480V288zm-128 96V224a32 32 0 0 0-64 0v160h64-37.12A64 64 0 0 1 352 395.904zm-98.88 320 19.072 101.888A32 32 0 0 0 303.68 832h416.64a32 32 0 0 0 31.488-26.112L770.88 704H253.12z"
    }, null, -1), m7 = [s7];

    function p7(o, t, r, a, n, s) {
        return (0, uo.openBlock)(), (0, uo.createElementBlock)("svg", c7, m7)
    }

    var e6 = e(Yn, [["render", p7], ["__file", "fries.vue"]]);
    var o6 = {name: "FullScreen"};
    var ho = c(l());
    var _7 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, f7 = (0, ho.createElementVNode)("path", {
        fill: "currentColor",
        d: "m160 96.064 192 .192a32 32 0 0 1 0 64l-192-.192V352a32 32 0 0 1-64 0V96h64v.064zm0 831.872V928H96V672a32 32 0 1 1 64 0v191.936l192-.192a32 32 0 1 1 0 64l-192 .192zM864 96.064V96h64v256a32 32 0 1 1-64 0V160.064l-192 .192a32 32 0 1 1 0-64l192-.192zm0 831.872-192-.192a32 32 0 0 1 0-64l192 .192V672a32 32 0 1 1 64 0v256h-64v-.064z"
    }, null, -1), i7 = [f7];

    function d7(o, t, r, a, n, s) {
        return (0, ho.openBlock)(), (0, ho.createElementBlock)("svg", _7, i7)
    }

    var t6 = e(o6, [["render", d7], ["__file", "full-screen.vue"]]);
    var r6 = {name: "GobletFull"};
    var xo = c(l());
    var u7 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, h7 = (0, xo.createElementVNode)("path", {
        fill: "currentColor",
        d: "M256 320h512c0-78.592-12.608-142.4-36.928-192h-434.24C269.504 192.384 256 256.256 256 320zm503.936 64H264.064a256.128 256.128 0 0 0 495.872 0zM544 638.4V896h96a32 32 0 1 1 0 64H384a32 32 0 1 1 0-64h96V638.4A320 320 0 0 1 192 320c0-85.632 21.312-170.944 64-256h512c42.688 64.32 64 149.632 64 256a320 320 0 0 1-288 318.4z"
    }, null, -1), x7 = [h7];

    function v7(o, t, r, a, n, s) {
        return (0, xo.openBlock)(), (0, xo.createElementBlock)("svg", u7, x7)
    }

    var n6 = e(r6, [["render", v7], ["__file", "goblet-full.vue"]]);
    var a6 = {name: "GobletSquareFull"};
    var vo = c(l());
    var w7 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, B7 = (0, vo.createElementVNode)("path", {
        fill: "currentColor",
        d: "M256 270.912c10.048 6.72 22.464 14.912 28.992 18.624a220.16 220.16 0 0 0 114.752 30.72c30.592 0 49.408-9.472 91.072-41.152l.64-.448c52.928-40.32 82.368-55.04 132.288-54.656 55.552.448 99.584 20.8 142.72 57.408l1.536 1.28V128H256v142.912zm.96 76.288C266.368 482.176 346.88 575.872 512 576c157.44.064 237.952-85.056 253.248-209.984a952.32 952.32 0 0 1-40.192-35.712c-32.704-27.776-63.36-41.92-101.888-42.24-31.552-.256-50.624 9.28-93.12 41.6l-.576.448c-52.096 39.616-81.024 54.208-129.792 54.208-54.784 0-100.48-13.376-142.784-37.056zM480 638.848C250.624 623.424 192 442.496 192 319.68V96a32 32 0 0 1 32-32h576a32 32 0 0 1 32 32v224c0 122.816-58.624 303.68-288 318.912V896h96a32 32 0 1 1 0 64H384a32 32 0 1 1 0-64h96V638.848z"
    }, null, -1), k7 = [B7];

    function C7(o, t, r, a, n, s) {
        return (0, vo.openBlock)(), (0, vo.createElementBlock)("svg", w7, k7)
    }

    var l6 = e(a6, [["render", C7], ["__file", "goblet-square-full.vue"]]);
    var c6 = {name: "GobletSquare"};
    var wo = c(l());
    var E7 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, $7 = (0, wo.createElementVNode)("path", {
        fill: "currentColor",
        d: "M544 638.912V896h96a32 32 0 1 1 0 64H384a32 32 0 1 1 0-64h96V638.848C250.624 623.424 192 442.496 192 319.68V96a32 32 0 0 1 32-32h576a32 32 0 0 1 32 32v224c0 122.816-58.624 303.68-288 318.912zM256 319.68c0 149.568 80 256.192 256 256.256C688.128 576 768 469.568 768 320V128H256v191.68z"
    }, null, -1), V7 = [$7];

    function z7(o, t, r, a, n, s) {
        return (0, wo.openBlock)(), (0, wo.createElementBlock)("svg", E7, V7)
    }

    var s6 = e(c6, [["render", z7], ["__file", "goblet-square.vue"]]);
    var m6 = {name: "Goblet"};
    var Bo = c(l());
    var g7 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, H7 = (0, Bo.createElementVNode)("path", {
        fill: "currentColor",
        d: "M544 638.4V896h96a32 32 0 1 1 0 64H384a32 32 0 1 1 0-64h96V638.4A320 320 0 0 1 192 320c0-85.632 21.312-170.944 64-256h512c42.688 64.32 64 149.632 64 256a320 320 0 0 1-288 318.4zM256 320a256 256 0 1 0 512 0c0-78.592-12.608-142.4-36.928-192h-434.24C269.504 192.384 256 256.256 256 320z"
    }, null, -1), D7 = [H7];

    function M7(o, t, r, a, n, s) {
        return (0, Bo.openBlock)(), (0, Bo.createElementBlock)("svg", g7, D7)
    }

    var p6 = e(m6, [["render", M7], ["__file", "goblet.vue"]]);
    var _6 = {name: "GoldMedal"};
    var ne = c(l());
    var N7 = {
        xmlns: "http://www.w3.org/2000/svg",
        "xml:space": "preserve",
        style: {"enable-background": "new 0 0 1024 1024"},
        viewBox: "0 0 1024 1024"
    }, y7 = (0, ne.createElementVNode)("path", {
        fill: "currentColor",
        d: "m772.13 452.84 53.86-351.81c1.32-10.01-1.17-18.68-7.49-26.02S804.35 64 795.01 64H228.99v-.01h-.06c-9.33 0-17.15 3.67-23.49 11.01s-8.83 16.01-7.49 26.02l53.87 351.89C213.54 505.73 193.59 568.09 192 640c2 90.67 33.17 166.17 93.5 226.5S421.33 957.99 512 960c90.67-2 166.17-33.17 226.5-93.5 60.33-60.34 91.49-135.83 93.5-226.5-1.59-71.94-21.56-134.32-59.87-187.16zM640.01 128h117.02l-39.01 254.02c-20.75-10.64-40.74-19.73-59.94-27.28-5.92-3-11.95-5.8-18.08-8.41V128h.01zM576 128v198.76c-13.18-2.58-26.74-4.43-40.67-5.55-8.07-.8-15.85-1.2-23.33-1.2-10.54 0-21.09.66-31.64 1.96a359.844 359.844 0 0 0-32.36 4.79V128h128zm-192 0h.04v218.3c-6.22 2.66-12.34 5.5-18.36 8.56-19.13 7.54-39.02 16.6-59.66 27.16L267.01 128H384zm308.99 692.99c-48 48-108.33 73-180.99 75.01-72.66-2.01-132.99-27.01-180.99-75.01S258.01 712.66 256 640c2.01-72.66 27.01-132.99 75.01-180.99 19.67-19.67 41.41-35.47 65.22-47.41 38.33-15.04 71.15-23.92 98.44-26.65 5.07-.41 10.2-.7 15.39-.88.63-.01 1.28-.03 1.91-.03.66 0 1.35.03 2.02.04 5.11.17 10.15.46 15.13.86 27.4 2.71 60.37 11.65 98.91 26.79 23.71 11.93 45.36 27.69 64.96 47.29 48 48 73 108.33 75.01 180.99-2.01 72.65-27.01 132.98-75.01 180.98z"
    }, null, -1), L7 = (0, ne.createElementVNode)("path", {
        fill: "currentColor",
        d: "M544 480H416v64h64v192h-64v64h192v-64h-64z"
    }, null, -1), A7 = [y7, L7];

    function S7(o, t, r, a, n, s) {
        return (0, ne.openBlock)(), (0, ne.createElementBlock)("svg", N7, A7)
    }

    var f6 = e(_6, [["render", S7], ["__file", "gold-medal.vue"]]);
    var i6 = {name: "GoodsFilled"};
    var ko = c(l());
    var q7 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, F7 = (0, ko.createElementVNode)("path", {
        fill: "currentColor",
        d: "M192 352h640l64 544H128l64-544zm128 224h64V448h-64v128zm320 0h64V448h-64v128zM384 288h-64a192 192 0 1 1 384 0h-64a128 128 0 1 0-256 0z"
    }, null, -1), b7 = [F7];

    function P7(o, t, r, a, n, s) {
        return (0, ko.openBlock)(), (0, ko.createElementBlock)("svg", q7, b7)
    }

    var d6 = e(i6, [["render", P7], ["__file", "goods-filled.vue"]]);
    var u6 = {name: "Goods"};
    var Co = c(l());
    var R7 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, T7 = (0, Co.createElementVNode)("path", {
        fill: "currentColor",
        d: "M320 288v-22.336C320 154.688 405.504 64 512 64s192 90.688 192 201.664v22.4h131.072a32 32 0 0 1 31.808 28.8l57.6 576a32 32 0 0 1-31.808 35.2H131.328a32 32 0 0 1-31.808-35.2l57.6-576a32 32 0 0 1 31.808-28.8H320zm64 0h256v-22.336C640 189.248 582.272 128 512 128c-70.272 0-128 61.248-128 137.664v22.4zm-64 64H217.92l-51.2 512h690.56l-51.264-512H704v96a32 32 0 1 1-64 0v-96H384v96a32 32 0 0 1-64 0v-96z"
    }, null, -1), O7 = [T7];

    function G7(o, t, r, a, n, s) {
        return (0, Co.openBlock)(), (0, Co.createElementBlock)("svg", R7, O7)
    }

    var h6 = e(u6, [["render", G7], ["__file", "goods.vue"]]);
    var x6 = {name: "Grape"};
    var Eo = c(l());
    var U7 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, W7 = (0, Eo.createElementVNode)("path", {
        fill: "currentColor",
        d: "M544 195.2a160 160 0 0 1 96 60.8 160 160 0 1 1 146.24 254.976 160 160 0 0 1-128 224 160 160 0 1 1-292.48 0 160 160 0 0 1-128-224A160 160 0 1 1 384 256a160 160 0 0 1 96-60.8V128h-64a32 32 0 0 1 0-64h192a32 32 0 0 1 0 64h-64v67.2zM512 448a96 96 0 1 0 0-192 96 96 0 0 0 0 192zm-256 0a96 96 0 1 0 0-192 96 96 0 0 0 0 192zm128 224a96 96 0 1 0 0-192 96 96 0 0 0 0 192zm128 224a96 96 0 1 0 0-192 96 96 0 0 0 0 192zm128-224a96 96 0 1 0 0-192 96 96 0 0 0 0 192zm128-224a96 96 0 1 0 0-192 96 96 0 0 0 0 192z"
    }, null, -1), I7 = [W7];

    function Z7(o, t, r, a, n, s) {
        return (0, Eo.openBlock)(), (0, Eo.createElementBlock)("svg", U7, I7)
    }

    var v6 = e(x6, [["render", Z7], ["__file", "grape.vue"]]);
    var w6 = {name: "Grid"};
    var $o = c(l());
    var K7 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Q7 = (0, $o.createElementVNode)("path", {
        fill: "currentColor",
        d: "M640 384v256H384V384h256zm64 0h192v256H704V384zm-64 512H384V704h256v192zm64 0V704h192v192H704zm-64-768v192H384V128h256zm64 0h192v192H704V128zM320 384v256H128V384h192zm0 512H128V704h192v192zm0-768v192H128V128h192z"
    }, null, -1), j7 = [Q7];

    function J7(o, t, r, a, n, s) {
        return (0, $o.openBlock)(), (0, $o.createElementBlock)("svg", K7, j7)
    }

    var B6 = e(w6, [["render", J7], ["__file", "grid.vue"]]);
    var k6 = {name: "Guide"};
    var ae = c(l());
    var X7 = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Y7 = (0, ae.createElementVNode)("path", {
        fill: "currentColor",
        d: "M640 608h-64V416h64v192zm0 160v160a32 32 0 0 1-32 32H416a32 32 0 0 1-32-32V768h64v128h128V768h64zM384 608V416h64v192h-64zm256-352h-64V128H448v128h-64V96a32 32 0 0 1 32-32h192a32 32 0 0 1 32 32v160z"
    }, null, -1), eh = (0, ae.createElementVNode)("path", {
        fill: "currentColor",
        d: "m220.8 256-71.232 80 71.168 80H768V256H220.8zm-14.4-64H800a32 32 0 0 1 32 32v224a32 32 0 0 1-32 32H206.4a32 32 0 0 1-23.936-10.752l-99.584-112a32 32 0 0 1 0-42.496l99.584-112A32 32 0 0 1 206.4 192zm678.784 496-71.104 80H266.816V608h547.2l71.168 80zm-56.768-144H234.88a32 32 0 0 0-32 32v224a32 32 0 0 0 32 32h593.6a32 32 0 0 0 23.936-10.752l99.584-112a32 32 0 0 0 0-42.496l-99.584-112A32 32 0 0 0 828.48 544z"
    }, null, -1), oh = [Y7, eh];

    function th(o, t, r, a, n, s) {
        return (0, ae.openBlock)(), (0, ae.createElementBlock)("svg", X7, oh)
    }

    var C6 = e(k6, [["render", th], ["__file", "guide.vue"]]);
    var E6 = {name: "Handbag"};
    var Vo = c(l());
    var rh = {
        xmlns: "http://www.w3.org/2000/svg",
        "xml:space": "preserve",
        style: {"enable-background": "new 0 0 1024 1024"},
        viewBox: "0 0 1024 1024"
    }, nh = (0, Vo.createElementVNode)("path", {
        fill: "currentColor",
        d: "M887.01 264.99c-6-5.99-13.67-8.99-23.01-8.99H704c-1.34-54.68-20.01-100.01-56-136s-81.32-54.66-136-56c-54.68 1.34-100.01 20.01-136 56s-54.66 81.32-56 136H160c-9.35 0-17.02 3-23.01 8.99-5.99 6-8.99 13.67-8.99 23.01v640c0 9.35 2.99 17.02 8.99 23.01S150.66 960 160 960h704c9.35 0 17.02-2.99 23.01-8.99S896 937.34 896 928V288c0-9.35-2.99-17.02-8.99-23.01zM421.5 165.5c24.32-24.34 54.49-36.84 90.5-37.5 35.99.68 66.16 13.18 90.5 37.5s36.84 54.49 37.5 90.5H384c.68-35.99 13.18-66.16 37.5-90.5zM832 896H192V320h128v128h64V320h256v128h64V320h128v576z"
    }, null, -1), ah = [nh];

    function lh(o, t, r, a, n, s) {
        return (0, Vo.openBlock)(), (0, Vo.createElementBlock)("svg", rh, ah)
    }

    var $6 = e(E6, [["render", lh], ["__file", "handbag.vue"]]);
    var V6 = {name: "Headset"};
    var zo = c(l());
    var ch = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, sh = (0, zo.createElementVNode)("path", {
        fill: "currentColor",
        d: "M896 529.152V512a384 384 0 1 0-768 0v17.152A128 128 0 0 1 320 640v128a128 128 0 1 1-256 0V512a448 448 0 1 1 896 0v256a128 128 0 1 1-256 0V640a128 128 0 0 1 192-110.848zM896 640a64 64 0 0 0-128 0v128a64 64 0 0 0 128 0V640zm-768 0v128a64 64 0 0 0 128 0V640a64 64 0 1 0-128 0z"
    }, null, -1), mh = [sh];

    function ph(o, t, r, a, n, s) {
        return (0, zo.openBlock)(), (0, zo.createElementBlock)("svg", ch, mh)
    }

    var z6 = e(V6, [["render", ph], ["__file", "headset.vue"]]);
    var g6 = {name: "HelpFilled"};
    var go = c(l());
    var _h = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, fh = (0, go.createElementVNode)("path", {
        fill: "currentColor",
        d: "M926.784 480H701.312A192.512 192.512 0 0 0 544 322.688V97.216A416.064 416.064 0 0 1 926.784 480zm0 64A416.064 416.064 0 0 1 544 926.784V701.312A192.512 192.512 0 0 0 701.312 544h225.472zM97.28 544h225.472A192.512 192.512 0 0 0 480 701.312v225.472A416.064 416.064 0 0 1 97.216 544zm0-64A416.064 416.064 0 0 1 480 97.216v225.472A192.512 192.512 0 0 0 322.688 480H97.216z"
    }, null, -1), ih = [fh];

    function dh(o, t, r, a, n, s) {
        return (0, go.openBlock)(), (0, go.createElementBlock)("svg", _h, ih)
    }

    var H6 = e(g6, [["render", dh], ["__file", "help-filled.vue"]]);
    var D6 = {name: "Help"};
    var Ho = c(l());
    var uh = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, hh = (0, Ho.createElementVNode)("path", {
        fill: "currentColor",
        d: "m759.936 805.248-90.944-91.008A254.912 254.912 0 0 1 512 768a254.912 254.912 0 0 1-156.992-53.76l-90.944 91.008A382.464 382.464 0 0 0 512 896c94.528 0 181.12-34.176 247.936-90.752zm45.312-45.312A382.464 382.464 0 0 0 896 512c0-94.528-34.176-181.12-90.752-247.936l-91.008 90.944C747.904 398.4 768 452.864 768 512c0 59.136-20.096 113.6-53.76 156.992l91.008 90.944zm-45.312-541.184A382.464 382.464 0 0 0 512 128c-94.528 0-181.12 34.176-247.936 90.752l90.944 91.008A254.912 254.912 0 0 1 512 256c59.136 0 113.6 20.096 156.992 53.76l90.944-91.008zm-541.184 45.312A382.464 382.464 0 0 0 128 512c0 94.528 34.176 181.12 90.752 247.936l91.008-90.944A254.912 254.912 0 0 1 256 512c0-59.136 20.096-113.6 53.76-156.992l-91.008-90.944zm417.28 394.496a194.56 194.56 0 0 0 22.528-22.528C686.912 602.56 704 559.232 704 512a191.232 191.232 0 0 0-67.968-146.56A191.296 191.296 0 0 0 512 320a191.232 191.232 0 0 0-146.56 67.968C337.088 421.44 320 464.768 320 512a191.232 191.232 0 0 0 67.968 146.56C421.44 686.912 464.768 704 512 704c47.296 0 90.56-17.088 124.032-45.44zM512 960a448 448 0 1 1 0-896 448 448 0 0 1 0 896z"
    }, null, -1), xh = [hh];

    function vh(o, t, r, a, n, s) {
        return (0, Ho.openBlock)(), (0, Ho.createElementBlock)("svg", uh, xh)
    }

    var M6 = e(D6, [["render", vh], ["__file", "help.vue"]]);
    var N6 = {name: "Hide"};
    var le = c(l());
    var wh = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Bh = (0, le.createElementVNode)("path", {
        fill: "currentColor",
        d: "M876.8 156.8c0-9.6-3.2-16-9.6-22.4-6.4-6.4-12.8-9.6-22.4-9.6-9.6 0-16 3.2-22.4 9.6L736 220.8c-64-32-137.6-51.2-224-60.8-160 16-288 73.6-377.6 176C44.8 438.4 0 496 0 512s48 73.6 134.4 176c22.4 25.6 44.8 48 73.6 67.2l-86.4 89.6c-6.4 6.4-9.6 12.8-9.6 22.4 0 9.6 3.2 16 9.6 22.4 6.4 6.4 12.8 9.6 22.4 9.6 9.6 0 16-3.2 22.4-9.6l704-710.4c3.2-6.4 6.4-12.8 6.4-22.4Zm-646.4 528c-76.8-70.4-128-128-153.6-172.8 28.8-48 80-105.6 153.6-172.8C304 272 400 230.4 512 224c64 3.2 124.8 19.2 176 44.8l-54.4 54.4C598.4 300.8 560 288 512 288c-64 0-115.2 22.4-160 64s-64 96-64 160c0 48 12.8 89.6 35.2 124.8L256 707.2c-9.6-6.4-19.2-16-25.6-22.4Zm140.8-96c-12.8-22.4-19.2-48-19.2-76.8 0-44.8 16-83.2 48-112 32-28.8 67.2-48 112-48 28.8 0 54.4 6.4 73.6 19.2L371.2 588.8ZM889.599 336c-12.8-16-28.8-28.8-41.6-41.6l-48 48c73.6 67.2 124.8 124.8 150.4 169.6-28.8 48-80 105.6-153.6 172.8-73.6 67.2-172.8 108.8-284.8 115.2-51.2-3.2-99.2-12.8-140.8-28.8l-48 48c57.6 22.4 118.4 38.4 188.8 44.8 160-16 288-73.6 377.6-176C979.199 585.6 1024 528 1024 512s-48.001-73.6-134.401-176Z"
    }, null, -1), kh = (0, le.createElementVNode)("path", {
        fill: "currentColor",
        d: "M511.998 672c-12.8 0-25.6-3.2-38.4-6.4l-51.2 51.2c28.8 12.8 57.6 19.2 89.6 19.2 64 0 115.2-22.4 160-64 41.6-41.6 64-96 64-160 0-32-6.4-64-19.2-89.6l-51.2 51.2c3.2 12.8 6.4 25.6 6.4 38.4 0 44.8-16 83.2-48 112-32 28.8-67.2 48-112 48Z"
    }, null, -1), Ch = [Bh, kh];

    function Eh(o, t, r, a, n, s) {
        return (0, le.openBlock)(), (0, le.createElementBlock)("svg", wh, Ch)
    }

    var y6 = e(N6, [["render", Eh], ["__file", "hide.vue"]]);
    var L6 = {name: "Histogram"};
    var Do = c(l());
    var $h = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Vh = (0, Do.createElementVNode)("path", {
        fill: "currentColor",
        d: "M416 896V128h192v768H416zm-288 0V448h192v448H128zm576 0V320h192v576H704z"
    }, null, -1), zh = [Vh];

    function gh(o, t, r, a, n, s) {
        return (0, Do.openBlock)(), (0, Do.createElementBlock)("svg", $h, zh)
    }

    var A6 = e(L6, [["render", gh], ["__file", "histogram.vue"]]);
    var S6 = {name: "HomeFilled"};
    var Mo = c(l());
    var Hh = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Dh = (0, Mo.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 128 128 447.936V896h255.936V640H640v256h255.936V447.936z"
    }, null, -1), Mh = [Dh];

    function Nh(o, t, r, a, n, s) {
        return (0, Mo.openBlock)(), (0, Mo.createElementBlock)("svg", Hh, Mh)
    }

    var q6 = e(S6, [["render", Nh], ["__file", "home-filled.vue"]]);
    var F6 = {name: "HotWater"};
    var No = c(l());
    var yh = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Lh = (0, No.createElementVNode)("path", {
        fill: "currentColor",
        d: "M273.067 477.867h477.866V409.6H273.067v68.267zm0 68.266v51.2A187.733 187.733 0 0 0 460.8 785.067h102.4a187.733 187.733 0 0 0 187.733-187.734v-51.2H273.067zm-34.134-204.8h546.134a34.133 34.133 0 0 1 34.133 34.134v221.866a256 256 0 0 1-256 256H460.8a256 256 0 0 1-256-256V375.467a34.133 34.133 0 0 1 34.133-34.134zM512 34.133a34.133 34.133 0 0 1 34.133 34.134v170.666a34.133 34.133 0 0 1-68.266 0V68.267A34.133 34.133 0 0 1 512 34.133zM375.467 102.4a34.133 34.133 0 0 1 34.133 34.133v102.4a34.133 34.133 0 0 1-68.267 0v-102.4a34.133 34.133 0 0 1 34.134-34.133zm273.066 0a34.133 34.133 0 0 1 34.134 34.133v102.4a34.133 34.133 0 1 1-68.267 0v-102.4a34.133 34.133 0 0 1 34.133-34.133zM170.667 921.668h682.666a34.133 34.133 0 1 1 0 68.267H170.667a34.133 34.133 0 1 1 0-68.267z"
    }, null, -1), Ah = [Lh];

    function Sh(o, t, r, a, n, s) {
        return (0, No.openBlock)(), (0, No.createElementBlock)("svg", yh, Ah)
    }

    var b6 = e(F6, [["render", Sh], ["__file", "hot-water.vue"]]);
    var P6 = {name: "House"};
    var yo = c(l());
    var qh = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Fh = (0, yo.createElementVNode)("path", {
        fill: "currentColor",
        d: "M192 413.952V896h640V413.952L512 147.328 192 413.952zM139.52 374.4l352-293.312a32 32 0 0 1 40.96 0l352 293.312A32 32 0 0 1 896 398.976V928a32 32 0 0 1-32 32H160a32 32 0 0 1-32-32V398.976a32 32 0 0 1 11.52-24.576z"
    }, null, -1), bh = [Fh];

    function Ph(o, t, r, a, n, s) {
        return (0, yo.openBlock)(), (0, yo.createElementBlock)("svg", qh, bh)
    }

    var R6 = e(P6, [["render", Ph], ["__file", "house.vue"]]);
    var T6 = {name: "IceCreamRound"};
    var Lo = c(l());
    var Rh = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Th = (0, Lo.createElementVNode)("path", {
        fill: "currentColor",
        d: "m308.352 489.344 226.304 226.304a32 32 0 0 0 45.248 0L783.552 512A192 192 0 1 0 512 240.448L308.352 444.16a32 32 0 0 0 0 45.248zm135.744 226.304L308.352 851.392a96 96 0 0 1-135.744-135.744l135.744-135.744-45.248-45.248a96 96 0 0 1 0-135.808L466.752 195.2A256 256 0 0 1 828.8 557.248L625.152 760.96a96 96 0 0 1-135.808 0l-45.248-45.248zM398.848 670.4 353.6 625.152 217.856 760.896a32 32 0 0 0 45.248 45.248L398.848 670.4zm248.96-384.64a32 32 0 0 1 0 45.248L466.624 512a32 32 0 1 1-45.184-45.248l180.992-181.056a32 32 0 0 1 45.248 0zm90.496 90.496a32 32 0 0 1 0 45.248L557.248 602.496A32 32 0 1 1 512 557.248l180.992-180.992a32 32 0 0 1 45.312 0z"
    }, null, -1), Oh = [Th];

    function Gh(o, t, r, a, n, s) {
        return (0, Lo.openBlock)(), (0, Lo.createElementBlock)("svg", Rh, Oh)
    }

    var O6 = e(T6, [["render", Gh], ["__file", "ice-cream-round.vue"]]);
    var G6 = {name: "IceCreamSquare"};
    var Ao = c(l());
    var Uh = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Wh = (0, Ao.createElementVNode)("path", {
        fill: "currentColor",
        d: "M416 640h256a32 32 0 0 0 32-32V160a32 32 0 0 0-32-32H352a32 32 0 0 0-32 32v448a32 32 0 0 0 32 32h64zm192 64v160a96 96 0 0 1-192 0V704h-64a96 96 0 0 1-96-96V160a96 96 0 0 1 96-96h320a96 96 0 0 1 96 96v448a96 96 0 0 1-96 96h-64zm-64 0h-64v160a32 32 0 1 0 64 0V704z"
    }, null, -1), Ih = [Wh];

    function Zh(o, t, r, a, n, s) {
        return (0, Ao.openBlock)(), (0, Ao.createElementBlock)("svg", Uh, Ih)
    }

    var U6 = e(G6, [["render", Zh], ["__file", "ice-cream-square.vue"]]);
    var W6 = {name: "IceCream"};
    var So = c(l());
    var Kh = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Qh = (0, So.createElementVNode)("path", {
        fill: "currentColor",
        d: "M128.64 448a208 208 0 0 1 193.536-191.552 224 224 0 0 1 445.248 15.488A208.128 208.128 0 0 1 894.784 448H896L548.8 983.68a32 32 0 0 1-53.248.704L128 448h.64zm64.256 0h286.208a144 144 0 0 0-286.208 0zm351.36 0h286.272a144 144 0 0 0-286.272 0zm-294.848 64 271.808 396.608L778.24 512H249.408zM511.68 352.64a207.872 207.872 0 0 1 189.184-96.192 160 160 0 0 0-314.752 5.632c52.608 12.992 97.28 46.08 125.568 90.56z"
    }, null, -1), jh = [Qh];

    function Jh(o, t, r, a, n, s) {
        return (0, So.openBlock)(), (0, So.createElementBlock)("svg", Kh, jh)
    }

    var I6 = e(W6, [["render", Jh], ["__file", "ice-cream.vue"]]);
    var Z6 = {name: "IceDrink"};
    var qo = c(l());
    var Xh = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Yh = (0, qo.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 448v128h239.68l16.064-128H512zm-64 0H256.256l16.064 128H448V448zm64-255.36V384h247.744A256.128 256.128 0 0 0 512 192.64zm-64 8.064A256.448 256.448 0 0 0 264.256 384H448V200.704zm64-72.064A320.128 320.128 0 0 1 825.472 384H896a32 32 0 1 1 0 64h-64v1.92l-56.96 454.016A64 64 0 0 1 711.552 960H312.448a64 64 0 0 1-63.488-56.064L192 449.92V448h-64a32 32 0 0 1 0-64h70.528A320.384 320.384 0 0 1 448 135.04V96a96 96 0 0 1 96-96h128a32 32 0 1 1 0 64H544a32 32 0 0 0-32 32v32.64zM743.68 640H280.32l32.128 256h399.104l32.128-256z"
    }, null, -1), ex = [Yh];

    function ox(o, t, r, a, n, s) {
        return (0, qo.openBlock)(), (0, qo.createElementBlock)("svg", Xh, ex)
    }

    var K6 = e(Z6, [["render", ox], ["__file", "ice-drink.vue"]]);
    var Q6 = {name: "IceTea"};
    var Fo = c(l());
    var tx = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, rx = (0, Fo.createElementVNode)("path", {
        fill: "currentColor",
        d: "M197.696 259.648a320.128 320.128 0 0 1 628.608 0A96 96 0 0 1 896 352v64a96 96 0 0 1-71.616 92.864l-49.408 395.072A64 64 0 0 1 711.488 960H312.512a64 64 0 0 1-63.488-56.064l-49.408-395.072A96 96 0 0 1 128 416v-64a96 96 0 0 1 69.696-92.352zM264.064 256h495.872a256.128 256.128 0 0 0-495.872 0zm495.424 256H264.512l48 384h398.976l48-384zM224 448h576a32 32 0 0 0 32-32v-64a32 32 0 0 0-32-32H224a32 32 0 0 0-32 32v64a32 32 0 0 0 32 32zm160 192h64v64h-64v-64zm192 64h64v64h-64v-64zm-128 64h64v64h-64v-64zm64-192h64v64h-64v-64z"
    }, null, -1), nx = [rx];

    function ax(o, t, r, a, n, s) {
        return (0, Fo.openBlock)(), (0, Fo.createElementBlock)("svg", tx, nx)
    }

    var j6 = e(Q6, [["render", ax], ["__file", "ice-tea.vue"]]);
    var J6 = {name: "InfoFilled"};
    var bo = c(l());
    var lx = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, cx = (0, bo.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 64a448 448 0 1 1 0 896.064A448 448 0 0 1 512 64zm67.2 275.072c33.28 0 60.288-23.104 60.288-57.344s-27.072-57.344-60.288-57.344c-33.28 0-60.16 23.104-60.16 57.344s26.88 57.344 60.16 57.344zM590.912 699.2c0-6.848 2.368-24.64 1.024-34.752l-52.608 60.544c-10.88 11.456-24.512 19.392-30.912 17.28a12.992 12.992 0 0 1-8.256-14.72l87.68-276.992c7.168-35.136-12.544-67.2-54.336-71.296-44.096 0-108.992 44.736-148.48 101.504 0 6.784-1.28 23.68.064 33.792l52.544-60.608c10.88-11.328 23.552-19.328 29.952-17.152a12.8 12.8 0 0 1 7.808 16.128L388.48 728.576c-10.048 32.256 8.96 63.872 55.04 71.04 67.84 0 107.904-43.648 147.456-100.416z"
    }, null, -1), sx = [cx];

    function mx(o, t, r, a, n, s) {
        return (0, bo.openBlock)(), (0, bo.createElementBlock)("svg", lx, sx)
    }

    var X6 = e(J6, [["render", mx], ["__file", "info-filled.vue"]]);
    var Y6 = {name: "Iphone"};
    var Po = c(l());
    var px = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, _x = (0, Po.createElementVNode)("path", {
        fill: "currentColor",
        d: "M224 768v96.064a64 64 0 0 0 64 64h448a64 64 0 0 0 64-64V768H224zm0-64h576V160a64 64 0 0 0-64-64H288a64 64 0 0 0-64 64v544zm32 288a96 96 0 0 1-96-96V128a96 96 0 0 1 96-96h512a96 96 0 0 1 96 96v768a96 96 0 0 1-96 96H256zm304-144a48 48 0 1 1-96 0 48 48 0 0 1 96 0z"
    }, null, -1), fx = [_x];

    function ix(o, t, r, a, n, s) {
        return (0, Po.openBlock)(), (0, Po.createElementBlock)("svg", px, fx)
    }

    var e3 = e(Y6, [["render", ix], ["__file", "iphone.vue"]]);
    var o3 = {name: "Key"};
    var Ro = c(l());
    var dx = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, ux = (0, Ro.createElementVNode)("path", {
        fill: "currentColor",
        d: "M448 456.064V96a32 32 0 0 1 32-32.064L672 64a32 32 0 0 1 0 64H512v128h160a32 32 0 0 1 0 64H512v128a256 256 0 1 1-64 8.064zM512 896a192 192 0 1 0 0-384 192 192 0 0 0 0 384z"
    }, null, -1), hx = [ux];

    function xx(o, t, r, a, n, s) {
        return (0, Ro.openBlock)(), (0, Ro.createElementBlock)("svg", dx, hx)
    }

    var t3 = e(o3, [["render", xx], ["__file", "key.vue"]]);
    var r3 = {name: "KnifeFork"};
    var To = c(l());
    var vx = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, wx = (0, To.createElementVNode)("path", {
        fill: "currentColor",
        d: "M256 410.56V96a32 32 0 0 1 64 0v314.56A96 96 0 0 0 384 320V96a32 32 0 0 1 64 0v224a160 160 0 0 1-128 156.8V928a32 32 0 1 1-64 0V476.8A160 160 0 0 1 128 320V96a32 32 0 0 1 64 0v224a96 96 0 0 0 64 90.56zm384-250.24V544h126.72c-3.328-78.72-12.928-147.968-28.608-207.744-14.336-54.528-46.848-113.344-98.112-175.872zM640 608v320a32 32 0 1 1-64 0V64h64c85.312 89.472 138.688 174.848 160 256 21.312 81.152 32 177.152 32 288H640z"
    }, null, -1), Bx = [wx];

    function kx(o, t, r, a, n, s) {
        return (0, To.openBlock)(), (0, To.createElementBlock)("svg", vx, Bx)
    }

    var n3 = e(r3, [["render", kx], ["__file", "knife-fork.vue"]]);
    var a3 = {name: "Lightning"};
    var ce = c(l());
    var Cx = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Ex = (0, ce.createElementVNode)("path", {
        fill: "currentColor",
        d: "M288 671.36v64.128A239.808 239.808 0 0 1 63.744 496.192a240.32 240.32 0 0 1 199.488-236.8 256.128 256.128 0 0 1 487.872-30.976A256.064 256.064 0 0 1 736 734.016v-64.768a192 192 0 0 0 3.328-377.92l-35.2-6.592-12.8-33.408a192.064 192.064 0 0 0-365.952 23.232l-9.92 40.896-41.472 7.04a176.32 176.32 0 0 0-146.24 173.568c0 91.968 70.464 167.36 160.256 175.232z"
    }, null, -1), $x = (0, ce.createElementVNode)("path", {
        fill: "currentColor",
        d: "M416 736a32 32 0 0 1-27.776-47.872l128-224a32 32 0 1 1 55.552 31.744L471.168 672H608a32 32 0 0 1 27.776 47.872l-128 224a32 32 0 1 1-55.68-31.744L552.96 736H416z"
    }, null, -1), Vx = [Ex, $x];

    function zx(o, t, r, a, n, s) {
        return (0, ce.openBlock)(), (0, ce.createElementBlock)("svg", Cx, Vx)
    }

    var l3 = e(a3, [["render", zx], ["__file", "lightning.vue"]]);
    var c3 = {name: "Link"};
    var Oo = c(l());
    var gx = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Hx = (0, Oo.createElementVNode)("path", {
        fill: "currentColor",
        d: "M715.648 625.152 670.4 579.904l90.496-90.56c75.008-74.944 85.12-186.368 22.656-248.896-62.528-62.464-173.952-52.352-248.96 22.656L444.16 353.6l-45.248-45.248 90.496-90.496c100.032-99.968 251.968-110.08 339.456-22.656 87.488 87.488 77.312 239.424-22.656 339.456l-90.496 90.496zm-90.496 90.496-90.496 90.496C434.624 906.112 282.688 916.224 195.2 828.8c-87.488-87.488-77.312-239.424 22.656-339.456l90.496-90.496 45.248 45.248-90.496 90.56c-75.008 74.944-85.12 186.368-22.656 248.896 62.528 62.464 173.952 52.352 248.96-22.656l90.496-90.496 45.248 45.248zm0-362.048 45.248 45.248L398.848 670.4 353.6 625.152 625.152 353.6z"
    }, null, -1), Dx = [Hx];

    function Mx(o, t, r, a, n, s) {
        return (0, Oo.openBlock)(), (0, Oo.createElementBlock)("svg", gx, Dx)
    }

    var s3 = e(c3, [["render", Mx], ["__file", "link.vue"]]);
    var m3 = {name: "List"};
    var Go = c(l());
    var Nx = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, yx = (0, Go.createElementVNode)("path", {
        fill: "currentColor",
        d: "M704 192h160v736H160V192h160v64h384v-64zM288 512h448v-64H288v64zm0 256h448v-64H288v64zm96-576V96h256v96H384z"
    }, null, -1), Lx = [yx];

    function Ax(o, t, r, a, n, s) {
        return (0, Go.openBlock)(), (0, Go.createElementBlock)("svg", Nx, Lx)
    }

    var p3 = e(m3, [["render", Ax], ["__file", "list.vue"]]);
    var _3 = {name: "Loading"};
    var Uo = c(l());
    var Sx = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, qx = (0, Uo.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 64a32 32 0 0 1 32 32v192a32 32 0 0 1-64 0V96a32 32 0 0 1 32-32zm0 640a32 32 0 0 1 32 32v192a32 32 0 1 1-64 0V736a32 32 0 0 1 32-32zm448-192a32 32 0 0 1-32 32H736a32 32 0 1 1 0-64h192a32 32 0 0 1 32 32zm-640 0a32 32 0 0 1-32 32H96a32 32 0 0 1 0-64h192a32 32 0 0 1 32 32zM195.2 195.2a32 32 0 0 1 45.248 0L376.32 331.008a32 32 0 0 1-45.248 45.248L195.2 240.448a32 32 0 0 1 0-45.248zm452.544 452.544a32 32 0 0 1 45.248 0L828.8 783.552a32 32 0 0 1-45.248 45.248L647.744 692.992a32 32 0 0 1 0-45.248zM828.8 195.264a32 32 0 0 1 0 45.184L692.992 376.32a32 32 0 0 1-45.248-45.248l135.808-135.808a32 32 0 0 1 45.248 0zm-452.544 452.48a32 32 0 0 1 0 45.248L240.448 828.8a32 32 0 0 1-45.248-45.248l135.808-135.808a32 32 0 0 1 45.248 0z"
    }, null, -1), Fx = [qx];

    function bx(o, t, r, a, n, s) {
        return (0, Uo.openBlock)(), (0, Uo.createElementBlock)("svg", Sx, Fx)
    }

    var f3 = e(_3, [["render", bx], ["__file", "loading.vue"]]);
    var i3 = {name: "LocationFilled"};
    var Wo = c(l());
    var Px = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Rx = (0, Wo.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 928c23.936 0 117.504-68.352 192.064-153.152C803.456 661.888 864 535.808 864 416c0-189.632-155.84-320-352-320S160 226.368 160 416c0 120.32 60.544 246.4 159.936 359.232C394.432 859.84 488 928 512 928zm0-435.2a64 64 0 1 0 0-128 64 64 0 0 0 0 128zm0 140.8a204.8 204.8 0 1 1 0-409.6 204.8 204.8 0 0 1 0 409.6z"
    }, null, -1), Tx = [Rx];

    function Ox(o, t, r, a, n, s) {
        return (0, Wo.openBlock)(), (0, Wo.createElementBlock)("svg", Px, Tx)
    }

    var d3 = e(i3, [["render", Ox], ["__file", "location-filled.vue"]]);
    var u3 = {name: "LocationInformation"};
    var k = c(l());
    var Gx = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Ux = (0, k.createElementVNode)("path", {
        fill: "currentColor",
        d: "M288 896h448q32 0 32 32t-32 32H288q-32 0-32-32t32-32z"
    }, null, -1), Wx = (0, k.createElementVNode)("path", {
        fill: "currentColor",
        d: "M800 416a288 288 0 1 0-576 0c0 118.144 94.528 272.128 288 456.576C705.472 688.128 800 534.144 800 416zM512 960C277.312 746.688 160 565.312 160 416a352 352 0 0 1 704 0c0 149.312-117.312 330.688-352 544z"
    }, null, -1), Ix = (0, k.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 512a96 96 0 1 0 0-192 96 96 0 0 0 0 192zm0 64a160 160 0 1 1 0-320 160 160 0 0 1 0 320z"
    }, null, -1), Zx = [Ux, Wx, Ix];

    function Kx(o, t, r, a, n, s) {
        return (0, k.openBlock)(), (0, k.createElementBlock)("svg", Gx, Zx)
    }

    var h3 = e(u3, [["render", Kx], ["__file", "location-information.vue"]]);
    var x3 = {name: "Location"};
    var se = c(l());
    var Qx = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, jx = (0, se.createElementVNode)("path", {
        fill: "currentColor",
        d: "M800 416a288 288 0 1 0-576 0c0 118.144 94.528 272.128 288 456.576C705.472 688.128 800 534.144 800 416zM512 960C277.312 746.688 160 565.312 160 416a352 352 0 0 1 704 0c0 149.312-117.312 330.688-352 544z"
    }, null, -1), Jx = (0, se.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 512a96 96 0 1 0 0-192 96 96 0 0 0 0 192zm0 64a160 160 0 1 1 0-320 160 160 0 0 1 0 320z"
    }, null, -1), Xx = [jx, Jx];

    function Yx(o, t, r, a, n, s) {
        return (0, se.openBlock)(), (0, se.createElementBlock)("svg", Qx, Xx)
    }

    var v3 = e(x3, [["render", Yx], ["__file", "location.vue"]]);
    var w3 = {name: "Lock"};
    var me = c(l());
    var ev = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, ov = (0, me.createElementVNode)("path", {
        fill: "currentColor",
        d: "M224 448a32 32 0 0 0-32 32v384a32 32 0 0 0 32 32h576a32 32 0 0 0 32-32V480a32 32 0 0 0-32-32H224zm0-64h576a96 96 0 0 1 96 96v384a96 96 0 0 1-96 96H224a96 96 0 0 1-96-96V480a96 96 0 0 1 96-96z"
    }, null, -1), tv = (0, me.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 544a32 32 0 0 1 32 32v192a32 32 0 1 1-64 0V576a32 32 0 0 1 32-32zm192-160v-64a192 192 0 1 0-384 0v64h384zM512 64a256 256 0 0 1 256 256v128H256V320A256 256 0 0 1 512 64z"
    }, null, -1), rv = [ov, tv];

    function nv(o, t, r, a, n, s) {
        return (0, me.openBlock)(), (0, me.createElementBlock)("svg", ev, rv)
    }

    var B3 = e(w3, [["render", nv], ["__file", "lock.vue"]]);
    var k3 = {name: "Lollipop"};
    var Io = c(l());
    var av = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, lv = (0, Io.createElementVNode)("path", {
        fill: "currentColor",
        d: "M513.28 448a64 64 0 1 1 76.544 49.728A96 96 0 0 0 768 448h64a160 160 0 0 1-320 0h1.28zm-126.976-29.696a256 256 0 1 0 43.52-180.48A256 256 0 0 1 832 448h-64a192 192 0 0 0-381.696-29.696zm105.664 249.472L285.696 874.048a96 96 0 0 1-135.68-135.744l206.208-206.272a320 320 0 1 1 135.744 135.744zm-54.464-36.032a321.92 321.92 0 0 1-45.248-45.248L195.2 783.552a32 32 0 1 0 45.248 45.248l197.056-197.12z"
    }, null, -1), cv = [lv];

    function sv(o, t, r, a, n, s) {
        return (0, Io.openBlock)(), (0, Io.createElementBlock)("svg", av, cv)
    }

    var C3 = e(k3, [["render", sv], ["__file", "lollipop.vue"]]);
    var E3 = {name: "MagicStick"};
    var Zo = c(l());
    var mv = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, pv = (0, Zo.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 64h64v192h-64V64zm0 576h64v192h-64V640zM160 480v-64h192v64H160zm576 0v-64h192v64H736zM249.856 199.04l45.248-45.184L430.848 289.6 385.6 334.848 249.856 199.104zM657.152 606.4l45.248-45.248 135.744 135.744-45.248 45.248L657.152 606.4zM114.048 923.2 68.8 877.952l316.8-316.8 45.248 45.248-316.8 316.8zM702.4 334.848 657.152 289.6l135.744-135.744 45.248 45.248L702.4 334.848z"
    }, null, -1), _v = [pv];

    function fv(o, t, r, a, n, s) {
        return (0, Zo.openBlock)(), (0, Zo.createElementBlock)("svg", mv, _v)
    }

    var $3 = e(E3, [["render", fv], ["__file", "magic-stick.vue"]]);
    var V3 = {name: "Magnet"};
    var Ko = c(l());
    var iv = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, dv = (0, Ko.createElementVNode)("path", {
        fill: "currentColor",
        d: "M832 320V192H704v320a192 192 0 1 1-384 0V192H192v128h128v64H192v128a320 320 0 0 0 640 0V384H704v-64h128zM640 512V128h256v384a384 384 0 1 1-768 0V128h256v384a128 128 0 1 0 256 0z"
    }, null, -1), uv = [dv];

    function hv(o, t, r, a, n, s) {
        return (0, Ko.openBlock)(), (0, Ko.createElementBlock)("svg", iv, uv)
    }

    var z3 = e(V3, [["render", hv], ["__file", "magnet.vue"]]);
    var g3 = {name: "Male"};
    var C = c(l());
    var xv = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, vv = (0, C.createElementVNode)("path", {
        fill: "currentColor",
        d: "M399.5 849.5a225 225 0 1 0 0-450 225 225 0 0 0 0 450zm0 56.25a281.25 281.25 0 1 1 0-562.5 281.25 281.25 0 0 1 0 562.5zm253.125-787.5h225q28.125 0 28.125 28.125T877.625 174.5h-225q-28.125 0-28.125-28.125t28.125-28.125z"
    }, null, -1), wv = (0, C.createElementVNode)("path", {
        fill: "currentColor",
        d: "M877.625 118.25q28.125 0 28.125 28.125v225q0 28.125-28.125 28.125T849.5 371.375v-225q0-28.125 28.125-28.125z"
    }, null, -1), Bv = (0, C.createElementVNode)("path", {
        fill: "currentColor",
        d: "M604.813 458.9 565.1 419.131l292.613-292.668 39.825 39.824z"
    }, null, -1), kv = [vv, wv, Bv];

    function Cv(o, t, r, a, n, s) {
        return (0, C.openBlock)(), (0, C.createElementBlock)("svg", xv, kv)
    }

    var H3 = e(g3, [["render", Cv], ["__file", "male.vue"]]);
    var D3 = {name: "Management"};
    var Qo = c(l());
    var Ev = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, $v = (0, Qo.createElementVNode)("path", {
        fill: "currentColor",
        d: "M576 128v288l96-96 96 96V128h128v768H320V128h256zm-448 0h128v768H128V128z"
    }, null, -1), Vv = [$v];

    function zv(o, t, r, a, n, s) {
        return (0, Qo.openBlock)(), (0, Qo.createElementBlock)("svg", Ev, Vv)
    }

    var M3 = e(D3, [["render", zv], ["__file", "management.vue"]]);
    var N3 = {name: "MapLocation"};
    var pe = c(l());
    var gv = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Hv = (0, pe.createElementVNode)("path", {
        fill: "currentColor",
        d: "M800 416a288 288 0 1 0-576 0c0 118.144 94.528 272.128 288 456.576C705.472 688.128 800 534.144 800 416zM512 960C277.312 746.688 160 565.312 160 416a352 352 0 0 1 704 0c0 149.312-117.312 330.688-352 544z"
    }, null, -1), Dv = (0, pe.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 448a64 64 0 1 0 0-128 64 64 0 0 0 0 128zm0 64a128 128 0 1 1 0-256 128 128 0 0 1 0 256zm345.6 192L960 960H672v-64H352v64H64l102.4-256h691.2zm-68.928 0H235.328l-76.8 192h706.944l-76.8-192z"
    }, null, -1), Mv = [Hv, Dv];

    function Nv(o, t, r, a, n, s) {
        return (0, pe.openBlock)(), (0, pe.createElementBlock)("svg", gv, Mv)
    }

    var y3 = e(N3, [["render", Nv], ["__file", "map-location.vue"]]);
    var L3 = {name: "Medal"};
    var _e = c(l());
    var yv = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Lv = (0, _e.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 896a256 256 0 1 0 0-512 256 256 0 0 0 0 512zm0 64a320 320 0 1 1 0-640 320 320 0 0 1 0 640z"
    }, null, -1), Av = (0, _e.createElementVNode)("path", {
        fill: "currentColor",
        d: "M576 128H448v200a286.72 286.72 0 0 1 64-8c19.52 0 40.832 2.688 64 8V128zm64 0v219.648c24.448 9.088 50.56 20.416 78.4 33.92L757.44 128H640zm-256 0H266.624l39.04 253.568c27.84-13.504 53.888-24.832 78.336-33.92V128zM229.312 64h565.376a32 32 0 0 1 31.616 36.864L768 480c-113.792-64-199.104-96-256-96-56.896 0-142.208 32-256 96l-58.304-379.136A32 32 0 0 1 229.312 64z"
    }, null, -1), Sv = [Lv, Av];

    function qv(o, t, r, a, n, s) {
        return (0, _e.openBlock)(), (0, _e.createElementBlock)("svg", yv, Sv)
    }

    var A3 = e(L3, [["render", qv], ["__file", "medal.vue"]]);
    var S3 = {name: "Memo"};
    var E = c(l());
    var Fv = {
        xmlns: "http://www.w3.org/2000/svg",
        "xml:space": "preserve",
        style: {"enable-background": "new 0 0 1024 1024"},
        viewBox: "0 0 1024 1024"
    }, bv = (0, E.createElementVNode)("path", {
        fill: "currentColor",
        d: "M480 320h192c21.33 0 32-10.67 32-32s-10.67-32-32-32H480c-21.33 0-32 10.67-32 32s10.67 32 32 32z"
    }, null, -1), Pv = (0, E.createElementVNode)("path", {
        fill: "currentColor",
        d: "M887.01 72.99C881.01 67 873.34 64 864 64H160c-9.35 0-17.02 3-23.01 8.99C131 78.99 128 86.66 128 96v832c0 9.35 2.99 17.02 8.99 23.01S150.66 960 160 960h704c9.35 0 17.02-2.99 23.01-8.99S896 937.34 896 928V96c0-9.35-3-17.02-8.99-23.01zM192 896V128h96v768h-96zm640 0H352V128h480v768z"
    }, null, -1), Rv = (0, E.createElementVNode)("path", {
        fill: "currentColor",
        d: "M480 512h192c21.33 0 32-10.67 32-32s-10.67-32-32-32H480c-21.33 0-32 10.67-32 32s10.67 32 32 32zm0 192h192c21.33 0 32-10.67 32-32s-10.67-32-32-32H480c-21.33 0-32 10.67-32 32s10.67 32 32 32z"
    }, null, -1), Tv = [bv, Pv, Rv];

    function Ov(o, t, r, a, n, s) {
        return (0, E.openBlock)(), (0, E.createElementBlock)("svg", Fv, Tv)
    }

    var q3 = e(S3, [["render", Ov], ["__file", "memo.vue"]]);
    var F3 = {name: "Menu"};
    var jo = c(l());
    var Gv = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Uv = (0, jo.createElementVNode)("path", {
        fill: "currentColor",
        d: "M160 448a32 32 0 0 1-32-32V160.064a32 32 0 0 1 32-32h256a32 32 0 0 1 32 32V416a32 32 0 0 1-32 32H160zm448 0a32 32 0 0 1-32-32V160.064a32 32 0 0 1 32-32h255.936a32 32 0 0 1 32 32V416a32 32 0 0 1-32 32H608zM160 896a32 32 0 0 1-32-32V608a32 32 0 0 1 32-32h256a32 32 0 0 1 32 32v256a32 32 0 0 1-32 32H160zm448 0a32 32 0 0 1-32-32V608a32 32 0 0 1 32-32h255.936a32 32 0 0 1 32 32v256a32 32 0 0 1-32 32H608z"
    }, null, -1), Wv = [Uv];

    function Iv(o, t, r, a, n, s) {
        return (0, jo.openBlock)(), (0, jo.createElementBlock)("svg", Gv, Wv)
    }

    var b3 = e(F3, [["render", Iv], ["__file", "menu.vue"]]);
    var P3 = {name: "MessageBox"};
    var Jo = c(l());
    var Zv = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Kv = (0, Jo.createElementVNode)("path", {
        fill: "currentColor",
        d: "M288 384h448v64H288v-64zm96-128h256v64H384v-64zM131.456 512H384v128h256V512h252.544L721.856 192H302.144L131.456 512zM896 576H704v128H320V576H128v256h768V576zM275.776 128h472.448a32 32 0 0 1 28.608 17.664l179.84 359.552A32 32 0 0 1 960 519.552V864a32 32 0 0 1-32 32H96a32 32 0 0 1-32-32V519.552a32 32 0 0 1 3.392-14.336l179.776-359.552A32 32 0 0 1 275.776 128z"
    }, null, -1), Qv = [Kv];

    function jv(o, t, r, a, n, s) {
        return (0, Jo.openBlock)(), (0, Jo.createElementBlock)("svg", Zv, Qv)
    }

    var R3 = e(P3, [["render", jv], ["__file", "message-box.vue"]]);
    var T3 = {name: "Message"};
    var fe = c(l());
    var Jv = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Xv = (0, fe.createElementVNode)("path", {
        fill: "currentColor",
        d: "M128 224v512a64 64 0 0 0 64 64h640a64 64 0 0 0 64-64V224H128zm0-64h768a64 64 0 0 1 64 64v512a128 128 0 0 1-128 128H192A128 128 0 0 1 64 736V224a64 64 0 0 1 64-64z"
    }, null, -1), Yv = (0, fe.createElementVNode)("path", {
        fill: "currentColor",
        d: "M904 224 656.512 506.88a192 192 0 0 1-289.024 0L120 224h784zm-698.944 0 210.56 240.704a128 128 0 0 0 192.704 0L818.944 224H205.056z"
    }, null, -1), ew = [Xv, Yv];

    function ow(o, t, r, a, n, s) {
        return (0, fe.openBlock)(), (0, fe.createElementBlock)("svg", Jv, ew)
    }

    var O3 = e(T3, [["render", ow], ["__file", "message.vue"]]);
    var G3 = {name: "Mic"};
    var Xo = c(l());
    var tw = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, rw = (0, Xo.createElementVNode)("path", {
        fill: "currentColor",
        d: "M480 704h160a64 64 0 0 0 64-64v-32h-96a32 32 0 0 1 0-64h96v-96h-96a32 32 0 0 1 0-64h96v-96h-96a32 32 0 0 1 0-64h96v-32a64 64 0 0 0-64-64H384a64 64 0 0 0-64 64v32h96a32 32 0 0 1 0 64h-96v96h96a32 32 0 0 1 0 64h-96v96h96a32 32 0 0 1 0 64h-96v32a64 64 0 0 0 64 64h96zm64 64v128h192a32 32 0 1 1 0 64H288a32 32 0 1 1 0-64h192V768h-96a128 128 0 0 1-128-128V192A128 128 0 0 1 384 64h256a128 128 0 0 1 128 128v448a128 128 0 0 1-128 128h-96z"
    }, null, -1), nw = [rw];

    function aw(o, t, r, a, n, s) {
        return (0, Xo.openBlock)(), (0, Xo.createElementBlock)("svg", tw, nw)
    }

    var U3 = e(G3, [["render", aw], ["__file", "mic.vue"]]);
    var W3 = {name: "Microphone"};
    var Yo = c(l());
    var lw = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, cw = (0, Yo.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 128a128 128 0 0 0-128 128v256a128 128 0 1 0 256 0V256a128 128 0 0 0-128-128zm0-64a192 192 0 0 1 192 192v256a192 192 0 1 1-384 0V256A192 192 0 0 1 512 64zm-32 832v-64a288 288 0 0 1-288-288v-32a32 32 0 0 1 64 0v32a224 224 0 0 0 224 224h64a224 224 0 0 0 224-224v-32a32 32 0 1 1 64 0v32a288 288 0 0 1-288 288v64h64a32 32 0 1 1 0 64H416a32 32 0 1 1 0-64h64z"
    }, null, -1), sw = [cw];

    function mw(o, t, r, a, n, s) {
        return (0, Yo.openBlock)(), (0, Yo.createElementBlock)("svg", lw, sw)
    }

    var I3 = e(W3, [["render", mw], ["__file", "microphone.vue"]]);
    var Z3 = {name: "MilkTea"};
    var et = c(l());
    var pw = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, _w = (0, et.createElementVNode)("path", {
        fill: "currentColor",
        d: "M416 128V96a96 96 0 0 1 96-96h128a32 32 0 1 1 0 64H512a32 32 0 0 0-32 32v32h320a96 96 0 0 1 11.712 191.296l-39.68 581.056A64 64 0 0 1 708.224 960H315.776a64 64 0 0 1-63.872-59.648l-39.616-581.056A96 96 0 0 1 224 128h192zM276.48 320l39.296 576h392.448l4.8-70.784a224.064 224.064 0 0 1 30.016-439.808L747.52 320H276.48zM224 256h576a32 32 0 1 0 0-64H224a32 32 0 0 0 0 64zm493.44 503.872 21.12-309.12a160 160 0 0 0-21.12 309.12z"
    }, null, -1), fw = [_w];

    function iw(o, t, r, a, n, s) {
        return (0, et.openBlock)(), (0, et.createElementBlock)("svg", pw, fw)
    }

    var K3 = e(Z3, [["render", iw], ["__file", "milk-tea.vue"]]);
    var Q3 = {name: "Minus"};
    var ot = c(l());
    var dw = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, uw = (0, ot.createElementVNode)("path", {
        fill: "currentColor",
        d: "M128 544h768a32 32 0 1 0 0-64H128a32 32 0 0 0 0 64z"
    }, null, -1), hw = [uw];

    function xw(o, t, r, a, n, s) {
        return (0, ot.openBlock)(), (0, ot.createElementBlock)("svg", dw, hw)
    }

    var j3 = e(Q3, [["render", xw], ["__file", "minus.vue"]]);
    var J3 = {name: "Money"};
    var $ = c(l());
    var vw = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, ww = (0, $.createElementVNode)("path", {
        fill: "currentColor",
        d: "M256 640v192h640V384H768v-64h150.976c14.272 0 19.456 1.472 24.64 4.288a29.056 29.056 0 0 1 12.16 12.096c2.752 5.184 4.224 10.368 4.224 24.64v493.952c0 14.272-1.472 19.456-4.288 24.64a29.056 29.056 0 0 1-12.096 12.16c-5.184 2.752-10.368 4.224-24.64 4.224H233.024c-14.272 0-19.456-1.472-24.64-4.288a29.056 29.056 0 0 1-12.16-12.096c-2.688-5.184-4.224-10.368-4.224-24.576V640h64z"
    }, null, -1), Bw = (0, $.createElementVNode)("path", {
        fill: "currentColor",
        d: "M768 192H128v448h640V192zm64-22.976v493.952c0 14.272-1.472 19.456-4.288 24.64a29.056 29.056 0 0 1-12.096 12.16c-5.184 2.752-10.368 4.224-24.64 4.224H105.024c-14.272 0-19.456-1.472-24.64-4.288a29.056 29.056 0 0 1-12.16-12.096C65.536 682.432 64 677.248 64 663.04V169.024c0-14.272 1.472-19.456 4.288-24.64a29.056 29.056 0 0 1 12.096-12.16C85.568 129.536 90.752 128 104.96 128h685.952c14.272 0 19.456 1.472 24.64 4.288a29.056 29.056 0 0 1 12.16 12.096c2.752 5.184 4.224 10.368 4.224 24.64z"
    }, null, -1), kw = (0, $.createElementVNode)("path", {
        fill: "currentColor",
        d: "M448 576a160 160 0 1 1 0-320 160 160 0 0 1 0 320zm0-64a96 96 0 1 0 0-192 96 96 0 0 0 0 192z"
    }, null, -1), Cw = [ww, Bw, kw];

    function Ew(o, t, r, a, n, s) {
        return (0, $.openBlock)(), (0, $.createElementBlock)("svg", vw, Cw)
    }

    var X3 = e(J3, [["render", Ew], ["__file", "money.vue"]]);
    var Y3 = {name: "Monitor"};
    var tt = c(l());
    var $w = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Vw = (0, tt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M544 768v128h192a32 32 0 1 1 0 64H288a32 32 0 1 1 0-64h192V768H192A128 128 0 0 1 64 640V256a128 128 0 0 1 128-128h640a128 128 0 0 1 128 128v384a128 128 0 0 1-128 128H544zM192 192a64 64 0 0 0-64 64v384a64 64 0 0 0 64 64h640a64 64 0 0 0 64-64V256a64 64 0 0 0-64-64H192z"
    }, null, -1), zw = [Vw];

    function gw(o, t, r, a, n, s) {
        return (0, tt.openBlock)(), (0, tt.createElementBlock)("svg", $w, zw)
    }

    var ea = e(Y3, [["render", gw], ["__file", "monitor.vue"]]);
    var oa = {name: "MoonNight"};
    var ie = c(l());
    var Hw = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Dw = (0, ie.createElementVNode)("path", {
        fill: "currentColor",
        d: "M384 512a448 448 0 0 1 215.872-383.296A384 384 0 0 0 213.76 640h188.8A448.256 448.256 0 0 1 384 512zM171.136 704a448 448 0 0 1 636.992-575.296A384 384 0 0 0 499.328 704h-328.32z"
    }, null, -1), Mw = (0, ie.createElementVNode)("path", {
        fill: "currentColor",
        d: "M32 640h960q32 0 32 32t-32 32H32q-32 0-32-32t32-32zm128 128h384a32 32 0 1 1 0 64H160a32 32 0 1 1 0-64zm160 127.68 224 .256a32 32 0 0 1 32 32V928a32 32 0 0 1-32 32l-224-.384a32 32 0 0 1-32-32v-.064a32 32 0 0 1 32-32z"
    }, null, -1), Nw = [Dw, Mw];

    function yw(o, t, r, a, n, s) {
        return (0, ie.openBlock)(), (0, ie.createElementBlock)("svg", Hw, Nw)
    }

    var ta = e(oa, [["render", yw], ["__file", "moon-night.vue"]]);
    var ra = {name: "Moon"};
    var rt = c(l());
    var Lw = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Aw = (0, rt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M240.448 240.448a384 384 0 1 0 559.424 525.696 448 448 0 0 1-542.016-542.08 390.592 390.592 0 0 0-17.408 16.384zm181.056 362.048a384 384 0 0 0 525.632 16.384A448 448 0 1 1 405.056 76.8a384 384 0 0 0 16.448 525.696z"
    }, null, -1), Sw = [Aw];

    function qw(o, t, r, a, n, s) {
        return (0, rt.openBlock)(), (0, rt.createElementBlock)("svg", Lw, Sw)
    }

    var na = e(ra, [["render", qw], ["__file", "moon.vue"]]);
    var aa = {name: "MoreFilled"};
    var nt = c(l());
    var Fw = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, bw = (0, nt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M176 416a112 112 0 1 1 0 224 112 112 0 0 1 0-224zm336 0a112 112 0 1 1 0 224 112 112 0 0 1 0-224zm336 0a112 112 0 1 1 0 224 112 112 0 0 1 0-224z"
    }, null, -1), Pw = [bw];

    function Rw(o, t, r, a, n, s) {
        return (0, nt.openBlock)(), (0, nt.createElementBlock)("svg", Fw, Pw)
    }

    var la = e(aa, [["render", Rw], ["__file", "more-filled.vue"]]);
    var ca = {name: "More"};
    var at = c(l());
    var Tw = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Ow = (0, at.createElementVNode)("path", {
        fill: "currentColor",
        d: "M176 416a112 112 0 1 0 0 224 112 112 0 0 0 0-224m0 64a48 48 0 1 1 0 96 48 48 0 0 1 0-96zm336-64a112 112 0 1 1 0 224 112 112 0 0 1 0-224zm0 64a48 48 0 1 0 0 96 48 48 0 0 0 0-96zm336-64a112 112 0 1 1 0 224 112 112 0 0 1 0-224zm0 64a48 48 0 1 0 0 96 48 48 0 0 0 0-96z"
    }, null, -1), Gw = [Ow];

    function Uw(o, t, r, a, n, s) {
        return (0, at.openBlock)(), (0, at.createElementBlock)("svg", Tw, Gw)
    }

    var sa = e(ca, [["render", Uw], ["__file", "more.vue"]]);
    var ma = {name: "MostlyCloudy"};
    var lt = c(l());
    var Ww = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Iw = (0, lt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M737.216 357.952 704 349.824l-11.776-32a192.064 192.064 0 0 0-367.424 23.04l-8.96 39.04-39.04 8.96A192.064 192.064 0 0 0 320 768h368a207.808 207.808 0 0 0 207.808-208 208.32 208.32 0 0 0-158.592-202.048zm15.168-62.208A272.32 272.32 0 0 1 959.744 560a271.808 271.808 0 0 1-271.552 272H320a256 256 0 0 1-57.536-505.536 256.128 256.128 0 0 1 489.92-30.72z"
    }, null, -1), Zw = [Iw];

    function Kw(o, t, r, a, n, s) {
        return (0, lt.openBlock)(), (0, lt.createElementBlock)("svg", Ww, Zw)
    }

    var pa = e(ma, [["render", Kw], ["__file", "mostly-cloudy.vue"]]);
    var _a = {name: "Mouse"};
    var de = c(l());
    var Qw = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, jw = (0, de.createElementVNode)("path", {
        fill: "currentColor",
        d: "M438.144 256c-68.352 0-92.736 4.672-117.76 18.112-20.096 10.752-35.52 26.176-46.272 46.272C260.672 345.408 256 369.792 256 438.144v275.712c0 68.352 4.672 92.736 18.112 117.76 10.752 20.096 26.176 35.52 46.272 46.272C345.408 891.328 369.792 896 438.144 896h147.712c68.352 0 92.736-4.672 117.76-18.112 20.096-10.752 35.52-26.176 46.272-46.272C763.328 806.592 768 782.208 768 713.856V438.144c0-68.352-4.672-92.736-18.112-117.76a110.464 110.464 0 0 0-46.272-46.272C678.592 260.672 654.208 256 585.856 256H438.144zm0-64h147.712c85.568 0 116.608 8.96 147.904 25.6 31.36 16.768 55.872 41.344 72.576 72.64C823.104 321.536 832 352.576 832 438.08v275.84c0 85.504-8.96 116.544-25.6 147.84a174.464 174.464 0 0 1-72.64 72.576C702.464 951.104 671.424 960 585.92 960H438.08c-85.504 0-116.544-8.96-147.84-25.6a174.464 174.464 0 0 1-72.64-72.704c-16.768-31.296-25.664-62.336-25.664-147.84v-275.84c0-85.504 8.96-116.544 25.6-147.84a174.464 174.464 0 0 1 72.768-72.576c31.232-16.704 62.272-25.6 147.776-25.6z"
    }, null, -1), Jw = (0, de.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 320q32 0 32 32v128q0 32-32 32t-32-32V352q0-32 32-32zm32-96a32 32 0 0 1-64 0v-64a32 32 0 0 0-32-32h-96a32 32 0 0 1 0-64h96a96 96 0 0 1 96 96v64z"
    }, null, -1), Xw = [jw, Jw];

    function Yw(o, t, r, a, n, s) {
        return (0, de.openBlock)(), (0, de.createElementBlock)("svg", Qw, Xw)
    }

    var fa = e(_a, [["render", Yw], ["__file", "mouse.vue"]]);
    var ia = {name: "Mug"};
    var ct = c(l());
    var eB = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, oB = (0, ct.createElementVNode)("path", {
        fill: "currentColor",
        d: "M736 800V160H160v640a64 64 0 0 0 64 64h448a64 64 0 0 0 64-64zm64-544h63.552a96 96 0 0 1 96 96v224a96 96 0 0 1-96 96H800v128a128 128 0 0 1-128 128H224A128 128 0 0 1 96 800V128a32 32 0 0 1 32-32h640a32 32 0 0 1 32 32v128zm0 64v288h63.552a32 32 0 0 0 32-32V352a32 32 0 0 0-32-32H800z"
    }, null, -1), tB = [oB];

    function rB(o, t, r, a, n, s) {
        return (0, ct.openBlock)(), (0, ct.createElementBlock)("svg", eB, tB)
    }

    var da = e(ia, [["render", rB], ["__file", "mug.vue"]]);
    var ua = {name: "MuteNotification"};
    var ue = c(l());
    var nB = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, aB = (0, ue.createElementVNode)("path", {
        fill: "currentColor",
        d: "m241.216 832 63.616-64H768V448c0-42.368-10.24-82.304-28.48-117.504l46.912-47.232C815.36 331.392 832 387.84 832 448v320h96a32 32 0 1 1 0 64H241.216zm-90.24 0H96a32 32 0 1 1 0-64h96V448a320.128 320.128 0 0 1 256-313.6V128a64 64 0 1 1 128 0v6.4a319.552 319.552 0 0 1 171.648 97.088l-45.184 45.44A256 256 0 0 0 256 448v278.336L151.04 832zM448 896h128a64 64 0 0 1-128 0z"
    }, null, -1), lB = (0, ue.createElementVNode)("path", {
        fill: "currentColor",
        d: "M150.72 859.072a32 32 0 0 1-45.44-45.056l704-708.544a32 32 0 0 1 45.44 45.056l-704 708.544z"
    }, null, -1), cB = [aB, lB];

    function sB(o, t, r, a, n, s) {
        return (0, ue.openBlock)(), (0, ue.createElementBlock)("svg", nB, cB)
    }

    var ha = e(ua, [["render", sB], ["__file", "mute-notification.vue"]]);
    var xa = {name: "Mute"};
    var he = c(l());
    var mB = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, pB = (0, he.createElementVNode)("path", {
        fill: "currentColor",
        d: "m412.16 592.128-45.44 45.44A191.232 191.232 0 0 1 320 512V256a192 192 0 1 1 384 0v44.352l-64 64V256a128 128 0 1 0-256 0v256c0 30.336 10.56 58.24 28.16 80.128zm51.968 38.592A128 128 0 0 0 640 512v-57.152l64-64V512a192 192 0 0 1-287.68 166.528l47.808-47.808zM314.88 779.968l46.144-46.08A222.976 222.976 0 0 0 480 768h64a224 224 0 0 0 224-224v-32a32 32 0 1 1 64 0v32a288 288 0 0 1-288 288v64h64a32 32 0 1 1 0 64H416a32 32 0 1 1 0-64h64v-64c-61.44 0-118.4-19.2-165.12-52.032zM266.752 737.6A286.976 286.976 0 0 1 192 544v-32a32 32 0 0 1 64 0v32c0 56.832 21.184 108.8 56.064 148.288L266.752 737.6z"
    }, null, -1), _B = (0, he.createElementVNode)("path", {
        fill: "currentColor",
        d: "M150.72 859.072a32 32 0 0 1-45.44-45.056l704-708.544a32 32 0 0 1 45.44 45.056l-704 708.544z"
    }, null, -1), fB = [pB, _B];

    function iB(o, t, r, a, n, s) {
        return (0, he.openBlock)(), (0, he.createElementBlock)("svg", mB, fB)
    }

    var va = e(xa, [["render", iB], ["__file", "mute.vue"]]);
    var wa = {name: "NoSmoking"};
    var st = c(l());
    var dB = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, uB = (0, st.createElementVNode)("path", {
        fill: "currentColor",
        d: "M440.256 576H256v128h56.256l-64 64H224a32 32 0 0 1-32-32V544a32 32 0 0 1 32-32h280.256l-64 64zm143.488 128H704V583.744L775.744 512H928a32 32 0 0 1 32 32v192a32 32 0 0 1-32 32H519.744l64-64zM768 576v128h128V576H768zm-29.696-207.552 45.248 45.248-497.856 497.856-45.248-45.248zM256 64h64v320h-64zM128 192h64v192h-64zM64 512h64v256H64z"
    }, null, -1), hB = [uB];

    function xB(o, t, r, a, n, s) {
        return (0, st.openBlock)(), (0, st.createElementBlock)("svg", dB, hB)
    }

    var Ba = e(wa, [["render", xB], ["__file", "no-smoking.vue"]]);
    var ka = {name: "Notebook"};
    var xe = c(l());
    var vB = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, wB = (0, xe.createElementVNode)("path", {
        fill: "currentColor",
        d: "M192 128v768h640V128H192zm-32-64h704a32 32 0 0 1 32 32v832a32 32 0 0 1-32 32H160a32 32 0 0 1-32-32V96a32 32 0 0 1 32-32z"
    }, null, -1), BB = (0, xe.createElementVNode)("path", {
        fill: "currentColor",
        d: "M672 128h64v768h-64zM96 192h128q32 0 32 32t-32 32H96q-32 0-32-32t32-32zm0 192h128q32 0 32 32t-32 32H96q-32 0-32-32t32-32zm0 192h128q32 0 32 32t-32 32H96q-32 0-32-32t32-32zm0 192h128q32 0 32 32t-32 32H96q-32 0-32-32t32-32z"
    }, null, -1), kB = [wB, BB];

    function CB(o, t, r, a, n, s) {
        return (0, xe.openBlock)(), (0, xe.createElementBlock)("svg", vB, kB)
    }

    var Ca = e(ka, [["render", CB], ["__file", "notebook.vue"]]);
    var Ea = {name: "Notification"};
    var ve = c(l());
    var EB = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, $B = (0, ve.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 128v64H256a64 64 0 0 0-64 64v512a64 64 0 0 0 64 64h512a64 64 0 0 0 64-64V512h64v256a128 128 0 0 1-128 128H256a128 128 0 0 1-128-128V256a128 128 0 0 1 128-128h256z"
    }, null, -1), VB = (0, ve.createElementVNode)("path", {
        fill: "currentColor",
        d: "M768 384a128 128 0 1 0 0-256 128 128 0 0 0 0 256zm0 64a192 192 0 1 1 0-384 192 192 0 0 1 0 384z"
    }, null, -1), zB = [$B, VB];

    function gB(o, t, r, a, n, s) {
        return (0, ve.openBlock)(), (0, ve.createElementBlock)("svg", EB, zB)
    }

    var $a = e(Ea, [["render", gB], ["__file", "notification.vue"]]);
    var Va = {name: "Odometer"};
    var V = c(l());
    var HB = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, DB = (0, V.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 896a384 384 0 1 0 0-768 384 384 0 0 0 0 768zm0 64a448 448 0 1 1 0-896 448 448 0 0 1 0 896z"
    }, null, -1), MB = (0, V.createElementVNode)("path", {
        fill: "currentColor",
        d: "M192 512a320 320 0 1 1 640 0 32 32 0 1 1-64 0 256 256 0 1 0-512 0 32 32 0 0 1-64 0z"
    }, null, -1), NB = (0, V.createElementVNode)("path", {
        fill: "currentColor",
        d: "M570.432 627.84A96 96 0 1 1 509.568 608l60.992-187.776A32 32 0 1 1 631.424 440l-60.992 187.776zM502.08 734.464a32 32 0 1 0 19.84-60.928 32 32 0 0 0-19.84 60.928z"
    }, null, -1), yB = [DB, MB, NB];

    function LB(o, t, r, a, n, s) {
        return (0, V.openBlock)(), (0, V.createElementBlock)("svg", HB, yB)
    }

    var za = e(Va, [["render", LB], ["__file", "odometer.vue"]]);
    var ga = {name: "OfficeBuilding"};
    var z = c(l());
    var AB = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, SB = (0, z.createElementVNode)("path", {
        fill: "currentColor",
        d: "M192 128v704h384V128H192zm-32-64h448a32 32 0 0 1 32 32v768a32 32 0 0 1-32 32H160a32 32 0 0 1-32-32V96a32 32 0 0 1 32-32z"
    }, null, -1), qB = (0, z.createElementVNode)("path", {
        fill: "currentColor",
        d: "M256 256h256v64H256v-64zm0 192h256v64H256v-64zm0 192h256v64H256v-64zm384-128h128v64H640v-64zm0 128h128v64H640v-64zM64 832h896v64H64v-64z"
    }, null, -1), FB = (0, z.createElementVNode)("path", {
        fill: "currentColor",
        d: "M640 384v448h192V384H640zm-32-64h256a32 32 0 0 1 32 32v512a32 32 0 0 1-32 32H608a32 32 0 0 1-32-32V352a32 32 0 0 1 32-32z"
    }, null, -1), bB = [SB, qB, FB];

    function PB(o, t, r, a, n, s) {
        return (0, z.openBlock)(), (0, z.createElementBlock)("svg", AB, bB)
    }

    var Ha = e(ga, [["render", PB], ["__file", "office-building.vue"]]);
    var Da = {name: "Open"};
    var we = c(l());
    var RB = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, TB = (0, we.createElementVNode)("path", {
        fill: "currentColor",
        d: "M329.956 257.138a254.862 254.862 0 0 0 0 509.724h364.088a254.862 254.862 0 0 0 0-509.724H329.956zm0-72.818h364.088a327.68 327.68 0 1 1 0 655.36H329.956a327.68 327.68 0 1 1 0-655.36z"
    }, null, -1), OB = (0, we.createElementVNode)("path", {
        fill: "currentColor",
        d: "M694.044 621.227a109.227 109.227 0 1 0 0-218.454 109.227 109.227 0 0 0 0 218.454zm0 72.817a182.044 182.044 0 1 1 0-364.088 182.044 182.044 0 0 1 0 364.088z"
    }, null, -1), GB = [TB, OB];

    function UB(o, t, r, a, n, s) {
        return (0, we.openBlock)(), (0, we.createElementBlock)("svg", RB, GB)
    }

    var Ma = e(Da, [["render", UB], ["__file", "open.vue"]]);
    var Na = {name: "Operation"};
    var mt = c(l());
    var WB = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, IB = (0, mt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M389.44 768a96.064 96.064 0 0 1 181.12 0H896v64H570.56a96.064 96.064 0 0 1-181.12 0H128v-64h261.44zm192-288a96.064 96.064 0 0 1 181.12 0H896v64H762.56a96.064 96.064 0 0 1-181.12 0H128v-64h453.44zm-320-288a96.064 96.064 0 0 1 181.12 0H896v64H442.56a96.064 96.064 0 0 1-181.12 0H128v-64h133.44z"
    }, null, -1), ZB = [IB];

    function KB(o, t, r, a, n, s) {
        return (0, mt.openBlock)(), (0, mt.createElementBlock)("svg", WB, ZB)
    }

    var ya = e(Na, [["render", KB], ["__file", "operation.vue"]]);
    var La = {name: "Opportunity"};
    var pt = c(l());
    var QB = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, jB = (0, pt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M384 960v-64h192.064v64H384zm448-544a350.656 350.656 0 0 1-128.32 271.424C665.344 719.04 640 763.776 640 813.504V832H320v-14.336c0-48-19.392-95.36-57.216-124.992a351.552 351.552 0 0 1-128.448-344.256c25.344-136.448 133.888-248.128 269.76-276.48A352.384 352.384 0 0 1 832 416zm-544 32c0-132.288 75.904-224 192-224v-64c-154.432 0-256 122.752-256 288h64z"
    }, null, -1), JB = [jB];

    function XB(o, t, r, a, n, s) {
        return (0, pt.openBlock)(), (0, pt.createElementBlock)("svg", QB, JB)
    }

    var Aa = e(La, [["render", XB], ["__file", "opportunity.vue"]]);
    var Sa = {name: "Orange"};
    var _t = c(l());
    var YB = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, ek = (0, _t.createElementVNode)("path", {
        fill: "currentColor",
        d: "M544 894.72a382.336 382.336 0 0 0 215.936-89.472L577.024 622.272c-10.24 6.016-21.248 10.688-33.024 13.696v258.688zm261.248-134.784A382.336 382.336 0 0 0 894.656 544H635.968c-3.008 11.776-7.68 22.848-13.696 33.024l182.976 182.912zM894.656 480a382.336 382.336 0 0 0-89.408-215.936L622.272 446.976c6.016 10.24 10.688 21.248 13.696 33.024h258.688zm-134.72-261.248A382.336 382.336 0 0 0 544 129.344v258.688c11.776 3.008 22.848 7.68 33.024 13.696l182.912-182.976zM480 129.344a382.336 382.336 0 0 0-215.936 89.408l182.912 182.976c10.24-6.016 21.248-10.688 33.024-13.696V129.344zm-261.248 134.72A382.336 382.336 0 0 0 129.344 480h258.688c3.008-11.776 7.68-22.848 13.696-33.024L218.752 264.064zM129.344 544a382.336 382.336 0 0 0 89.408 215.936l182.976-182.912A127.232 127.232 0 0 1 388.032 544H129.344zm134.72 261.248A382.336 382.336 0 0 0 480 894.656V635.968a127.232 127.232 0 0 1-33.024-13.696L264.064 805.248zM512 960a448 448 0 1 1 0-896 448 448 0 0 1 0 896zm0-384a64 64 0 1 0 0-128 64 64 0 0 0 0 128z"
    }, null, -1), ok = [ek];

    function tk(o, t, r, a, n, s) {
        return (0, _t.openBlock)(), (0, _t.createElementBlock)("svg", YB, ok)
    }

    var qa = e(Sa, [["render", tk], ["__file", "orange.vue"]]);
    var Fa = {name: "Paperclip"};
    var ft = c(l());
    var rk = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, nk = (0, ft.createElementVNode)("path", {
        fill: "currentColor",
        d: "M602.496 240.448A192 192 0 1 1 874.048 512l-316.8 316.8A256 256 0 0 1 195.2 466.752L602.496 59.456l45.248 45.248L240.448 512A192 192 0 0 0 512 783.552l316.8-316.8a128 128 0 1 0-181.056-181.056L353.6 579.904a32 32 0 1 0 45.248 45.248l294.144-294.144 45.312 45.248L444.096 670.4a96 96 0 1 1-135.744-135.744l294.144-294.208z"
    }, null, -1), ak = [nk];

    function lk(o, t, r, a, n, s) {
        return (0, ft.openBlock)(), (0, ft.createElementBlock)("svg", rk, ak)
    }

    var ba = e(Fa, [["render", lk], ["__file", "paperclip.vue"]]);
    var Pa = {name: "PartlyCloudy"};
    var Be = c(l());
    var ck = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, sk = (0, Be.createElementVNode)("path", {
        fill: "currentColor",
        d: "M598.4 895.872H328.192a256 256 0 0 1-34.496-510.528A352 352 0 1 1 598.4 895.872zm-271.36-64h272.256a288 288 0 1 0-248.512-417.664L335.04 445.44l-34.816 3.584a192 192 0 0 0 26.88 382.848z"
    }, null, -1), mk = (0, Be.createElementVNode)("path", {
        fill: "currentColor",
        d: "M139.84 501.888a256 256 0 1 1 417.856-277.12c-17.728 2.176-38.208 8.448-61.504 18.816A192 192 0 1 0 189.12 460.48a6003.84 6003.84 0 0 0-49.28 41.408z"
    }, null, -1), pk = [sk, mk];

    function _k(o, t, r, a, n, s) {
        return (0, Be.openBlock)(), (0, Be.createElementBlock)("svg", ck, pk)
    }

    var Ra = e(Pa, [["render", _k], ["__file", "partly-cloudy.vue"]]);
    var Ta = {name: "Pear"};
    var it = c(l());
    var fk = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, ik = (0, it.createElementVNode)("path", {
        fill: "currentColor",
        d: "M542.336 258.816a443.255 443.255 0 0 0-9.024 25.088 32 32 0 1 1-60.8-20.032l1.088-3.328a162.688 162.688 0 0 0-122.048 131.392l-17.088 102.72-20.736 15.36C256.192 552.704 224 610.88 224 672c0 120.576 126.4 224 288 224s288-103.424 288-224c0-61.12-32.192-119.296-89.728-161.92l-20.736-15.424-17.088-102.72a162.688 162.688 0 0 0-130.112-133.12zm-40.128-66.56c7.936-15.552 16.576-30.08 25.92-43.776 23.296-33.92 49.408-59.776 78.528-77.12a32 32 0 1 1 32.704 55.04c-20.544 12.224-40.064 31.552-58.432 58.304a316.608 316.608 0 0 0-9.792 15.104 226.688 226.688 0 0 1 164.48 181.568l12.8 77.248C819.456 511.36 864 587.392 864 672c0 159.04-157.568 288-352 288S160 831.04 160 672c0-84.608 44.608-160.64 115.584-213.376l12.8-77.248a226.624 226.624 0 0 1 213.76-189.184z"
    }, null, -1), dk = [ik];

    function uk(o, t, r, a, n, s) {
        return (0, it.openBlock)(), (0, it.createElementBlock)("svg", fk, dk)
    }

    var Oa = e(Ta, [["render", uk], ["__file", "pear.vue"]]);
    var Ga = {name: "PhoneFilled"};
    var dt = c(l());
    var hk = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, xk = (0, dt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M199.232 125.568 90.624 379.008a32 32 0 0 0 6.784 35.2l512.384 512.384a32 32 0 0 0 35.2 6.784l253.44-108.608a32 32 0 0 0 10.048-52.032L769.6 633.92a32 32 0 0 0-36.928-5.952l-130.176 65.088-271.488-271.552 65.024-130.176a32 32 0 0 0-5.952-36.928L251.2 115.52a32 32 0 0 0-51.968 10.048z"
    }, null, -1), vk = [xk];

    function wk(o, t, r, a, n, s) {
        return (0, dt.openBlock)(), (0, dt.createElementBlock)("svg", hk, vk)
    }

    var Ua = e(Ga, [["render", wk], ["__file", "phone-filled.vue"]]);
    var Wa = {name: "Phone"};
    var ut = c(l());
    var Bk = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, kk = (0, ut.createElementVNode)("path", {
        fill: "currentColor",
        d: "M79.36 432.256 591.744 944.64a32 32 0 0 0 35.2 6.784l253.44-108.544a32 32 0 0 0 9.984-52.032l-153.856-153.92a32 32 0 0 0-36.928-6.016l-69.888 34.944L358.08 394.24l35.008-69.888a32 32 0 0 0-5.952-36.928L233.152 133.568a32 32 0 0 0-52.032 10.048L72.512 397.056a32 32 0 0 0 6.784 35.2zm60.48-29.952 81.536-190.08L325.568 316.48l-24.64 49.216-20.608 41.216 32.576 32.64 271.552 271.552 32.64 32.64 41.216-20.672 49.28-24.576 104.192 104.128-190.08 81.472L139.84 402.304zM512 320v-64a256 256 0 0 1 256 256h-64a192 192 0 0 0-192-192zm0-192V64a448 448 0 0 1 448 448h-64a384 384 0 0 0-384-384z"
    }, null, -1), Ck = [kk];

    function Ek(o, t, r, a, n, s) {
        return (0, ut.openBlock)(), (0, ut.createElementBlock)("svg", Bk, Ck)
    }

    var Ia = e(Wa, [["render", Ek], ["__file", "phone.vue"]]);
    var Za = {name: "PictureFilled"};
    var ht = c(l());
    var $k = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Vk = (0, ht.createElementVNode)("path", {
        fill: "currentColor",
        d: "M96 896a32 32 0 0 1-32-32V160a32 32 0 0 1 32-32h832a32 32 0 0 1 32 32v704a32 32 0 0 1-32 32H96zm315.52-228.48-68.928-68.928a32 32 0 0 0-45.248 0L128 768.064h778.688l-242.112-290.56a32 32 0 0 0-49.216 0L458.752 665.408a32 32 0 0 1-47.232 2.112zM256 384a96 96 0 1 0 192.064-.064A96 96 0 0 0 256 384z"
    }, null, -1), zk = [Vk];

    function gk(o, t, r, a, n, s) {
        return (0, ht.openBlock)(), (0, ht.createElementBlock)("svg", $k, zk)
    }

    var Ka = e(Za, [["render", gk], ["__file", "picture-filled.vue"]]);
    var Qa = {name: "PictureRounded"};
    var ke = c(l());
    var Hk = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Dk = (0, ke.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 128a384 384 0 1 0 0 768 384 384 0 0 0 0-768zm0-64a448 448 0 1 1 0 896 448 448 0 0 1 0-896z"
    }, null, -1), Mk = (0, ke.createElementVNode)("path", {
        fill: "currentColor",
        d: "M640 288q64 0 64 64t-64 64q-64 0-64-64t64-64zM214.656 790.656l-45.312-45.312 185.664-185.6a96 96 0 0 1 123.712-10.24l138.24 98.688a32 32 0 0 0 39.872-2.176L906.688 422.4l42.624 47.744L699.52 693.696a96 96 0 0 1-119.808 6.592l-138.24-98.752a32 32 0 0 0-41.152 3.456l-185.664 185.6z"
    }, null, -1), Nk = [Dk, Mk];

    function yk(o, t, r, a, n, s) {
        return (0, ke.openBlock)(), (0, ke.createElementBlock)("svg", Hk, Nk)
    }

    var ja = e(Qa, [["render", yk], ["__file", "picture-rounded.vue"]]);
    var Ja = {name: "Picture"};
    var Ce = c(l());
    var Lk = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Ak = (0, Ce.createElementVNode)("path", {
        fill: "currentColor",
        d: "M160 160v704h704V160H160zm-32-64h768a32 32 0 0 1 32 32v768a32 32 0 0 1-32 32H128a32 32 0 0 1-32-32V128a32 32 0 0 1 32-32z"
    }, null, -1), Sk = (0, Ce.createElementVNode)("path", {
        fill: "currentColor",
        d: "M384 288q64 0 64 64t-64 64q-64 0-64-64t64-64zM185.408 876.992l-50.816-38.912L350.72 556.032a96 96 0 0 1 134.592-17.856l1.856 1.472 122.88 99.136a32 32 0 0 0 44.992-4.864l216-269.888 49.92 39.936-215.808 269.824-.256.32a96 96 0 0 1-135.04 14.464l-122.88-99.072-.64-.512a32 32 0 0 0-44.8 5.952L185.408 876.992z"
    }, null, -1), qk = [Ak, Sk];

    function Fk(o, t, r, a, n, s) {
        return (0, Ce.openBlock)(), (0, Ce.createElementBlock)("svg", Lk, qk)
    }

    var Xa = e(Ja, [["render", Fk], ["__file", "picture.vue"]]);
    var Ya = {name: "PieChart"};
    var Ee = c(l());
    var bk = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Pk = (0, Ee.createElementVNode)("path", {
        fill: "currentColor",
        d: "M448 68.48v64.832A384.128 384.128 0 0 0 512 896a384.128 384.128 0 0 0 378.688-320h64.768A448.128 448.128 0 0 1 64 512 448.128 448.128 0 0 1 448 68.48z"
    }, null, -1), Rk = (0, Ee.createElementVNode)("path", {
        fill: "currentColor",
        d: "M576 97.28V448h350.72A384.064 384.064 0 0 0 576 97.28zM512 64V33.152A448 448 0 0 1 990.848 512H512V64z"
    }, null, -1), Tk = [Pk, Rk];

    function Ok(o, t, r, a, n, s) {
        return (0, Ee.openBlock)(), (0, Ee.createElementBlock)("svg", bk, Tk)
    }

    var e8 = e(Ya, [["render", Ok], ["__file", "pie-chart.vue"]]);
    var o8 = {name: "Place"};
    var g = c(l());
    var Gk = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Uk = (0, g.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 512a192 192 0 1 0 0-384 192 192 0 0 0 0 384zm0 64a256 256 0 1 1 0-512 256 256 0 0 1 0 512z"
    }, null, -1), Wk = (0, g.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 512a32 32 0 0 1 32 32v256a32 32 0 1 1-64 0V544a32 32 0 0 1 32-32z"
    }, null, -1), Ik = (0, g.createElementVNode)("path", {
        fill: "currentColor",
        d: "M384 649.088v64.96C269.76 732.352 192 771.904 192 800c0 37.696 139.904 96 320 96s320-58.304 320-96c0-28.16-77.76-67.648-192-85.952v-64.96C789.12 671.04 896 730.368 896 800c0 88.32-171.904 160-384 160s-384-71.68-384-160c0-69.696 106.88-128.96 256-150.912z"
    }, null, -1), Zk = [Uk, Wk, Ik];

    function Kk(o, t, r, a, n, s) {
        return (0, g.openBlock)(), (0, g.createElementBlock)("svg", Gk, Zk)
    }

    var t8 = e(o8, [["render", Kk], ["__file", "place.vue"]]);
    var r8 = {name: "Platform"};
    var xt = c(l());
    var Qk = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, jk = (0, xt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M448 832v-64h128v64h192v64H256v-64h192zM128 704V128h768v576H128z"
    }, null, -1), Jk = [jk];

    function Xk(o, t, r, a, n, s) {
        return (0, xt.openBlock)(), (0, xt.createElementBlock)("svg", Qk, Jk)
    }

    var n8 = e(r8, [["render", Xk], ["__file", "platform.vue"]]);
    var a8 = {name: "Plus"};
    var vt = c(l());
    var Yk = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, eC = (0, vt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M480 480V128a32 32 0 0 1 64 0v352h352a32 32 0 1 1 0 64H544v352a32 32 0 1 1-64 0V544H128a32 32 0 0 1 0-64h352z"
    }, null, -1), oC = [eC];

    function tC(o, t, r, a, n, s) {
        return (0, vt.openBlock)(), (0, vt.createElementBlock)("svg", Yk, oC)
    }

    var l8 = e(a8, [["render", tC], ["__file", "plus.vue"]]);
    var c8 = {name: "Pointer"};
    var wt = c(l());
    var rC = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, nC = (0, wt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M511.552 128c-35.584 0-64.384 28.8-64.384 64.448v516.48L274.048 570.88a94.272 94.272 0 0 0-112.896-3.456 44.416 44.416 0 0 0-8.96 62.208L332.8 870.4A64 64 0 0 0 384 896h512V575.232a64 64 0 0 0-45.632-61.312l-205.952-61.76A96 96 0 0 1 576 360.192V192.448C576 156.8 547.2 128 511.552 128zM359.04 556.8l24.128 19.2V192.448a128.448 128.448 0 1 1 256.832 0v167.744a32 32 0 0 0 22.784 30.656l206.016 61.76A128 128 0 0 1 960 575.232V896a64 64 0 0 1-64 64H384a128 128 0 0 1-102.4-51.2L101.056 668.032A108.416 108.416 0 0 1 128 512.512a158.272 158.272 0 0 1 185.984 8.32L359.04 556.8z"
    }, null, -1), aC = [nC];

    function lC(o, t, r, a, n, s) {
        return (0, wt.openBlock)(), (0, wt.createElementBlock)("svg", rC, aC)
    }

    var s8 = e(c8, [["render", lC], ["__file", "pointer.vue"]]);
    var m8 = {name: "Position"};
    var Bt = c(l());
    var cC = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, sC = (0, Bt.createElementVNode)("path", {
        fill: "currentColor",
        d: "m249.6 417.088 319.744 43.072 39.168 310.272L845.12 178.88 249.6 417.088zm-129.024 47.168a32 32 0 0 1-7.68-61.44l777.792-311.04a32 32 0 0 1 41.6 41.6l-310.336 775.68a32 32 0 0 1-61.44-7.808L512 516.992l-391.424-52.736z"
    }, null, -1), mC = [sC];

    function pC(o, t, r, a, n, s) {
        return (0, Bt.openBlock)(), (0, Bt.createElementBlock)("svg", cC, mC)
    }

    var p8 = e(m8, [["render", pC], ["__file", "position.vue"]]);
    var _8 = {name: "Postcard"};
    var $e = c(l());
    var _C = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, fC = (0, $e.createElementVNode)("path", {
        fill: "currentColor",
        d: "M160 224a32 32 0 0 0-32 32v512a32 32 0 0 0 32 32h704a32 32 0 0 0 32-32V256a32 32 0 0 0-32-32H160zm0-64h704a96 96 0 0 1 96 96v512a96 96 0 0 1-96 96H160a96 96 0 0 1-96-96V256a96 96 0 0 1 96-96z"
    }, null, -1), iC = (0, $e.createElementVNode)("path", {
        fill: "currentColor",
        d: "M704 320a64 64 0 1 1 0 128 64 64 0 0 1 0-128zM288 448h256q32 0 32 32t-32 32H288q-32 0-32-32t32-32zm0 128h256q32 0 32 32t-32 32H288q-32 0-32-32t32-32z"
    }, null, -1), dC = [fC, iC];

    function uC(o, t, r, a, n, s) {
        return (0, $e.openBlock)(), (0, $e.createElementBlock)("svg", _C, dC)
    }

    var f8 = e(_8, [["render", uC], ["__file", "postcard.vue"]]);
    var i8 = {name: "Pouring"};
    var kt = c(l());
    var hC = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, xC = (0, kt.createElementVNode)("path", {
        fill: "currentColor",
        d: "m739.328 291.328-35.2-6.592-12.8-33.408a192.064 192.064 0 0 0-365.952 23.232l-9.92 40.896-41.472 7.04a176.32 176.32 0 0 0-146.24 173.568c0 97.28 78.72 175.936 175.808 175.936h400a192 192 0 0 0 35.776-380.672zM959.552 480a256 256 0 0 1-256 256h-400A239.808 239.808 0 0 1 63.744 496.192a240.32 240.32 0 0 1 199.488-236.8 256.128 256.128 0 0 1 487.872-30.976A256.064 256.064 0 0 1 959.552 480zM224 800a32 32 0 0 1 32 32v96a32 32 0 1 1-64 0v-96a32 32 0 0 1 32-32zm192 0a32 32 0 0 1 32 32v96a32 32 0 1 1-64 0v-96a32 32 0 0 1 32-32zm192 0a32 32 0 0 1 32 32v96a32 32 0 1 1-64 0v-96a32 32 0 0 1 32-32zm192 0a32 32 0 0 1 32 32v96a32 32 0 1 1-64 0v-96a32 32 0 0 1 32-32z"
    }, null, -1), vC = [xC];

    function wC(o, t, r, a, n, s) {
        return (0, kt.openBlock)(), (0, kt.createElementBlock)("svg", hC, vC)
    }

    var d8 = e(i8, [["render", wC], ["__file", "pouring.vue"]]);
    var u8 = {name: "Present"};
    var m = c(l());
    var BC = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, kC = (0, m.createElementVNode)("path", {
        fill: "currentColor",
        d: "M480 896V640H192v-64h288V320H192v576h288zm64 0h288V320H544v256h288v64H544v256zM128 256h768v672a32 32 0 0 1-32 32H160a32 32 0 0 1-32-32V256z"
    }, null, -1), CC = (0, m.createElementVNode)("path", {
        fill: "currentColor",
        d: "M96 256h832q32 0 32 32t-32 32H96q-32 0-32-32t32-32z"
    }, null, -1), EC = (0, m.createElementVNode)("path", {
        fill: "currentColor",
        d: "M416 256a64 64 0 1 0 0-128 64 64 0 0 0 0 128zm0 64a128 128 0 1 1 0-256 128 128 0 0 1 0 256z"
    }, null, -1), $C = (0, m.createElementVNode)("path", {
        fill: "currentColor",
        d: "M608 256a64 64 0 1 0 0-128 64 64 0 0 0 0 128zm0 64a128 128 0 1 1 0-256 128 128 0 0 1 0 256z"
    }, null, -1), VC = [kC, CC, EC, $C];

    function zC(o, t, r, a, n, s) {
        return (0, m.openBlock)(), (0, m.createElementBlock)("svg", BC, VC)
    }

    var h8 = e(u8, [["render", zC], ["__file", "present.vue"]]);
    var x8 = {name: "PriceTag"};
    var Ve = c(l());
    var gC = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, HC = (0, Ve.createElementVNode)("path", {
        fill: "currentColor",
        d: "M224 318.336V896h576V318.336L552.512 115.84a64 64 0 0 0-81.024 0L224 318.336zM593.024 66.304l259.2 212.096A32 32 0 0 1 864 303.168V928a32 32 0 0 1-32 32H192a32 32 0 0 1-32-32V303.168a32 32 0 0 1 11.712-24.768l259.2-212.096a128 128 0 0 1 162.112 0z"
    }, null, -1), DC = (0, Ve.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 448a64 64 0 1 0 0-128 64 64 0 0 0 0 128zm0 64a128 128 0 1 1 0-256 128 128 0 0 1 0 256z"
    }, null, -1), MC = [HC, DC];

    function NC(o, t, r, a, n, s) {
        return (0, Ve.openBlock)(), (0, Ve.createElementBlock)("svg", gC, MC)
    }

    var v8 = e(x8, [["render", NC], ["__file", "price-tag.vue"]]);
    var w8 = {name: "Printer"};
    var Ct = c(l());
    var yC = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, LC = (0, Ct.createElementVNode)("path", {
        fill: "currentColor",
        d: "M256 768H105.024c-14.272 0-19.456-1.472-24.64-4.288a29.056 29.056 0 0 1-12.16-12.096C65.536 746.432 64 741.248 64 727.04V379.072c0-42.816 4.48-58.304 12.8-73.984 8.384-15.616 20.672-27.904 36.288-36.288 15.68-8.32 31.168-12.8 73.984-12.8H256V64h512v192h68.928c42.816 0 58.304 4.48 73.984 12.8 15.616 8.384 27.904 20.672 36.288 36.288 8.32 15.68 12.8 31.168 12.8 73.984v347.904c0 14.272-1.472 19.456-4.288 24.64a29.056 29.056 0 0 1-12.096 12.16c-5.184 2.752-10.368 4.224-24.64 4.224H768v192H256V768zm64-192v320h384V576H320zm-64 128V512h512v192h128V379.072c0-29.376-1.408-36.48-5.248-43.776a23.296 23.296 0 0 0-10.048-10.048c-7.232-3.84-14.4-5.248-43.776-5.248H187.072c-29.376 0-36.48 1.408-43.776 5.248a23.296 23.296 0 0 0-10.048 10.048c-3.84 7.232-5.248 14.4-5.248 43.776V704h128zm64-448h384V128H320v128zm-64 128h64v64h-64v-64zm128 0h64v64h-64v-64z"
    }, null, -1), AC = [LC];

    function SC(o, t, r, a, n, s) {
        return (0, Ct.openBlock)(), (0, Ct.createElementBlock)("svg", yC, AC)
    }

    var B8 = e(w8, [["render", SC], ["__file", "printer.vue"]]);
    var k8 = {name: "Promotion"};
    var Et = c(l());
    var qC = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, FC = (0, Et.createElementVNode)("path", {
        fill: "currentColor",
        d: "m64 448 832-320-128 704-446.08-243.328L832 192 242.816 545.472 64 448zm256 512V657.024L512 768 320 960z"
    }, null, -1), bC = [FC];

    function PC(o, t, r, a, n, s) {
        return (0, Et.openBlock)(), (0, Et.createElementBlock)("svg", qC, bC)
    }

    var C8 = e(k8, [["render", PC], ["__file", "promotion.vue"]]);
    var E8 = {name: "QuartzWatch"};
    var H = c(l());
    var RC = {
        xmlns: "http://www.w3.org/2000/svg",
        "xml:space": "preserve",
        style: {"enable-background": "new 0 0 1024 1024"},
        viewBox: "0 0 1024 1024"
    }, TC = (0, H.createElementVNode)("path", {
        fill: "currentColor",
        d: "M422.02 602.01v-.03c-6.68-5.99-14.35-8.83-23.01-8.51-8.67.32-16.17 3.66-22.5 10.02-6.33 6.36-9.5 13.7-9.5 22.02s3 15.82 8.99 22.5c8.68 8.68 19.02 11.35 31.01 8s19.49-10.85 22.5-22.5c3.01-11.65.51-22.15-7.49-31.49v-.01zM384 512c0-9.35-3-17.02-8.99-23.01-6-5.99-13.66-8.99-23.01-8.99-9.35 0-17.02 3-23.01 8.99-5.99 6-8.99 13.66-8.99 23.01s3 17.02 8.99 23.01c6 5.99 13.66 8.99 23.01 8.99 9.35 0 17.02-3 23.01-8.99 5.99-6 8.99-13.67 8.99-23.01zm6.53-82.49c11.65 3.01 22.15.51 31.49-7.49h.04c5.99-6.68 8.83-14.34 8.51-23.01-.32-8.67-3.66-16.16-10.02-22.5-6.36-6.33-13.7-9.5-22.02-9.5s-15.82 3-22.5 8.99c-8.68 8.69-11.35 19.02-8 31.01 3.35 11.99 10.85 19.49 22.5 22.5zm242.94 0c11.67-3.03 19.01-10.37 22.02-22.02 3.01-11.65.51-22.15-7.49-31.49h.01c-6.68-5.99-14.18-8.99-22.5-8.99s-15.66 3.16-22.02 9.5c-6.36 6.34-9.7 13.84-10.02 22.5-.32 8.66 2.52 16.33 8.51 23.01 9.32 8.02 19.82 10.52 31.49 7.49zM512 640c-9.35 0-17.02 3-23.01 8.99-5.99 6-8.99 13.66-8.99 23.01s3 17.02 8.99 23.01c6 5.99 13.67 8.99 23.01 8.99 9.35 0 17.02-3 23.01-8.99 5.99-6 8.99-13.66 8.99-23.01s-3-17.02-8.99-23.01c-6-5.99-13.66-8.99-23.01-8.99zm183.01-151.01c-6-5.99-13.66-8.99-23.01-8.99s-17.02 3-23.01 8.99c-5.99 6-8.99 13.66-8.99 23.01s3 17.02 8.99 23.01c6 5.99 13.66 8.99 23.01 8.99s17.02-3 23.01-8.99c5.99-6 8.99-13.67 8.99-23.01 0-9.35-3-17.02-8.99-23.01z"
    }, null, -1), OC = (0, H.createElementVNode)("path", {
        fill: "currentColor",
        d: "M832 512c-2-90.67-33.17-166.17-93.5-226.5-20.43-20.42-42.6-37.49-66.5-51.23V64H352v170.26c-23.9 13.74-46.07 30.81-66.5 51.24-60.33 60.33-91.49 135.83-93.5 226.5 2 90.67 33.17 166.17 93.5 226.5 20.43 20.43 42.6 37.5 66.5 51.24V960h320V789.74c23.9-13.74 46.07-30.81 66.5-51.24 60.33-60.34 91.49-135.83 93.5-226.5zM416 128h192v78.69c-29.85-9.03-61.85-13.93-96-14.69-34.15.75-66.15 5.65-96 14.68V128zm192 768H416v-78.68c29.85 9.03 61.85 13.93 96 14.68 34.15-.75 66.15-5.65 96-14.68V896zm-96-128c-72.66-2.01-132.99-27.01-180.99-75.01S258.01 584.66 256 512c2.01-72.66 27.01-132.99 75.01-180.99S439.34 258.01 512 256c72.66 2.01 132.99 27.01 180.99 75.01S765.99 439.34 768 512c-2.01 72.66-27.01 132.99-75.01 180.99S584.66 765.99 512 768z"
    }, null, -1), GC = (0, H.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 320c-9.35 0-17.02 3-23.01 8.99-5.99 6-8.99 13.66-8.99 23.01 0 9.35 3 17.02 8.99 23.01 6 5.99 13.67 8.99 23.01 8.99 9.35 0 17.02-3 23.01-8.99 5.99-6 8.99-13.66 8.99-23.01 0-9.35-3-17.02-8.99-23.01-6-5.99-13.66-8.99-23.01-8.99zm112.99 273.5c-8.66-.32-16.33 2.52-23.01 8.51-7.98 9.32-10.48 19.82-7.49 31.49s10.49 19.17 22.5 22.5 22.35.66 31.01-8v.04c5.99-6.68 8.99-14.18 8.99-22.5s-3.16-15.66-9.5-22.02-13.84-9.7-22.5-10.02z"
    }, null, -1), UC = [TC, OC, GC];

    function WC(o, t, r, a, n, s) {
        return (0, H.openBlock)(), (0, H.createElementBlock)("svg", RC, UC)
    }

    var $8 = e(E8, [["render", WC], ["__file", "quartz-watch.vue"]]);
    var V8 = {name: "QuestionFilled"};
    var $t = c(l());
    var IC = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, ZC = (0, $t.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 64a448 448 0 1 1 0 896 448 448 0 0 1 0-896zm23.744 191.488c-52.096 0-92.928 14.784-123.2 44.352-30.976 29.568-45.76 70.4-45.76 122.496h80.256c0-29.568 5.632-52.8 17.6-68.992 13.376-19.712 35.2-28.864 66.176-28.864 23.936 0 42.944 6.336 56.32 19.712 12.672 13.376 19.712 31.68 19.712 54.912 0 17.6-6.336 34.496-19.008 49.984l-8.448 9.856c-45.76 40.832-73.216 70.4-82.368 89.408-9.856 19.008-14.08 42.24-14.08 68.992v9.856h80.96v-9.856c0-16.896 3.52-31.68 10.56-45.76 6.336-12.672 15.488-24.64 28.16-35.2 33.792-29.568 54.208-48.576 60.544-55.616 16.896-22.528 26.048-51.392 26.048-86.592 0-42.944-14.08-76.736-42.24-101.376-28.16-25.344-65.472-37.312-111.232-37.312zm-12.672 406.208a54.272 54.272 0 0 0-38.72 14.784 49.408 49.408 0 0 0-15.488 38.016c0 15.488 4.928 28.16 15.488 38.016A54.848 54.848 0 0 0 523.072 768c15.488 0 28.16-4.928 38.72-14.784a51.52 51.52 0 0 0 16.192-38.72 51.968 51.968 0 0 0-15.488-38.016 55.936 55.936 0 0 0-39.424-14.784z"
    }, null, -1), KC = [ZC];

    function QC(o, t, r, a, n, s) {
        return (0, $t.openBlock)(), (0, $t.createElementBlock)("svg", IC, KC)
    }

    var z8 = e(V8, [["render", QC], ["__file", "question-filled.vue"]]);
    var g8 = {name: "Rank"};
    var Vt = c(l());
    var jC = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, JC = (0, Vt.createElementVNode)("path", {
        fill: "currentColor",
        d: "m186.496 544 41.408 41.344a32 32 0 1 1-45.248 45.312l-96-96a32 32 0 0 1 0-45.312l96-96a32 32 0 1 1 45.248 45.312L186.496 480h290.816V186.432l-41.472 41.472a32 32 0 1 1-45.248-45.184l96-96.128a32 32 0 0 1 45.312 0l96 96.064a32 32 0 0 1-45.248 45.184l-41.344-41.28V480H832l-41.344-41.344a32 32 0 0 1 45.248-45.312l96 96a32 32 0 0 1 0 45.312l-96 96a32 32 0 0 1-45.248-45.312L832 544H541.312v293.44l41.344-41.28a32 32 0 1 1 45.248 45.248l-96 96a32 32 0 0 1-45.312 0l-96-96a32 32 0 1 1 45.312-45.248l41.408 41.408V544H186.496z"
    }, null, -1), XC = [JC];

    function YC(o, t, r, a, n, s) {
        return (0, Vt.openBlock)(), (0, Vt.createElementBlock)("svg", jC, XC)
    }

    var H8 = e(g8, [["render", YC], ["__file", "rank.vue"]]);
    var D8 = {name: "ReadingLamp"};
    var ze = c(l());
    var eE = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, oE = (0, ze.createElementVNode)("path", {
        fill: "currentColor",
        d: "M352 896h320q32 0 32 32t-32 32H352q-32 0-32-32t32-32zm-44.672-768-99.52 448h608.384l-99.52-448H307.328zm-25.6-64h460.608a32 32 0 0 1 31.232 25.088l113.792 512A32 32 0 0 1 856.128 640H167.872a32 32 0 0 1-31.232-38.912l113.792-512A32 32 0 0 1 281.664 64z"
    }, null, -1), tE = (0, ze.createElementVNode)("path", {
        fill: "currentColor",
        d: "M672 576q32 0 32 32v128q0 32-32 32t-32-32V608q0-32 32-32zm-192-.064h64V960h-64z"
    }, null, -1), rE = [oE, tE];

    function nE(o, t, r, a, n, s) {
        return (0, ze.openBlock)(), (0, ze.createElementBlock)("svg", eE, rE)
    }

    var M8 = e(D8, [["render", nE], ["__file", "reading-lamp.vue"]]);
    var N8 = {name: "Reading"};
    var ge = c(l());
    var aE = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, lE = (0, ge.createElementVNode)("path", {
            fill: "currentColor",
            d: "m512 863.36 384-54.848v-638.72L525.568 222.72a96 96 0 0 1-27.136 0L128 169.792v638.72l384 54.848zM137.024 106.432l370.432 52.928a32 32 0 0 0 9.088 0l370.432-52.928A64 64 0 0 1 960 169.792v638.72a64 64 0 0 1-54.976 63.36l-388.48 55.488a32 32 0 0 1-9.088 0l-388.48-55.488A64 64 0 0 1 64 808.512v-638.72a64 64 0 0 1 73.024-63.36z"
        }, null, -1), cE = (0, ge.createElementVNode)("path", {fill: "currentColor", d: "M480 192h64v704h-64z"}, null, -1),
        sE = [lE, cE];

    function mE(o, t, r, a, n, s) {
        return (0, ge.openBlock)(), (0, ge.createElementBlock)("svg", aE, sE)
    }

    var y8 = e(N8, [["render", mE], ["__file", "reading.vue"]]);
    var L8 = {name: "RefreshLeft"};
    var zt = c(l());
    var pE = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, _E = (0, zt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M289.088 296.704h92.992a32 32 0 0 1 0 64H232.96a32 32 0 0 1-32-32V179.712a32 32 0 0 1 64 0v50.56a384 384 0 0 1 643.84 282.88 384 384 0 0 1-383.936 384 384 384 0 0 1-384-384h64a320 320 0 1 0 640 0 320 320 0 0 0-555.712-216.448z"
    }, null, -1), fE = [_E];

    function iE(o, t, r, a, n, s) {
        return (0, zt.openBlock)(), (0, zt.createElementBlock)("svg", pE, fE)
    }

    var A8 = e(L8, [["render", iE], ["__file", "refresh-left.vue"]]);
    var S8 = {name: "RefreshRight"};
    var gt = c(l());
    var dE = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, uE = (0, gt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M784.512 230.272v-50.56a32 32 0 1 1 64 0v149.056a32 32 0 0 1-32 32H667.52a32 32 0 1 1 0-64h92.992A320 320 0 1 0 524.8 833.152a320 320 0 0 0 320-320h64a384 384 0 0 1-384 384 384 384 0 0 1-384-384 384 384 0 0 1 643.712-282.88z"
    }, null, -1), hE = [uE];

    function xE(o, t, r, a, n, s) {
        return (0, gt.openBlock)(), (0, gt.createElementBlock)("svg", dE, hE)
    }

    var q8 = e(S8, [["render", xE], ["__file", "refresh-right.vue"]]);
    var F8 = {name: "Refresh"};
    var Ht = c(l());
    var vE = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, wE = (0, Ht.createElementVNode)("path", {
        fill: "currentColor",
        d: "M771.776 794.88A384 384 0 0 1 128 512h64a320 320 0 0 0 555.712 216.448H654.72a32 32 0 1 1 0-64h149.056a32 32 0 0 1 32 32v148.928a32 32 0 1 1-64 0v-50.56zM276.288 295.616h92.992a32 32 0 0 1 0 64H220.16a32 32 0 0 1-32-32V178.56a32 32 0 0 1 64 0v50.56A384 384 0 0 1 896.128 512h-64a320 320 0 0 0-555.776-216.384z"
    }, null, -1), BE = [wE];

    function kE(o, t, r, a, n, s) {
        return (0, Ht.openBlock)(), (0, Ht.createElementBlock)("svg", vE, BE)
    }

    var b8 = e(F8, [["render", kE], ["__file", "refresh.vue"]]);
    var P8 = {name: "Refrigerator"};
    var Dt = c(l());
    var CE = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, EE = (0, Dt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M256 448h512V160a32 32 0 0 0-32-32H288a32 32 0 0 0-32 32v288zm0 64v352a32 32 0 0 0 32 32h448a32 32 0 0 0 32-32V512H256zm32-448h448a96 96 0 0 1 96 96v704a96 96 0 0 1-96 96H288a96 96 0 0 1-96-96V160a96 96 0 0 1 96-96zm32 224h64v96h-64v-96zm0 288h64v96h-64v-96z"
    }, null, -1), $E = [EE];

    function VE(o, t, r, a, n, s) {
        return (0, Dt.openBlock)(), (0, Dt.createElementBlock)("svg", CE, $E)
    }

    var R8 = e(P8, [["render", VE], ["__file", "refrigerator.vue"]]);
    var T8 = {name: "RemoveFilled"};
    var Mt = c(l());
    var zE = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, gE = (0, Mt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 64a448 448 0 1 1 0 896 448 448 0 0 1 0-896zM288 512a38.4 38.4 0 0 0 38.4 38.4h371.2a38.4 38.4 0 0 0 0-76.8H326.4A38.4 38.4 0 0 0 288 512z"
    }, null, -1), HE = [gE];

    function DE(o, t, r, a, n, s) {
        return (0, Mt.openBlock)(), (0, Mt.createElementBlock)("svg", zE, HE)
    }

    var O8 = e(T8, [["render", DE], ["__file", "remove-filled.vue"]]);
    var G8 = {name: "Remove"};
    var He = c(l());
    var ME = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, NE = (0, He.createElementVNode)("path", {
        fill: "currentColor",
        d: "M352 480h320a32 32 0 1 1 0 64H352a32 32 0 0 1 0-64z"
    }, null, -1), yE = (0, He.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 896a384 384 0 1 0 0-768 384 384 0 0 0 0 768zm0 64a448 448 0 1 1 0-896 448 448 0 0 1 0 896z"
    }, null, -1), LE = [NE, yE];

    function AE(o, t, r, a, n, s) {
        return (0, He.openBlock)(), (0, He.createElementBlock)("svg", ME, LE)
    }

    var U8 = e(G8, [["render", AE], ["__file", "remove.vue"]]);
    var W8 = {name: "Right"};
    var Nt = c(l());
    var SE = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, qE = (0, Nt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M754.752 480H160a32 32 0 1 0 0 64h594.752L521.344 777.344a32 32 0 0 0 45.312 45.312l288-288a32 32 0 0 0 0-45.312l-288-288a32 32 0 1 0-45.312 45.312L754.752 480z"
    }, null, -1), FE = [qE];

    function bE(o, t, r, a, n, s) {
        return (0, Nt.openBlock)(), (0, Nt.createElementBlock)("svg", SE, FE)
    }

    var I8 = e(W8, [["render", bE], ["__file", "right.vue"]]);
    var Z8 = {name: "ScaleToOriginal"};
    var yt = c(l());
    var PE = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, RE = (0, yt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M813.176 180.706a60.235 60.235 0 0 1 60.236 60.235v481.883a60.235 60.235 0 0 1-60.236 60.235H210.824a60.235 60.235 0 0 1-60.236-60.235V240.94a60.235 60.235 0 0 1 60.236-60.235h602.352zm0-60.235H210.824A120.47 120.47 0 0 0 90.353 240.94v481.883a120.47 120.47 0 0 0 120.47 120.47h602.353a120.47 120.47 0 0 0 120.471-120.47V240.94a120.47 120.47 0 0 0-120.47-120.47zm-120.47 180.705a30.118 30.118 0 0 0-30.118 30.118v301.177a30.118 30.118 0 0 0 60.236 0V331.294a30.118 30.118 0 0 0-30.118-30.118zm-361.412 0a30.118 30.118 0 0 0-30.118 30.118v301.177a30.118 30.118 0 1 0 60.236 0V331.294a30.118 30.118 0 0 0-30.118-30.118zM512 361.412a30.118 30.118 0 0 0-30.118 30.117v30.118a30.118 30.118 0 0 0 60.236 0V391.53A30.118 30.118 0 0 0 512 361.412zM512 512a30.118 30.118 0 0 0-30.118 30.118v30.117a30.118 30.118 0 0 0 60.236 0v-30.117A30.118 30.118 0 0 0 512 512z"
    }, null, -1), TE = [RE];

    function OE(o, t, r, a, n, s) {
        return (0, yt.openBlock)(), (0, yt.createElementBlock)("svg", PE, TE)
    }

    var K8 = e(Z8, [["render", OE], ["__file", "scale-to-original.vue"]]);
    var Q8 = {name: "School"};
    var D = c(l());
    var GE = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, UE = (0, D.createElementVNode)("path", {
        fill: "currentColor",
        d: "M224 128v704h576V128H224zm-32-64h640a32 32 0 0 1 32 32v768a32 32 0 0 1-32 32H192a32 32 0 0 1-32-32V96a32 32 0 0 1 32-32z"
    }, null, -1), WE = (0, D.createElementVNode)("path", {
        fill: "currentColor",
        d: "M64 832h896v64H64zm256-640h128v96H320z"
    }, null, -1), IE = (0, D.createElementVNode)("path", {
        fill: "currentColor",
        d: "M384 832h256v-64a128 128 0 1 0-256 0v64zm128-256a192 192 0 0 1 192 192v128H320V768a192 192 0 0 1 192-192zM320 384h128v96H320zm256-192h128v96H576zm0 192h128v96H576z"
    }, null, -1), ZE = [UE, WE, IE];

    function KE(o, t, r, a, n, s) {
        return (0, D.openBlock)(), (0, D.createElementBlock)("svg", GE, ZE)
    }

    var j8 = e(Q8, [["render", KE], ["__file", "school.vue"]]);
    var J8 = {name: "Scissor"};
    var Lt = c(l());
    var QE = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, jE = (0, Lt.createElementVNode)("path", {
        fill: "currentColor",
        d: "m512.064 578.368-106.88 152.768a160 160 0 1 1-23.36-78.208L472.96 522.56 196.864 128.256a32 32 0 1 1 52.48-36.736l393.024 561.344a160 160 0 1 1-23.36 78.208l-106.88-152.704zm54.4-189.248 208.384-297.6a32 32 0 0 1 52.48 36.736l-221.76 316.672-39.04-55.808zm-376.32 425.856a96 96 0 1 0 110.144-157.248 96 96 0 0 0-110.08 157.248zm643.84 0a96 96 0 1 0-110.08-157.248 96 96 0 0 0 110.08 157.248z"
    }, null, -1), JE = [jE];

    function XE(o, t, r, a, n, s) {
        return (0, Lt.openBlock)(), (0, Lt.createElementBlock)("svg", QE, JE)
    }

    var X8 = e(J8, [["render", XE], ["__file", "scissor.vue"]]);
    var Y8 = {name: "Search"};
    var At = c(l());
    var YE = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, e$ = (0, At.createElementVNode)("path", {
        fill: "currentColor",
        d: "m795.904 750.72 124.992 124.928a32 32 0 0 1-45.248 45.248L750.656 795.904a416 416 0 1 1 45.248-45.248zM480 832a352 352 0 1 0 0-704 352 352 0 0 0 0 704z"
    }, null, -1), o$ = [e$];

    function t$(o, t, r, a, n, s) {
        return (0, At.openBlock)(), (0, At.createElementBlock)("svg", YE, o$)
    }

    var el = e(Y8, [["render", t$], ["__file", "search.vue"]]);
    var ol = {name: "Select"};
    var St = c(l());
    var r$ = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, n$ = (0, St.createElementVNode)("path", {
        fill: "currentColor",
        d: "M77.248 415.04a64 64 0 0 1 90.496 0l226.304 226.304L846.528 188.8a64 64 0 1 1 90.56 90.496l-543.04 543.04-316.8-316.8a64 64 0 0 1 0-90.496z"
    }, null, -1), a$ = [n$];

    function l$(o, t, r, a, n, s) {
        return (0, St.openBlock)(), (0, St.createElementBlock)("svg", r$, a$)
    }

    var tl = e(ol, [["render", l$], ["__file", "select.vue"]]);
    var rl = {name: "Sell"};
    var qt = c(l());
    var c$ = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, s$ = (0, qt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M704 288h131.072a32 32 0 0 1 31.808 28.8L886.4 512h-64.384l-16-160H704v96a32 32 0 1 1-64 0v-96H384v96a32 32 0 0 1-64 0v-96H217.92l-51.2 512H512v64H131.328a32 32 0 0 1-31.808-35.2l57.6-576a32 32 0 0 1 31.808-28.8H320v-22.336C320 154.688 405.504 64 512 64s192 90.688 192 201.664v22.4zm-64 0v-22.336C640 189.248 582.272 128 512 128c-70.272 0-128 61.248-128 137.664v22.4h256zm201.408 483.84L768 698.496V928a32 32 0 1 1-64 0V698.496l-73.344 73.344a32 32 0 1 1-45.248-45.248l128-128a32 32 0 0 1 45.248 0l128 128a32 32 0 1 1-45.248 45.248z"
    }, null, -1), m$ = [s$];

    function p$(o, t, r, a, n, s) {
        return (0, qt.openBlock)(), (0, qt.createElementBlock)("svg", c$, m$)
    }

    var nl = e(rl, [["render", p$], ["__file", "sell.vue"]]);
    var al = {name: "SemiSelect"};
    var Ft = c(l());
    var _$ = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, f$ = (0, Ft.createElementVNode)("path", {
        fill: "currentColor",
        d: "M128 448h768q64 0 64 64t-64 64H128q-64 0-64-64t64-64z"
    }, null, -1), i$ = [f$];

    function d$(o, t, r, a, n, s) {
        return (0, Ft.openBlock)(), (0, Ft.createElementBlock)("svg", _$, i$)
    }

    var ll = e(al, [["render", d$], ["__file", "semi-select.vue"]]);
    var cl = {name: "Service"};
    var bt = c(l());
    var u$ = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, h$ = (0, bt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M864 409.6a192 192 0 0 1-37.888 349.44A256.064 256.064 0 0 1 576 960h-96a32 32 0 1 1 0-64h96a192.064 192.064 0 0 0 181.12-128H736a32 32 0 0 1-32-32V416a32 32 0 0 1 32-32h32c10.368 0 20.544.832 30.528 2.432a288 288 0 0 0-573.056 0A193.235 193.235 0 0 1 256 384h32a32 32 0 0 1 32 32v320a32 32 0 0 1-32 32h-32a192 192 0 0 1-96-358.4 352 352 0 0 1 704 0zM256 448a128 128 0 1 0 0 256V448zm640 128a128 128 0 0 0-128-128v256a128 128 0 0 0 128-128z"
    }, null, -1), x$ = [h$];

    function v$(o, t, r, a, n, s) {
        return (0, bt.openBlock)(), (0, bt.createElementBlock)("svg", u$, x$)
    }

    var sl = e(cl, [["render", v$], ["__file", "service.vue"]]);
    var ml = {name: "SetUp"};
    var p = c(l());
    var w$ = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, B$ = (0, p.createElementVNode)("path", {
        fill: "currentColor",
        d: "M224 160a64 64 0 0 0-64 64v576a64 64 0 0 0 64 64h576a64 64 0 0 0 64-64V224a64 64 0 0 0-64-64H224zm0-64h576a128 128 0 0 1 128 128v576a128 128 0 0 1-128 128H224A128 128 0 0 1 96 800V224A128 128 0 0 1 224 96z"
    }, null, -1), k$ = (0, p.createElementVNode)("path", {
        fill: "currentColor",
        d: "M384 416a64 64 0 1 0 0-128 64 64 0 0 0 0 128zm0 64a128 128 0 1 1 0-256 128 128 0 0 1 0 256z"
    }, null, -1), C$ = (0, p.createElementVNode)("path", {
        fill: "currentColor",
        d: "M480 320h256q32 0 32 32t-32 32H480q-32 0-32-32t32-32zm160 416a64 64 0 1 0 0-128 64 64 0 0 0 0 128zm0 64a128 128 0 1 1 0-256 128 128 0 0 1 0 256z"
    }, null, -1), E$ = (0, p.createElementVNode)("path", {
        fill: "currentColor",
        d: "M288 640h256q32 0 32 32t-32 32H288q-32 0-32-32t32-32z"
    }, null, -1), $$ = [B$, k$, C$, E$];

    function V$(o, t, r, a, n, s) {
        return (0, p.openBlock)(), (0, p.createElementBlock)("svg", w$, $$)
    }

    var pl = e(ml, [["render", V$], ["__file", "set-up.vue"]]);
    var _l = {name: "Setting"};
    var Pt = c(l());
    var z$ = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, g$ = (0, Pt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M600.704 64a32 32 0 0 1 30.464 22.208l35.2 109.376c14.784 7.232 28.928 15.36 42.432 24.512l112.384-24.192a32 32 0 0 1 34.432 15.36L944.32 364.8a32 32 0 0 1-4.032 37.504l-77.12 85.12a357.12 357.12 0 0 1 0 49.024l77.12 85.248a32 32 0 0 1 4.032 37.504l-88.704 153.6a32 32 0 0 1-34.432 15.296L708.8 803.904c-13.44 9.088-27.648 17.28-42.368 24.512l-35.264 109.376A32 32 0 0 1 600.704 960H423.296a32 32 0 0 1-30.464-22.208L357.696 828.48a351.616 351.616 0 0 1-42.56-24.64l-112.32 24.256a32 32 0 0 1-34.432-15.36L79.68 659.2a32 32 0 0 1 4.032-37.504l77.12-85.248a357.12 357.12 0 0 1 0-48.896l-77.12-85.248A32 32 0 0 1 79.68 364.8l88.704-153.6a32 32 0 0 1 34.432-15.296l112.32 24.256c13.568-9.152 27.776-17.408 42.56-24.64l35.2-109.312A32 32 0 0 1 423.232 64H600.64zm-23.424 64H446.72l-36.352 113.088-24.512 11.968a294.113 294.113 0 0 0-34.816 20.096l-22.656 15.36-116.224-25.088-65.28 113.152 79.68 88.192-1.92 27.136a293.12 293.12 0 0 0 0 40.192l1.92 27.136-79.808 88.192 65.344 113.152 116.224-25.024 22.656 15.296a294.113 294.113 0 0 0 34.816 20.096l24.512 11.968L446.72 896h130.688l36.48-113.152 24.448-11.904a288.282 288.282 0 0 0 34.752-20.096l22.592-15.296 116.288 25.024 65.28-113.152-79.744-88.192 1.92-27.136a293.12 293.12 0 0 0 0-40.256l-1.92-27.136 79.808-88.128-65.344-113.152-116.288 24.96-22.592-15.232a287.616 287.616 0 0 0-34.752-20.096l-24.448-11.904L577.344 128zM512 320a192 192 0 1 1 0 384 192 192 0 0 1 0-384zm0 64a128 128 0 1 0 0 256 128 128 0 0 0 0-256z"
    }, null, -1), H$ = [g$];

    function D$(o, t, r, a, n, s) {
        return (0, Pt.openBlock)(), (0, Pt.createElementBlock)("svg", z$, H$)
    }

    var fl = e(_l, [["render", D$], ["__file", "setting.vue"]]);
    var il = {name: "Share"};
    var Rt = c(l());
    var M$ = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, N$ = (0, Rt.createElementVNode)("path", {
        fill: "currentColor",
        d: "m679.872 348.8-301.76 188.608a127.808 127.808 0 0 1 5.12 52.16l279.936 104.96a128 128 0 1 1-22.464 59.904l-279.872-104.96a128 128 0 1 1-16.64-166.272l301.696-188.608a128 128 0 1 1 33.92 54.272z"
    }, null, -1), y$ = [N$];

    function L$(o, t, r, a, n, s) {
        return (0, Rt.openBlock)(), (0, Rt.createElementBlock)("svg", M$, y$)
    }

    var dl = e(il, [["render", L$], ["__file", "share.vue"]]);
    var ul = {name: "Ship"};
    var Tt = c(l());
    var A$ = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, S$ = (0, Tt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 386.88V448h405.568a32 32 0 0 1 30.72 40.768l-76.48 267.968A192 192 0 0 1 687.168 896H336.832a192 192 0 0 1-184.64-139.264L75.648 488.768A32 32 0 0 1 106.368 448H448V117.888a32 32 0 0 1 47.36-28.096l13.888 7.616L512 96v2.88l231.68 126.4a32 32 0 0 1-2.048 57.216L512 386.88zm0-70.272 144.768-65.792L512 171.84v144.768zM512 512H148.864l18.24 64H856.96l18.24-64H512zM185.408 640l28.352 99.2A128 128 0 0 0 336.832 832h350.336a128 128 0 0 0 123.072-92.8l28.352-99.2H185.408z"
    }, null, -1), q$ = [S$];

    function F$(o, t, r, a, n, s) {
        return (0, Tt.openBlock)(), (0, Tt.createElementBlock)("svg", A$, q$)
    }

    var hl = e(ul, [["render", F$], ["__file", "ship.vue"]]);
    var xl = {name: "Shop"};
    var Ot = c(l());
    var b$ = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, P$ = (0, Ot.createElementVNode)("path", {
        fill: "currentColor",
        d: "M704 704h64v192H256V704h64v64h384v-64zm188.544-152.192C894.528 559.616 896 567.616 896 576a96 96 0 1 1-192 0 96 96 0 1 1-192 0 96 96 0 1 1-192 0 96 96 0 1 1-192 0c0-8.384 1.408-16.384 3.392-24.192L192 128h640l60.544 423.808z"
    }, null, -1), R$ = [P$];

    function T$(o, t, r, a, n, s) {
        return (0, Ot.openBlock)(), (0, Ot.createElementBlock)("svg", b$, R$)
    }

    var vl = e(xl, [["render", T$], ["__file", "shop.vue"]]);
    var wl = {name: "ShoppingBag"};
    var De = c(l());
    var O$ = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, G$ = (0, De.createElementVNode)("path", {
            fill: "currentColor",
            d: "M704 320v96a32 32 0 0 1-32 32h-32V320H384v128h-32a32 32 0 0 1-32-32v-96H192v576h640V320H704zm-384-64a192 192 0 1 1 384 0h160a32 32 0 0 1 32 32v640a32 32 0 0 1-32 32H160a32 32 0 0 1-32-32V288a32 32 0 0 1 32-32h160zm64 0h256a128 128 0 1 0-256 0z"
        }, null, -1), U$ = (0, De.createElementVNode)("path", {fill: "currentColor", d: "M192 704h640v64H192z"}, null, -1),
        W$ = [G$, U$];

    function I$(o, t, r, a, n, s) {
        return (0, De.openBlock)(), (0, De.createElementBlock)("svg", O$, W$)
    }

    var Bl = e(wl, [["render", I$], ["__file", "shopping-bag.vue"]]);
    var kl = {name: "ShoppingCartFull"};
    var Me = c(l());
    var Z$ = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, K$ = (0, Me.createElementVNode)("path", {
        fill: "currentColor",
        d: "M432 928a48 48 0 1 1 0-96 48 48 0 0 1 0 96zm320 0a48 48 0 1 1 0-96 48 48 0 0 1 0 96zM96 128a32 32 0 0 1 0-64h160a32 32 0 0 1 31.36 25.728L320.64 256H928a32 32 0 0 1 31.296 38.72l-96 448A32 32 0 0 1 832 768H384a32 32 0 0 1-31.36-25.728L229.76 128H96zm314.24 576h395.904l82.304-384H333.44l76.8 384z"
    }, null, -1), Q$ = (0, Me.createElementVNode)("path", {
        fill: "currentColor",
        d: "M699.648 256 608 145.984 516.352 256h183.296zm-140.8-151.04a64 64 0 0 1 98.304 0L836.352 320H379.648l179.2-215.04z"
    }, null, -1), j$ = [K$, Q$];

    function J$(o, t, r, a, n, s) {
        return (0, Me.openBlock)(), (0, Me.createElementBlock)("svg", Z$, j$)
    }

    var Cl = e(kl, [["render", J$], ["__file", "shopping-cart-full.vue"]]);
    var El = {name: "ShoppingCart"};
    var Gt = c(l());
    var X$ = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Y$ = (0, Gt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M432 928a48 48 0 1 1 0-96 48 48 0 0 1 0 96zm320 0a48 48 0 1 1 0-96 48 48 0 0 1 0 96zM96 128a32 32 0 0 1 0-64h160a32 32 0 0 1 31.36 25.728L320.64 256H928a32 32 0 0 1 31.296 38.72l-96 448A32 32 0 0 1 832 768H384a32 32 0 0 1-31.36-25.728L229.76 128H96zm314.24 576h395.904l82.304-384H333.44l76.8 384z"
    }, null, -1), eV = [Y$];

    function oV(o, t, r, a, n, s) {
        return (0, Gt.openBlock)(), (0, Gt.createElementBlock)("svg", X$, eV)
    }

    var $l = e(El, [["render", oV], ["__file", "shopping-cart.vue"]]);
    var Vl = {name: "ShoppingTrolley"};
    var Ut = c(l());
    var tV = {
        xmlns: "http://www.w3.org/2000/svg",
        "xml:space": "preserve",
        style: {"enable-background": "new 0 0 1024 1024"},
        viewBox: "0 0 1024 1024"
    }, rV = (0, Ut.createElementVNode)("path", {
        fill: "currentColor",
        d: "M368 833c-13.3 0-24.5 4.5-33.5 13.5S321 866.7 321 880s4.5 24.5 13.5 33.5 20.2 13.8 33.5 14.5c13.3-.7 24.5-5.5 33.5-14.5S415 893.3 415 880s-4.5-24.5-13.5-33.5S381.3 833 368 833zm439-193c7.4 0 13.8-2.2 19.5-6.5S836 623.3 838 616l112-448c2-10-.2-19.2-6.5-27.5S929 128 919 128H96c-9.3 0-17 3-23 9s-9 13.7-9 23 3 17 9 23 13.7 9 23 9h96v576h672c9.3 0 17-3 23-9s9-13.7 9-23-3-17-9-23-13.7-9-23-9H256v-64h551zM256 192h622l-96 384H256V192zm432 641c-13.3 0-24.5 4.5-33.5 13.5S641 866.7 641 880s4.5 24.5 13.5 33.5 20.2 13.8 33.5 14.5c13.3-.7 24.5-5.5 33.5-14.5S735 893.3 735 880s-4.5-24.5-13.5-33.5S701.3 833 688 833z"
    }, null, -1), nV = [rV];

    function aV(o, t, r, a, n, s) {
        return (0, Ut.openBlock)(), (0, Ut.createElementBlock)("svg", tV, nV)
    }

    var zl = e(Vl, [["render", aV], ["__file", "shopping-trolley.vue"]]);
    var gl = {name: "Smoking"};
    var Ne = c(l());
    var lV = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, cV = (0, Ne.createElementVNode)("path", {
        fill: "currentColor",
        d: "M256 576v128h640V576H256zm-32-64h704a32 32 0 0 1 32 32v192a32 32 0 0 1-32 32H224a32 32 0 0 1-32-32V544a32 32 0 0 1 32-32z"
    }, null, -1), sV = (0, Ne.createElementVNode)("path", {
        fill: "currentColor",
        d: "M704 576h64v128h-64zM256 64h64v320h-64zM128 192h64v192h-64zM64 512h64v256H64z"
    }, null, -1), mV = [cV, sV];

    function pV(o, t, r, a, n, s) {
        return (0, Ne.openBlock)(), (0, Ne.createElementBlock)("svg", lV, mV)
    }

    var Hl = e(gl, [["render", pV], ["__file", "smoking.vue"]]);
    var Dl = {name: "Soccer"};
    var Wt = c(l());
    var _V = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, fV = (0, Wt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M418.496 871.04 152.256 604.8c-16.512 94.016-2.368 178.624 42.944 224 44.928 44.928 129.344 58.752 223.296 42.24zm72.32-18.176a573.056 573.056 0 0 0 224.832-137.216 573.12 573.12 0 0 0 137.216-224.832L533.888 171.84a578.56 578.56 0 0 0-227.52 138.496A567.68 567.68 0 0 0 170.432 532.48l320.384 320.384zM871.04 418.496c16.512-93.952 2.688-178.368-42.24-223.296-44.544-44.544-128.704-58.048-222.592-41.536L871.04 418.496zM149.952 874.048c-112.96-112.96-88.832-408.96 111.168-608.96C461.056 65.152 760.96 36.928 874.048 149.952c113.024 113.024 86.784 411.008-113.152 610.944-199.936 199.936-497.92 226.112-610.944 113.152zm452.544-497.792 22.656-22.656a32 32 0 0 1 45.248 45.248l-22.656 22.656 45.248 45.248A32 32 0 1 1 647.744 512l-45.248-45.248L557.248 512l45.248 45.248a32 32 0 1 1-45.248 45.248L512 557.248l-45.248 45.248L512 647.744a32 32 0 1 1-45.248 45.248l-45.248-45.248-22.656 22.656a32 32 0 1 1-45.248-45.248l22.656-22.656-45.248-45.248A32 32 0 1 1 376.256 512l45.248 45.248L466.752 512l-45.248-45.248a32 32 0 1 1 45.248-45.248L512 466.752l45.248-45.248L512 376.256a32 32 0 0 1 45.248-45.248l45.248 45.248z"
    }, null, -1), iV = [fV];

    function dV(o, t, r, a, n, s) {
        return (0, Wt.openBlock)(), (0, Wt.createElementBlock)("svg", _V, iV)
    }

    var Ml = e(Dl, [["render", dV], ["__file", "soccer.vue"]]);
    var Nl = {name: "SoldOut"};
    var It = c(l());
    var uV = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, hV = (0, It.createElementVNode)("path", {
        fill: "currentColor",
        d: "M704 288h131.072a32 32 0 0 1 31.808 28.8L886.4 512h-64.384l-16-160H704v96a32 32 0 1 1-64 0v-96H384v96a32 32 0 0 1-64 0v-96H217.92l-51.2 512H512v64H131.328a32 32 0 0 1-31.808-35.2l57.6-576a32 32 0 0 1 31.808-28.8H320v-22.336C320 154.688 405.504 64 512 64s192 90.688 192 201.664v22.4zm-64 0v-22.336C640 189.248 582.272 128 512 128c-70.272 0-128 61.248-128 137.664v22.4h256zm201.408 476.16a32 32 0 1 1 45.248 45.184l-128 128a32 32 0 0 1-45.248 0l-128-128a32 32 0 1 1 45.248-45.248L704 837.504V608a32 32 0 1 1 64 0v229.504l73.408-73.408z"
    }, null, -1), xV = [hV];

    function vV(o, t, r, a, n, s) {
        return (0, It.openBlock)(), (0, It.createElementBlock)("svg", uV, xV)
    }

    var yl = e(Nl, [["render", vV], ["__file", "sold-out.vue"]]);
    var Ll = {name: "SortDown"};
    var Zt = c(l());
    var wV = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, BV = (0, Zt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M576 96v709.568L333.312 562.816A32 32 0 1 0 288 608l297.408 297.344A32 32 0 0 0 640 882.688V96a32 32 0 0 0-64 0z"
    }, null, -1), kV = [BV];

    function CV(o, t, r, a, n, s) {
        return (0, Zt.openBlock)(), (0, Zt.createElementBlock)("svg", wV, kV)
    }

    var Al = e(Ll, [["render", CV], ["__file", "sort-down.vue"]]);
    var Sl = {name: "SortUp"};
    var Kt = c(l());
    var EV = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, $V = (0, Kt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M384 141.248V928a32 32 0 1 0 64 0V218.56l242.688 242.688A32 32 0 1 0 736 416L438.592 118.656A32 32 0 0 0 384 141.248z"
    }, null, -1), VV = [$V];

    function zV(o, t, r, a, n, s) {
        return (0, Kt.openBlock)(), (0, Kt.createElementBlock)("svg", EV, VV)
    }

    var ql = e(Sl, [["render", zV], ["__file", "sort-up.vue"]]);
    var Fl = {name: "Sort"};
    var Qt = c(l());
    var gV = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, HV = (0, Qt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M384 96a32 32 0 0 1 64 0v786.752a32 32 0 0 1-54.592 22.656L95.936 608a32 32 0 0 1 0-45.312h.128a32 32 0 0 1 45.184 0L384 805.632V96zm192 45.248a32 32 0 0 1 54.592-22.592L928.064 416a32 32 0 0 1 0 45.312h-.128a32 32 0 0 1-45.184 0L640 218.496V928a32 32 0 1 1-64 0V141.248z"
    }, null, -1), DV = [HV];

    function MV(o, t, r, a, n, s) {
        return (0, Qt.openBlock)(), (0, Qt.createElementBlock)("svg", gV, DV)
    }

    var bl = e(Fl, [["render", MV], ["__file", "sort.vue"]]);
    var Pl = {name: "Stamp"};
    var jt = c(l());
    var NV = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, yV = (0, jt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M624 475.968V640h144a128 128 0 0 1 128 128H128a128 128 0 0 1 128-128h144V475.968a192 192 0 1 1 224 0zM128 896v-64h768v64H128z"
    }, null, -1), LV = [yV];

    function AV(o, t, r, a, n, s) {
        return (0, jt.openBlock)(), (0, jt.createElementBlock)("svg", NV, LV)
    }

    var Rl = e(Pl, [["render", AV], ["__file", "stamp.vue"]]);
    var Tl = {name: "StarFilled"};
    var Jt = c(l());
    var SV = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, qV = (0, Jt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M283.84 867.84 512 747.776l228.16 119.936a6.4 6.4 0 0 0 9.28-6.72l-43.52-254.08 184.512-179.904a6.4 6.4 0 0 0-3.52-10.88l-255.104-37.12L517.76 147.904a6.4 6.4 0 0 0-11.52 0L392.192 379.072l-255.104 37.12a6.4 6.4 0 0 0-3.52 10.88L318.08 606.976l-43.584 254.08a6.4 6.4 0 0 0 9.28 6.72z"
    }, null, -1), FV = [qV];

    function bV(o, t, r, a, n, s) {
        return (0, Jt.openBlock)(), (0, Jt.createElementBlock)("svg", SV, FV)
    }

    var Ol = e(Tl, [["render", bV], ["__file", "star-filled.vue"]]);
    var Gl = {name: "Star"};
    var Xt = c(l());
    var PV = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, RV = (0, Xt.createElementVNode)("path", {
        fill: "currentColor",
        d: "m512 747.84 228.16 119.936a6.4 6.4 0 0 0 9.28-6.72l-43.52-254.08 184.512-179.904a6.4 6.4 0 0 0-3.52-10.88l-255.104-37.12L517.76 147.904a6.4 6.4 0 0 0-11.52 0L392.192 379.072l-255.104 37.12a6.4 6.4 0 0 0-3.52 10.88L318.08 606.976l-43.584 254.08a6.4 6.4 0 0 0 9.28 6.72L512 747.84zM313.6 924.48a70.4 70.4 0 0 1-102.144-74.24l37.888-220.928L88.96 472.96A70.4 70.4 0 0 1 128 352.896l221.76-32.256 99.2-200.96a70.4 70.4 0 0 1 126.208 0l99.2 200.96 221.824 32.256a70.4 70.4 0 0 1 39.04 120.064L774.72 629.376l37.888 220.928a70.4 70.4 0 0 1-102.144 74.24L512 820.096l-198.4 104.32z"
    }, null, -1), TV = [RV];

    function OV(o, t, r, a, n, s) {
        return (0, Xt.openBlock)(), (0, Xt.createElementBlock)("svg", PV, TV)
    }

    var Ul = e(Gl, [["render", OV], ["__file", "star.vue"]]);
    var Wl = {name: "Stopwatch"};
    var ye = c(l());
    var GV = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, UV = (0, ye.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 896a384 384 0 1 0 0-768 384 384 0 0 0 0 768zm0 64a448 448 0 1 1 0-896 448 448 0 0 1 0 896z"
    }, null, -1), WV = (0, ye.createElementVNode)("path", {
        fill: "currentColor",
        d: "M672 234.88c-39.168 174.464-80 298.624-122.688 372.48-64 110.848-202.624 30.848-138.624-80C453.376 453.44 540.48 355.968 672 234.816z"
    }, null, -1), IV = [UV, WV];

    function ZV(o, t, r, a, n, s) {
        return (0, ye.openBlock)(), (0, ye.createElementBlock)("svg", GV, IV)
    }

    var Il = e(Wl, [["render", ZV], ["__file", "stopwatch.vue"]]);
    var Zl = {name: "SuccessFilled"};
    var Yt = c(l());
    var KV = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, QV = (0, Yt.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 64a448 448 0 1 1 0 896 448 448 0 0 1 0-896zm-55.808 536.384-99.52-99.584a38.4 38.4 0 1 0-54.336 54.336l126.72 126.72a38.272 38.272 0 0 0 54.336 0l262.4-262.464a38.4 38.4 0 1 0-54.272-54.336L456.192 600.384z"
    }, null, -1), jV = [QV];

    function JV(o, t, r, a, n, s) {
        return (0, Yt.openBlock)(), (0, Yt.createElementBlock)("svg", KV, jV)
    }

    var Kl = e(Zl, [["render", JV], ["__file", "success-filled.vue"]]);
    var Ql = {name: "Sugar"};
    var e0 = c(l());
    var XV = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, YV = (0, e0.createElementVNode)("path", {
        fill: "currentColor",
        d: "m801.728 349.184 4.48 4.48a128 128 0 0 1 0 180.992L534.656 806.144a128 128 0 0 1-181.056 0l-4.48-4.48-19.392 109.696a64 64 0 0 1-108.288 34.176L78.464 802.56a64 64 0 0 1 34.176-108.288l109.76-19.328-4.544-4.544a128 128 0 0 1 0-181.056l271.488-271.488a128 128 0 0 1 181.056 0l4.48 4.48 19.392-109.504a64 64 0 0 1 108.352-34.048l142.592 143.04a64 64 0 0 1-34.24 108.16l-109.248 19.2zm-548.8 198.72h447.168v2.24l60.8-60.8a63.808 63.808 0 0 0 18.752-44.416h-426.88l-89.664 89.728a64.064 64.064 0 0 0-10.24 13.248zm0 64c2.752 4.736 6.144 9.152 10.176 13.248l135.744 135.744a64 64 0 0 0 90.496 0L638.4 611.904H252.928zm490.048-230.976L625.152 263.104a64 64 0 0 0-90.496 0L416.768 380.928h326.208zM123.712 757.312l142.976 142.976 24.32-137.6a25.6 25.6 0 0 0-29.696-29.632l-137.6 24.256zm633.6-633.344-24.32 137.472a25.6 25.6 0 0 0 29.632 29.632l137.28-24.064-142.656-143.04z"
    }, null, -1), ez = [YV];

    function oz(o, t, r, a, n, s) {
        return (0, e0.openBlock)(), (0, e0.createElementBlock)("svg", XV, ez)
    }

    var jl = e(Ql, [["render", oz], ["__file", "sugar.vue"]]);
    var Jl = {name: "SuitcaseLine"};
    var o0 = c(l());
    var tz = {
        xmlns: "http://www.w3.org/2000/svg",
        "xml:space": "preserve",
        style: {"enable-background": "new 0 0 1024 1024"},
        viewBox: "0 0 1024 1024"
    }, rz = (0, o0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M922.5 229.5c-24.32-24.34-54.49-36.84-90.5-37.5H704v-64c-.68-17.98-7.02-32.98-19.01-44.99S658.01 64.66 640 64H384c-17.98.68-32.98 7.02-44.99 19.01S320.66 110 320 128v64H192c-35.99.68-66.16 13.18-90.5 37.5C77.16 253.82 64.66 283.99 64 320v448c.68 35.99 13.18 66.16 37.5 90.5s54.49 36.84 90.5 37.5h640c35.99-.68 66.16-13.18 90.5-37.5s36.84-54.49 37.5-90.5V320c-.68-35.99-13.18-66.16-37.5-90.5zM384 128h256v64H384v-64zM256 832h-64c-17.98-.68-32.98-7.02-44.99-19.01S128.66 786.01 128 768V448h128v384zm448 0H320V448h384v384zm192-64c-.68 17.98-7.02 32.98-19.01 44.99S850.01 831.34 832 832h-64V448h128v320zm0-384H128v-64c.69-17.98 7.02-32.98 19.01-44.99S173.99 256.66 192 256h640c17.98.69 32.98 7.02 44.99 19.01S895.34 301.99 896 320v64z"
    }, null, -1), nz = [rz];

    function az(o, t, r, a, n, s) {
        return (0, o0.openBlock)(), (0, o0.createElementBlock)("svg", tz, nz)
    }

    var Xl = e(Jl, [["render", az], ["__file", "suitcase-line.vue"]]);
    var Yl = {name: "Suitcase"};
    var Le = c(l());
    var lz = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, cz = (0, Le.createElementVNode)("path", {
        fill: "currentColor",
        d: "M128 384h768v-64a64 64 0 0 0-64-64H192a64 64 0 0 0-64 64v64zm0 64v320a64 64 0 0 0 64 64h640a64 64 0 0 0 64-64V448H128zm64-256h640a128 128 0 0 1 128 128v448a128 128 0 0 1-128 128H192A128 128 0 0 1 64 768V320a128 128 0 0 1 128-128z"
    }, null, -1), sz = (0, Le.createElementVNode)("path", {
        fill: "currentColor",
        d: "M384 128v64h256v-64H384zm0-64h256a64 64 0 0 1 64 64v64a64 64 0 0 1-64 64H384a64 64 0 0 1-64-64v-64a64 64 0 0 1 64-64z"
    }, null, -1), mz = [cz, sz];

    function pz(o, t, r, a, n, s) {
        return (0, Le.openBlock)(), (0, Le.createElementBlock)("svg", lz, mz)
    }

    var ec = e(Yl, [["render", pz], ["__file", "suitcase.vue"]]);
    var oc = {name: "Sunny"};
    var t0 = c(l());
    var _z = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, fz = (0, t0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 704a192 192 0 1 0 0-384 192 192 0 0 0 0 384zm0 64a256 256 0 1 1 0-512 256 256 0 0 1 0 512zm0-704a32 32 0 0 1 32 32v64a32 32 0 0 1-64 0V96a32 32 0 0 1 32-32zm0 768a32 32 0 0 1 32 32v64a32 32 0 1 1-64 0v-64a32 32 0 0 1 32-32zM195.2 195.2a32 32 0 0 1 45.248 0l45.248 45.248a32 32 0 1 1-45.248 45.248L195.2 240.448a32 32 0 0 1 0-45.248zm543.104 543.104a32 32 0 0 1 45.248 0l45.248 45.248a32 32 0 0 1-45.248 45.248l-45.248-45.248a32 32 0 0 1 0-45.248zM64 512a32 32 0 0 1 32-32h64a32 32 0 0 1 0 64H96a32 32 0 0 1-32-32zm768 0a32 32 0 0 1 32-32h64a32 32 0 1 1 0 64h-64a32 32 0 0 1-32-32zM195.2 828.8a32 32 0 0 1 0-45.248l45.248-45.248a32 32 0 0 1 45.248 45.248L240.448 828.8a32 32 0 0 1-45.248 0zm543.104-543.104a32 32 0 0 1 0-45.248l45.248-45.248a32 32 0 0 1 45.248 45.248l-45.248 45.248a32 32 0 0 1-45.248 0z"
    }, null, -1), iz = [fz];

    function dz(o, t, r, a, n, s) {
        return (0, t0.openBlock)(), (0, t0.createElementBlock)("svg", _z, iz)
    }

    var tc = e(oc, [["render", dz], ["__file", "sunny.vue"]]);
    var rc = {name: "Sunrise"};
    var r0 = c(l());
    var uz = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, hz = (0, r0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M32 768h960a32 32 0 1 1 0 64H32a32 32 0 1 1 0-64zm129.408-96a352 352 0 0 1 701.184 0h-64.32a288 288 0 0 0-572.544 0h-64.32zM512 128a32 32 0 0 1 32 32v96a32 32 0 0 1-64 0v-96a32 32 0 0 1 32-32zm407.296 168.704a32 32 0 0 1 0 45.248l-67.84 67.84a32 32 0 1 1-45.248-45.248l67.84-67.84a32 32 0 0 1 45.248 0zm-814.592 0a32 32 0 0 1 45.248 0l67.84 67.84a32 32 0 1 1-45.248 45.248l-67.84-67.84a32 32 0 0 1 0-45.248z"
    }, null, -1), xz = [hz];

    function vz(o, t, r, a, n, s) {
        return (0, r0.openBlock)(), (0, r0.createElementBlock)("svg", uz, xz)
    }

    var nc = e(rc, [["render", vz], ["__file", "sunrise.vue"]]);
    var ac = {name: "Sunset"};
    var n0 = c(l());
    var wz = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Bz = (0, n0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M82.56 640a448 448 0 1 1 858.88 0h-67.2a384 384 0 1 0-724.288 0H82.56zM32 704h960q32 0 32 32t-32 32H32q-32 0-32-32t32-32zm256 128h448q32 0 32 32t-32 32H288q-32 0-32-32t32-32z"
    }, null, -1), kz = [Bz];

    function Cz(o, t, r, a, n, s) {
        return (0, n0.openBlock)(), (0, n0.createElementBlock)("svg", wz, kz)
    }

    var lc = e(ac, [["render", Cz], ["__file", "sunset.vue"]]);
    var cc = {name: "SwitchButton"};
    var Ae = c(l());
    var Ez = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, $z = (0, Ae.createElementVNode)("path", {
        fill: "currentColor",
        d: "M352 159.872V230.4a352 352 0 1 0 320 0v-70.528A416.128 416.128 0 0 1 512 960a416 416 0 0 1-160-800.128z"
    }, null, -1), Vz = (0, Ae.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 64q32 0 32 32v320q0 32-32 32t-32-32V96q0-32 32-32z"
    }, null, -1), zz = [$z, Vz];

    function gz(o, t, r, a, n, s) {
        return (0, Ae.openBlock)(), (0, Ae.createElementBlock)("svg", Ez, zz)
    }

    var sc = e(cc, [["render", gz], ["__file", "switch-button.vue"]]);
    var mc = {name: "SwitchFilled"};
    var Se = c(l());
    var Hz = {
        xmlns: "http://www.w3.org/2000/svg",
        "xml:space": "preserve",
        style: {"enable-background": "new 0 0 1024 1024"},
        viewBox: "0 0 1024 1024"
    }, Dz = (0, Se.createElementVNode)("path", {
        fill: "currentColor",
        d: "M247.47 358.4v.04c.07 19.17 7.72 37.53 21.27 51.09s31.92 21.2 51.09 21.27c39.86 0 72.41-32.6 72.41-72.4s-32.6-72.36-72.41-72.36-72.36 32.55-72.36 72.36z"
    }, null, -1), Mz = (0, Se.createElementVNode)("path", {
        fill: "currentColor",
        d: "M492.38 128H324.7c-52.16 0-102.19 20.73-139.08 57.61a196.655 196.655 0 0 0-57.61 139.08V698.7c-.01 25.84 5.08 51.42 14.96 75.29s24.36 45.56 42.63 63.83 39.95 32.76 63.82 42.65a196.67 196.67 0 0 0 75.28 14.98h167.68c3.03 0 5.46-2.43 5.46-5.42V133.42c.6-2.99-1.83-5.42-5.46-5.42zm-56.11 705.88H324.7c-17.76.13-35.36-3.33-51.75-10.18s-31.22-16.94-43.61-29.67c-25.3-25.35-39.81-59.1-39.81-95.32V324.69c-.13-17.75 3.33-35.35 10.17-51.74a131.695 131.695 0 0 1 29.64-43.62c25.39-25.3 59.14-39.81 95.36-39.81h111.57v644.36zm402.12-647.67a196.655 196.655 0 0 0-139.08-57.61H580.48c-3.03 0-4.82 2.43-4.82 4.82v757.16c-.6 2.99 1.79 5.42 5.42 5.42h118.23a196.69 196.69 0 0 0 139.08-57.61A196.655 196.655 0 0 0 896 699.31V325.29a196.69 196.69 0 0 0-57.61-139.08zm-111.3 441.92c-42.83 0-77.82-34.99-77.82-77.82s34.98-77.82 77.82-77.82c42.83 0 77.82 34.99 77.82 77.82s-34.99 77.82-77.82 77.82z"
    }, null, -1), Nz = [Dz, Mz];

    function yz(o, t, r, a, n, s) {
        return (0, Se.openBlock)(), (0, Se.createElementBlock)("svg", Hz, Nz)
    }

    var pc = e(mc, [["render", yz], ["__file", "switch-filled.vue"]]);
    var _c = {name: "Switch"};
    var a0 = c(l());
    var Lz = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Az = (0, a0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M118.656 438.656a32 32 0 0 1 0-45.248L416 96l4.48-3.776A32 32 0 0 1 461.248 96l3.712 4.48a32.064 32.064 0 0 1-3.712 40.832L218.56 384H928a32 32 0 1 1 0 64H141.248a32 32 0 0 1-22.592-9.344zM64 608a32 32 0 0 1 32-32h786.752a32 32 0 0 1 22.656 54.592L608 928l-4.48 3.776a32.064 32.064 0 0 1-40.832-49.024L805.632 640H96a32 32 0 0 1-32-32z"
    }, null, -1), Sz = [Az];

    function qz(o, t, r, a, n, s) {
        return (0, a0.openBlock)(), (0, a0.createElementBlock)("svg", Lz, Sz)
    }

    var fc = e(_c, [["render", qz], ["__file", "switch.vue"]]);
    var ic = {name: "TakeawayBox"};
    var l0 = c(l());
    var Fz = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, bz = (0, l0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M832 384H192v448h640V384zM96 320h832V128H96v192zm800 64v480a32 32 0 0 1-32 32H160a32 32 0 0 1-32-32V384H64a32 32 0 0 1-32-32V96a32 32 0 0 1 32-32h896a32 32 0 0 1 32 32v256a32 32 0 0 1-32 32h-64zM416 512h192a32 32 0 0 1 0 64H416a32 32 0 0 1 0-64z"
    }, null, -1), Pz = [bz];

    function Rz(o, t, r, a, n, s) {
        return (0, l0.openBlock)(), (0, l0.createElementBlock)("svg", Fz, Pz)
    }

    var dc = e(ic, [["render", Rz], ["__file", "takeaway-box.vue"]]);
    var uc = {name: "Ticket"};
    var c0 = c(l());
    var Tz = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Oz = (0, c0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M640 832H64V640a128 128 0 1 0 0-256V192h576v160h64V192h256v192a128 128 0 1 0 0 256v192H704V672h-64v160zm0-416v192h64V416h-64z"
    }, null, -1), Gz = [Oz];

    function Uz(o, t, r, a, n, s) {
        return (0, c0.openBlock)(), (0, c0.createElementBlock)("svg", Tz, Gz)
    }

    var hc = e(uc, [["render", Uz], ["__file", "ticket.vue"]]);
    var xc = {name: "Tickets"};
    var s0 = c(l());
    var Wz = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Iz = (0, s0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M192 128v768h640V128H192zm-32-64h704a32 32 0 0 1 32 32v832a32 32 0 0 1-32 32H160a32 32 0 0 1-32-32V96a32 32 0 0 1 32-32zm160 448h384v64H320v-64zm0-192h192v64H320v-64zm0 384h384v64H320v-64z"
    }, null, -1), Zz = [Iz];

    function Kz(o, t, r, a, n, s) {
        return (0, s0.openBlock)(), (0, s0.createElementBlock)("svg", Wz, Zz)
    }

    var vc = e(xc, [["render", Kz], ["__file", "tickets.vue"]]);
    var wc = {name: "Timer"};
    var M = c(l());
    var Qz = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, jz = (0, M.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 896a320 320 0 1 0 0-640 320 320 0 0 0 0 640zm0 64a384 384 0 1 1 0-768 384 384 0 0 1 0 768z"
    }, null, -1), Jz = (0, M.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 320a32 32 0 0 1 32 32l-.512 224a32 32 0 1 1-64 0L480 352a32 32 0 0 1 32-32z"
    }, null, -1), Xz = (0, M.createElementVNode)("path", {
        fill: "currentColor",
        d: "M448 576a64 64 0 1 0 128 0 64 64 0 1 0-128 0zm96-448v128h-64V128h-96a32 32 0 0 1 0-64h256a32 32 0 1 1 0 64h-96z"
    }, null, -1), Yz = [jz, Jz, Xz];

    function eg(o, t, r, a, n, s) {
        return (0, M.openBlock)(), (0, M.createElementBlock)("svg", Qz, Yz)
    }

    var Bc = e(wc, [["render", eg], ["__file", "timer.vue"]]);
    var kc = {name: "ToiletPaper"};
    var qe = c(l());
    var og = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, tg = (0, qe.createElementVNode)("path", {
        fill: "currentColor",
        d: "M595.2 128H320a192 192 0 0 0-192 192v576h384V352c0-90.496 32.448-171.2 83.2-224zM736 64c123.712 0 224 128.96 224 288S859.712 640 736 640H576v320H64V320A256 256 0 0 1 320 64h416zM576 352v224h160c84.352 0 160-97.28 160-224s-75.648-224-160-224-160 97.28-160 224z"
    }, null, -1), rg = (0, qe.createElementVNode)("path", {
        fill: "currentColor",
        d: "M736 448c-35.328 0-64-43.008-64-96s28.672-96 64-96 64 43.008 64 96-28.672 96-64 96z"
    }, null, -1), ng = [tg, rg];

    function ag(o, t, r, a, n, s) {
        return (0, qe.openBlock)(), (0, qe.createElementBlock)("svg", og, ng)
    }

    var Cc = e(kc, [["render", ag], ["__file", "toilet-paper.vue"]]);
    var Ec = {name: "Tools"};
    var m0 = c(l());
    var lg = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, cg = (0, m0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M764.416 254.72a351.68 351.68 0 0 1 86.336 149.184H960v192.064H850.752a351.68 351.68 0 0 1-86.336 149.312l54.72 94.72-166.272 96-54.592-94.72a352.64 352.64 0 0 1-172.48 0L371.136 936l-166.272-96 54.72-94.72a351.68 351.68 0 0 1-86.336-149.312H64v-192h109.248a351.68 351.68 0 0 1 86.336-149.312L204.8 160l166.208-96h.192l54.656 94.592a352.64 352.64 0 0 1 172.48 0L652.8 64h.128L819.2 160l-54.72 94.72zM704 499.968a192 192 0 1 0-384 0 192 192 0 0 0 384 0z"
    }, null, -1), sg = [cg];

    function mg(o, t, r, a, n, s) {
        return (0, m0.openBlock)(), (0, m0.createElementBlock)("svg", lg, sg)
    }

    var $c = e(Ec, [["render", mg], ["__file", "tools.vue"]]);
    var Vc = {name: "TopLeft"};
    var Fe = c(l());
    var pg = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, _g = (0, Fe.createElementVNode)("path", {
        fill: "currentColor",
        d: "M256 256h416a32 32 0 1 0 0-64H224a32 32 0 0 0-32 32v448a32 32 0 0 0 64 0V256z"
    }, null, -1), fg = (0, Fe.createElementVNode)("path", {
        fill: "currentColor",
        d: "M246.656 201.344a32 32 0 0 0-45.312 45.312l544 544a32 32 0 0 0 45.312-45.312l-544-544z"
    }, null, -1), ig = [_g, fg];

    function dg(o, t, r, a, n, s) {
        return (0, Fe.openBlock)(), (0, Fe.createElementBlock)("svg", pg, ig)
    }

    var zc = e(Vc, [["render", dg], ["__file", "top-left.vue"]]);
    var gc = {name: "TopRight"};
    var be = c(l());
    var ug = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, hg = (0, be.createElementVNode)("path", {
        fill: "currentColor",
        d: "M768 256H353.6a32 32 0 1 1 0-64H800a32 32 0 0 1 32 32v448a32 32 0 0 1-64 0V256z"
    }, null, -1), xg = (0, be.createElementVNode)("path", {
        fill: "currentColor",
        d: "M777.344 201.344a32 32 0 0 1 45.312 45.312l-544 544a32 32 0 0 1-45.312-45.312l544-544z"
    }, null, -1), vg = [hg, xg];

    function wg(o, t, r, a, n, s) {
        return (0, be.openBlock)(), (0, be.createElementBlock)("svg", ug, vg)
    }

    var Hc = e(gc, [["render", wg], ["__file", "top-right.vue"]]);
    var Dc = {name: "Top"};
    var p0 = c(l());
    var Bg = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, kg = (0, p0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M572.235 205.282v600.365a30.118 30.118 0 1 1-60.235 0V205.282L292.382 438.633a28.913 28.913 0 0 1-42.646 0 33.43 33.43 0 0 1 0-45.236l271.058-288.045a28.913 28.913 0 0 1 42.647 0L834.5 393.397a33.43 33.43 0 0 1 0 45.176 28.913 28.913 0 0 1-42.647 0l-219.618-233.23z"
    }, null, -1), Cg = [kg];

    function Eg(o, t, r, a, n, s) {
        return (0, p0.openBlock)(), (0, p0.createElementBlock)("svg", Bg, Cg)
    }

    var Mc = e(Dc, [["render", Eg], ["__file", "top.vue"]]);
    var Nc = {name: "TrendCharts"};
    var _0 = c(l());
    var $g = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Vg = (0, _0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M128 896V128h768v768H128zm291.712-327.296 128 102.4 180.16-201.792-47.744-42.624-139.84 156.608-128-102.4-180.16 201.792 47.744 42.624 139.84-156.608zM816 352a48 48 0 1 0-96 0 48 48 0 0 0 96 0z"
    }, null, -1), zg = [Vg];

    function gg(o, t, r, a, n, s) {
        return (0, _0.openBlock)(), (0, _0.createElementBlock)("svg", $g, zg)
    }

    var yc = e(Nc, [["render", gg], ["__file", "trend-charts.vue"]]);
    var Lc = {name: "TrophyBase"};
    var f0 = c(l());
    var Hg = {
        xmlns: "http://www.w3.org/2000/svg",
        "xml:space": "preserve",
        style: {"enable-background": "new 0 0 1024 1024"},
        viewBox: "0 0 1024 1024"
    }, Dg = (0, f0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M918.4 201.6c-6.4-6.4-12.8-9.6-22.4-9.6H768V96c0-9.6-3.2-16-9.6-22.4C752 67.2 745.6 64 736 64H288c-9.6 0-16 3.2-22.4 9.6C259.2 80 256 86.4 256 96v96H128c-9.6 0-16 3.2-22.4 9.6-6.4 6.4-9.6 16-9.6 22.4 3.2 108.8 25.6 185.6 64 224 34.4 34.4 77.56 55.65 127.65 61.99 10.91 20.44 24.78 39.25 41.95 56.41 40.86 40.86 91 65.47 150.4 71.9V768h-96c-9.6 0-16 3.2-22.4 9.6-6.4 6.4-9.6 12.8-9.6 22.4s3.2 16 9.6 22.4c6.4 6.4 12.8 9.6 22.4 9.6h256c9.6 0 16-3.2 22.4-9.6 6.4-6.4 9.6-12.8 9.6-22.4s-3.2-16-9.6-22.4c-6.4-6.4-12.8-9.6-22.4-9.6h-96V637.26c59.4-7.71 109.54-30.01 150.4-70.86 17.2-17.2 31.51-36.06 42.81-56.55 48.93-6.51 90.02-27.7 126.79-61.85 38.4-38.4 60.8-112 64-224 0-6.4-3.2-16-9.6-22.4zM256 438.4c-19.2-6.4-35.2-19.2-51.2-35.2-22.4-22.4-35.2-70.4-41.6-147.2H256v182.4zm390.4 80C608 553.6 566.4 576 512 576s-99.2-19.2-134.4-57.6C342.4 480 320 438.4 320 384V128h384v256c0 54.4-19.2 99.2-57.6 134.4zm172.8-115.2c-16 16-32 25.6-51.2 35.2V256h92.8c-6.4 76.8-19.2 124.8-41.6 147.2zM768 896H256c-9.6 0-16 3.2-22.4 9.6-6.4 6.4-9.6 12.8-9.6 22.4s3.2 16 9.6 22.4c6.4 6.4 12.8 9.6 22.4 9.6h512c9.6 0 16-3.2 22.4-9.6 6.4-6.4 9.6-12.8 9.6-22.4s-3.2-16-9.6-22.4c-6.4-6.4-12.8-9.6-22.4-9.6z"
    }, null, -1), Mg = [Dg];

    function Ng(o, t, r, a, n, s) {
        return (0, f0.openBlock)(), (0, f0.createElementBlock)("svg", Hg, Mg)
    }

    var Ac = e(Lc, [["render", Ng], ["__file", "trophy-base.vue"]]);
    var Sc = {name: "Trophy"};
    var i0 = c(l());
    var yg = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Lg = (0, i0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M480 896V702.08A256.256 256.256 0 0 1 264.064 512h-32.64a96 96 0 0 1-91.968-68.416L93.632 290.88a76.8 76.8 0 0 1 73.6-98.88H256V96a32 32 0 0 1 32-32h448a32 32 0 0 1 32 32v96h88.768a76.8 76.8 0 0 1 73.6 98.88L884.48 443.52A96 96 0 0 1 792.576 512h-32.64A256.256 256.256 0 0 1 544 702.08V896h128a32 32 0 1 1 0 64H352a32 32 0 1 1 0-64h128zm224-448V128H320v320a192 192 0 1 0 384 0zm64 0h24.576a32 32 0 0 0 30.656-22.784l45.824-152.768A12.8 12.8 0 0 0 856.768 256H768v192zm-512 0V256h-88.768a12.8 12.8 0 0 0-12.288 16.448l45.824 152.768A32 32 0 0 0 231.424 448H256z"
    }, null, -1), Ag = [Lg];

    function Sg(o, t, r, a, n, s) {
        return (0, i0.openBlock)(), (0, i0.createElementBlock)("svg", yg, Ag)
    }

    var qc = e(Sc, [["render", Sg], ["__file", "trophy.vue"]]);
    var Fc = {name: "TurnOff"};
    var Pe = c(l());
    var qg = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Fg = (0, Pe.createElementVNode)("path", {
        fill: "currentColor",
        d: "M329.956 257.138a254.862 254.862 0 0 0 0 509.724h364.088a254.862 254.862 0 0 0 0-509.724H329.956zm0-72.818h364.088a327.68 327.68 0 1 1 0 655.36H329.956a327.68 327.68 0 1 1 0-655.36z"
    }, null, -1), bg = (0, Pe.createElementVNode)("path", {
        fill: "currentColor",
        d: "M329.956 621.227a109.227 109.227 0 1 0 0-218.454 109.227 109.227 0 0 0 0 218.454zm0 72.817a182.044 182.044 0 1 1 0-364.088 182.044 182.044 0 0 1 0 364.088z"
    }, null, -1), Pg = [Fg, bg];

    function Rg(o, t, r, a, n, s) {
        return (0, Pe.openBlock)(), (0, Pe.createElementBlock)("svg", qg, Pg)
    }

    var bc = e(Fc, [["render", Rg], ["__file", "turn-off.vue"]]);
    var Pc = {name: "Umbrella"};
    var d0 = c(l());
    var Tg = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Og = (0, d0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M320 768a32 32 0 1 1 64 0 64 64 0 0 0 128 0V512H64a448 448 0 1 1 896 0H576v256a128 128 0 1 1-256 0zm570.688-320a384.128 384.128 0 0 0-757.376 0h757.376z"
    }, null, -1), Gg = [Og];

    function Ug(o, t, r, a, n, s) {
        return (0, d0.openBlock)(), (0, d0.createElementBlock)("svg", Tg, Gg)
    }

    var Rc = e(Pc, [["render", Ug], ["__file", "umbrella.vue"]]);
    var Tc = {name: "Unlock"};
    var Re = c(l());
    var Wg = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Ig = (0, Re.createElementVNode)("path", {
        fill: "currentColor",
        d: "M224 448a32 32 0 0 0-32 32v384a32 32 0 0 0 32 32h576a32 32 0 0 0 32-32V480a32 32 0 0 0-32-32H224zm0-64h576a96 96 0 0 1 96 96v384a96 96 0 0 1-96 96H224a96 96 0 0 1-96-96V480a96 96 0 0 1 96-96z"
    }, null, -1), Zg = (0, Re.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 544a32 32 0 0 1 32 32v192a32 32 0 1 1-64 0V576a32 32 0 0 1 32-32zm178.304-295.296A192.064 192.064 0 0 0 320 320v64h352l96 38.4V448H256V320a256 256 0 0 1 493.76-95.104l-59.456 23.808z"
    }, null, -1), Kg = [Ig, Zg];

    function Qg(o, t, r, a, n, s) {
        return (0, Re.openBlock)(), (0, Re.createElementBlock)("svg", Wg, Kg)
    }

    var Oc = e(Tc, [["render", Qg], ["__file", "unlock.vue"]]);
    var Gc = {name: "UploadFilled"};
    var u0 = c(l());
    var jg = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, Jg = (0, u0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M544 864V672h128L512 480 352 672h128v192H320v-1.6c-5.376.32-10.496 1.6-16 1.6A240 240 0 0 1 64 624c0-123.136 93.12-223.488 212.608-237.248A239.808 239.808 0 0 1 512 192a239.872 239.872 0 0 1 235.456 194.752c119.488 13.76 212.48 114.112 212.48 237.248a240 240 0 0 1-240 240c-5.376 0-10.56-1.28-16-1.6v1.6H544z"
    }, null, -1), Xg = [Jg];

    function Yg(o, t, r, a, n, s) {
        return (0, u0.openBlock)(), (0, u0.createElementBlock)("svg", jg, Xg)
    }

    var Uc = e(Gc, [["render", Yg], ["__file", "upload-filled.vue"]]);
    var Wc = {name: "Upload"};
    var h0 = c(l());
    var eH = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, oH = (0, h0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M160 832h704a32 32 0 1 1 0 64H160a32 32 0 1 1 0-64zm384-578.304V704h-64V247.296L237.248 490.048 192 444.8 508.8 128l316.8 316.8-45.312 45.248L544 253.696z"
    }, null, -1), tH = [oH];

    function rH(o, t, r, a, n, s) {
        return (0, h0.openBlock)(), (0, h0.createElementBlock)("svg", eH, tH)
    }

    var Ic = e(Wc, [["render", rH], ["__file", "upload.vue"]]);
    var Zc = {name: "UserFilled"};
    var x0 = c(l());
    var nH = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, aH = (0, x0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M288 320a224 224 0 1 0 448 0 224 224 0 1 0-448 0zm544 608H160a32 32 0 0 1-32-32v-96a160 160 0 0 1 160-160h448a160 160 0 0 1 160 160v96a32 32 0 0 1-32 32z"
    }, null, -1), lH = [aH];

    function cH(o, t, r, a, n, s) {
        return (0, x0.openBlock)(), (0, x0.createElementBlock)("svg", nH, lH)
    }

    var Kc = e(Zc, [["render", cH], ["__file", "user-filled.vue"]]);
    var Qc = {name: "User"};
    var v0 = c(l());
    var sH = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, mH = (0, v0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 512a192 192 0 1 0 0-384 192 192 0 0 0 0 384zm0 64a256 256 0 1 1 0-512 256 256 0 0 1 0 512zm320 320v-96a96 96 0 0 0-96-96H288a96 96 0 0 0-96 96v96a32 32 0 1 1-64 0v-96a160 160 0 0 1 160-160h448a160 160 0 0 1 160 160v96a32 32 0 1 1-64 0z"
    }, null, -1), pH = [mH];

    function _H(o, t, r, a, n, s) {
        return (0, v0.openBlock)(), (0, v0.createElementBlock)("svg", sH, pH)
    }

    var jc = e(Qc, [["render", _H], ["__file", "user.vue"]]);
    var Jc = {name: "Van"};
    var w0 = c(l());
    var fH = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, iH = (0, w0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M128.896 736H96a32 32 0 0 1-32-32V224a32 32 0 0 1 32-32h576a32 32 0 0 1 32 32v96h164.544a32 32 0 0 1 31.616 27.136l54.144 352A32 32 0 0 1 922.688 736h-91.52a144 144 0 1 1-286.272 0H415.104a144 144 0 1 1-286.272 0zm23.36-64a143.872 143.872 0 0 1 239.488 0H568.32c17.088-25.6 42.24-45.376 71.744-55.808V256H128v416h24.256zm655.488 0h77.632l-19.648-128H704v64.896A144 144 0 0 1 807.744 672zm48.128-192-14.72-96H704v96h151.872zM688 832a80 80 0 1 0 0-160 80 80 0 0 0 0 160zm-416 0a80 80 0 1 0 0-160 80 80 0 0 0 0 160z"
    }, null, -1), dH = [iH];

    function uH(o, t, r, a, n, s) {
        return (0, w0.openBlock)(), (0, w0.createElementBlock)("svg", fH, dH)
    }

    var Xc = e(Jc, [["render", uH], ["__file", "van.vue"]]);
    var Yc = {name: "VideoCameraFilled"};
    var B0 = c(l());
    var hH = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, xH = (0, B0.createElementVNode)("path", {
        fill: "currentColor",
        d: "m768 576 192-64v320l-192-64v96a32 32 0 0 1-32 32H96a32 32 0 0 1-32-32V480a32 32 0 0 1 32-32h640a32 32 0 0 1 32 32v96zM192 768v64h384v-64H192zm192-480a160 160 0 0 1 320 0 160 160 0 0 1-320 0zm64 0a96 96 0 1 0 192.064-.064A96 96 0 0 0 448 288zm-320 32a128 128 0 1 1 256.064.064A128 128 0 0 1 128 320zm64 0a64 64 0 1 0 128 0 64 64 0 0 0-128 0z"
    }, null, -1), vH = [xH];

    function wH(o, t, r, a, n, s) {
        return (0, B0.openBlock)(), (0, B0.createElementBlock)("svg", hH, vH)
    }

    var es = e(Yc, [["render", wH], ["__file", "video-camera-filled.vue"]]);
    var os = {name: "VideoCamera"};
    var k0 = c(l());
    var BH = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, kH = (0, k0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M704 768V256H128v512h576zm64-416 192-96v512l-192-96v128a32 32 0 0 1-32 32H96a32 32 0 0 1-32-32V224a32 32 0 0 1 32-32h640a32 32 0 0 1 32 32v128zm0 71.552v176.896l128 64V359.552l-128 64zM192 320h192v64H192v-64z"
    }, null, -1), CH = [kH];

    function EH(o, t, r, a, n, s) {
        return (0, k0.openBlock)(), (0, k0.createElementBlock)("svg", BH, CH)
    }

    var ts = e(os, [["render", EH], ["__file", "video-camera.vue"]]);
    var rs = {name: "VideoPause"};
    var C0 = c(l());
    var $H = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, VH = (0, C0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 64a448 448 0 1 1 0 896 448 448 0 0 1 0-896zm0 832a384 384 0 0 0 0-768 384 384 0 0 0 0 768zm-96-544q32 0 32 32v256q0 32-32 32t-32-32V384q0-32 32-32zm192 0q32 0 32 32v256q0 32-32 32t-32-32V384q0-32 32-32z"
    }, null, -1), zH = [VH];

    function gH(o, t, r, a, n, s) {
        return (0, C0.openBlock)(), (0, C0.createElementBlock)("svg", $H, zH)
    }

    var ns = e(rs, [["render", gH], ["__file", "video-pause.vue"]]);
    var as = {name: "VideoPlay"};
    var E0 = c(l());
    var HH = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, DH = (0, E0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 64a448 448 0 1 1 0 896 448 448 0 0 1 0-896zm0 832a384 384 0 0 0 0-768 384 384 0 0 0 0 768zm-48-247.616L668.608 512 464 375.616v272.768zm10.624-342.656 249.472 166.336a48 48 0 0 1 0 79.872L474.624 718.272A48 48 0 0 1 400 678.336V345.6a48 48 0 0 1 74.624-39.936z"
    }, null, -1), MH = [DH];

    function NH(o, t, r, a, n, s) {
        return (0, E0.openBlock)(), (0, E0.createElementBlock)("svg", HH, MH)
    }

    var ls = e(as, [["render", NH], ["__file", "video-play.vue"]]);
    var cs = {name: "View"};
    var $0 = c(l());
    var yH = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, LH = (0, $0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 160c320 0 512 352 512 352S832 864 512 864 0 512 0 512s192-352 512-352zm0 64c-225.28 0-384.128 208.064-436.8 288 52.608 79.872 211.456 288 436.8 288 225.28 0 384.128-208.064 436.8-288-52.608-79.872-211.456-288-436.8-288zm0 64a224 224 0 1 1 0 448 224 224 0 0 1 0-448zm0 64a160.192 160.192 0 0 0-160 160c0 88.192 71.744 160 160 160s160-71.808 160-160-71.744-160-160-160z"
    }, null, -1), AH = [LH];

    function SH(o, t, r, a, n, s) {
        return (0, $0.openBlock)(), (0, $0.createElementBlock)("svg", yH, AH)
    }

    var ss = e(cs, [["render", SH], ["__file", "view.vue"]]);
    var ms = {name: "WalletFilled"};
    var V0 = c(l());
    var qH = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, FH = (0, V0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M688 512a112 112 0 1 0 0 224h208v160H128V352h768v160H688zm32 160h-32a48 48 0 0 1 0-96h32a48 48 0 0 1 0 96zm-80-544 128 160H384l256-160z"
    }, null, -1), bH = [FH];

    function PH(o, t, r, a, n, s) {
        return (0, V0.openBlock)(), (0, V0.createElementBlock)("svg", qH, bH)
    }

    var ps = e(ms, [["render", PH], ["__file", "wallet-filled.vue"]]);
    var _s = {name: "Wallet"};
    var N = c(l());
    var RH = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, TH = (0, N.createElementVNode)("path", {
        fill: "currentColor",
        d: "M640 288h-64V128H128v704h384v32a32 32 0 0 0 32 32H96a32 32 0 0 1-32-32V96a32 32 0 0 1 32-32h512a32 32 0 0 1 32 32v192z"
    }, null, -1), OH = (0, N.createElementVNode)("path", {
        fill: "currentColor",
        d: "M128 320v512h768V320H128zm-32-64h832a32 32 0 0 1 32 32v576a32 32 0 0 1-32 32H96a32 32 0 0 1-32-32V288a32 32 0 0 1 32-32z"
    }, null, -1), GH = (0, N.createElementVNode)("path", {
        fill: "currentColor",
        d: "M704 640a64 64 0 1 1 0-128 64 64 0 0 1 0 128z"
    }, null, -1), UH = [TH, OH, GH];

    function WH(o, t, r, a, n, s) {
        return (0, N.openBlock)(), (0, N.createElementBlock)("svg", RH, UH)
    }

    var fs = e(_s, [["render", WH], ["__file", "wallet.vue"]]);
    var is = {name: "WarnTriangleFilled"};
    var z0 = c(l());
    var IH = {
        xmlns: "http://www.w3.org/2000/svg",
        "xml:space": "preserve",
        style: {"enable-background": "new 0 0 1024 1024"},
        viewBox: "0 0 1024 1024"
    }, ZH = (0, z0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M928.99 755.83 574.6 203.25c-12.89-20.16-36.76-32.58-62.6-32.58s-49.71 12.43-62.6 32.58L95.01 755.83c-12.91 20.12-12.9 44.91.01 65.03 12.92 20.12 36.78 32.51 62.59 32.49h708.78c25.82.01 49.68-12.37 62.59-32.49 12.91-20.12 12.92-44.91.01-65.03zM554.67 768h-85.33v-85.33h85.33V768zm0-426.67v298.66h-85.33V341.32l85.33.01z"
    }, null, -1), KH = [ZH];

    function QH(o, t, r, a, n, s) {
        return (0, z0.openBlock)(), (0, z0.createElementBlock)("svg", IH, KH)
    }

    var ds = e(is, [["render", QH], ["__file", "warn-triangle-filled.vue"]]);
    var us = {name: "WarningFilled"};
    var g0 = c(l());
    var jH = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, JH = (0, g0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 64a448 448 0 1 1 0 896 448 448 0 0 1 0-896zm0 192a58.432 58.432 0 0 0-58.24 63.744l23.36 256.384a35.072 35.072 0 0 0 69.76 0l23.296-256.384A58.432 58.432 0 0 0 512 256zm0 512a51.2 51.2 0 1 0 0-102.4 51.2 51.2 0 0 0 0 102.4z"
    }, null, -1), XH = [JH];

    function YH(o, t, r, a, n, s) {
        return (0, g0.openBlock)(), (0, g0.createElementBlock)("svg", jH, XH)
    }

    var hs = e(us, [["render", YH], ["__file", "warning-filled.vue"]]);
    var xs = {name: "Warning"};
    var H0 = c(l());
    var eD = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, oD = (0, H0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 64a448 448 0 1 1 0 896 448 448 0 0 1 0-896zm0 832a384 384 0 0 0 0-768 384 384 0 0 0 0 768zm48-176a48 48 0 1 1-96 0 48 48 0 0 1 96 0zm-48-464a32 32 0 0 1 32 32v288a32 32 0 0 1-64 0V288a32 32 0 0 1 32-32z"
    }, null, -1), tD = [oD];

    function rD(o, t, r, a, n, s) {
        return (0, H0.openBlock)(), (0, H0.createElementBlock)("svg", eD, tD)
    }

    var vs = e(xs, [["render", rD], ["__file", "warning.vue"]]);
    var ws = {name: "Watch"};
    var y = c(l());
    var nD = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, aD = (0, y.createElementVNode)("path", {
        fill: "currentColor",
        d: "M512 768a256 256 0 1 0 0-512 256 256 0 0 0 0 512zm0 64a320 320 0 1 1 0-640 320 320 0 0 1 0 640z"
    }, null, -1), lD = (0, y.createElementVNode)("path", {
        fill: "currentColor",
        d: "M480 352a32 32 0 0 1 32 32v160a32 32 0 0 1-64 0V384a32 32 0 0 1 32-32z"
    }, null, -1), cD = (0, y.createElementVNode)("path", {
        fill: "currentColor",
        d: "M480 512h128q32 0 32 32t-32 32H480q-32 0-32-32t32-32zm128-256V128H416v128h-64V64h320v192h-64zM416 768v128h192V768h64v192H352V768h64z"
    }, null, -1), sD = [aD, lD, cD];

    function mD(o, t, r, a, n, s) {
        return (0, y.openBlock)(), (0, y.createElementBlock)("svg", nD, sD)
    }

    var Bs = e(ws, [["render", mD], ["__file", "watch.vue"]]);
    var ks = {name: "Watermelon"};
    var D0 = c(l());
    var pD = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, _D = (0, D0.createElementVNode)("path", {
        fill: "currentColor",
        d: "m683.072 600.32-43.648 162.816-61.824-16.512 53.248-198.528L576 493.248l-158.4 158.4-45.248-45.248 158.4-158.4-55.616-55.616-198.528 53.248-16.512-61.824 162.816-43.648L282.752 200A384 384 0 0 0 824 741.248L683.072 600.32zm231.552 141.056a448 448 0 1 1-632-632l632 632z"
    }, null, -1), fD = [_D];

    function iD(o, t, r, a, n, s) {
        return (0, D0.openBlock)(), (0, D0.createElementBlock)("svg", pD, fD)
    }

    var Cs = e(ks, [["render", iD], ["__file", "watermelon.vue"]]);
    var Es = {name: "WindPower"};
    var M0 = c(l());
    var dD = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, uD = (0, M0.createElementVNode)("path", {
        fill: "currentColor",
        d: "M160 64q32 0 32 32v832q0 32-32 32t-32-32V96q0-32 32-32zm416 354.624 128-11.584V168.96l-128-11.52v261.12zm-64 5.824V151.552L320 134.08V160h-64V64l616.704 56.064A96 96 0 0 1 960 215.68v144.64a96 96 0 0 1-87.296 95.616L256 512V224h64v217.92l192-17.472zm256-23.232 98.88-8.96A32 32 0 0 0 896 360.32V215.68a32 32 0 0 0-29.12-31.872l-98.88-8.96v226.368z"
    }, null, -1), hD = [uD];

    function xD(o, t, r, a, n, s) {
        return (0, M0.openBlock)(), (0, M0.createElementBlock)("svg", dD, hD)
    }

    var $s = e(Es, [["render", xD], ["__file", "wind-power.vue"]]);
    var Vs = {name: "ZoomIn"};
    var N0 = c(l());
    var vD = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, wD = (0, N0.createElementVNode)("path", {
        fill: "currentColor",
        d: "m795.904 750.72 124.992 124.928a32 32 0 0 1-45.248 45.248L750.656 795.904a416 416 0 1 1 45.248-45.248zM480 832a352 352 0 1 0 0-704 352 352 0 0 0 0 704zm-32-384v-96a32 32 0 0 1 64 0v96h96a32 32 0 0 1 0 64h-96v96a32 32 0 0 1-64 0v-96h-96a32 32 0 0 1 0-64h96z"
    }, null, -1), BD = [wD];

    function kD(o, t, r, a, n, s) {
        return (0, N0.openBlock)(), (0, N0.createElementBlock)("svg", vD, BD)
    }

    var zs = e(Vs, [["render", kD], ["__file", "zoom-in.vue"]]);
    var gs = {name: "ZoomOut"};
    var y0 = c(l());
    var CD = {xmlns: "http://www.w3.org/2000/svg", viewBox: "0 0 1024 1024"}, ED = (0, y0.createElementVNode)("path", {
        fill: "currentColor",
        d: "m795.904 750.72 124.992 124.928a32 32 0 0 1-45.248 45.248L750.656 795.904a416 416 0 1 1 45.248-45.248zM480 832a352 352 0 1 0 0-704 352 352 0 0 0 0 704zM352 448h256a32 32 0 0 1 0 64H352a32 32 0 0 1 0-64z"
    }, null, -1), $D = [ED];

    function VD(o, t, r, a, n, s) {
        return (0, y0.openBlock)(), (0, y0.createElementBlock)("svg", CD, $D)
    }

    var Hs = e(gs, [["render", VD], ["__file", "zoom-out.vue"]]);
    return qs(zD);
})();